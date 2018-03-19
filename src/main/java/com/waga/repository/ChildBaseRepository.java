package com.waga.repository;

import com.waga.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @param <T>
 * @since Mar 16, 2018, 10:10:14 PM
 */
@NoRepositoryBean
public interface ChildBaseRepository<T extends Child> extends JpaRepository<T, Long> {

}
