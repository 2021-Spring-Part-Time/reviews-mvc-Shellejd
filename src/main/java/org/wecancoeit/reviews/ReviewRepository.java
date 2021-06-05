package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//annotation - brings in import from spring

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();


    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewList.put(review.getId(), review);
        }
//primary key is Id and object is reviewToAdd (value)
        //need getter
    }

    public Review findOne(long id) {

        return reviewList.get(id);
    }

    public Review findTwo(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }
}
