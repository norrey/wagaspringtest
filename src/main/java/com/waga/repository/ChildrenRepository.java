package com.waga.repository;

import com.waga.model.Child;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:22:55 PM
 */
@Repository
@Transactional
public interface ChildrenRepository extends ChildBaseRepository<Child> {

    /**
     * TODO
     * This is not the best.
     * Please replace the result with Spring Batch
     * Crying because of this
     */
    @Modifying
    @Transactional
    @Query(value = "REPLACE INTO parent_summary  SELECT @rank\\:=@rank+1 position , summary.num_children, summary.num_parents FROM\n"
                   + "	(SELECT count(*) num_parents, num_children  FROM \n"
                   + "      (SELECT parent_id, count(*) num_children FROM child GROUP BY parent_id) counter \n"
                   + "              GROUP BY counter.num_children)summary, (SELECT @rank\\:=0) ranking\n"
                   + "UNION ALL\n"
                   + "  SELECT @rank\\:=@rank+1 position, 0 num_children, \n"
                   + "      (SELECT COUNT(*) total_parents  FROM person) - (SELECT COUNT(distinct parent_id) parents_with_children FROM child) num_parents",
           nativeQuery = true)
    void summarizeParentChildStatistics();

}
