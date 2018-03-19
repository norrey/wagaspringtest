package com.waga.service;

import com.waga.model.Child;
import com.waga.model.ChildInfo;
import com.waga.model.Daughter;
import com.waga.model.Meal;
import com.waga.model.Person;
import com.waga.model.Son;
import com.waga.repository.ChildrenRepository;
import com.waga.service.api.ChildrenServiceApi;
import java.util.Optional;
import java.util.SortedSet;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:19:56 PM
 */
@Service
public class ChildrenService implements ChildrenServiceApi {

    private final ChildrenRepository childrenRepository;

    public ChildrenService(ChildrenRepository childrenRepository) {
        this.childrenRepository = childrenRepository;
    }

    @Override
    @Transactional
    public Optional<ChildInfo> fetchChildInfo(final Long childId) {
        final Child child = childrenRepository.findOne(childId);
        if (child == null) {
            return Optional.empty();
        }

        final Person parent = child.getParent();
        final SortedSet<Meal> meals = child.getMeals();

        if (meals == null || meals.isEmpty()) {
            return Optional.of(new ChildInfo(parent, null));
        }

        final Meal meal = child.getMeals().first();

        return Optional.of(new ChildInfo(parent, meal));
    }

    @Override
    public Optional<String> fetchChildColor(final Long childId) {
        final Child child = childrenRepository.findOne(childId);

        if (child instanceof Son) {
            return Optional.of(((Son) child).getBicycleColor());
        }
        if (child instanceof Daughter) {
            return Optional.of(((Daughter) child).getHairColor());
        }
        return Optional.empty();
    }

}
