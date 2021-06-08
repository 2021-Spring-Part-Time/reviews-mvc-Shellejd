package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//annotation - brings in import from spring

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository(){
        Review steak = new Review(1L, "Kobe", "Beef", "Considered best in class","C:\\Users\\shell\\Desktop\\WCCI\\beef image");
        Review chicken = new Review( 2L, "Chicken", "Poultry", "Common staple and inexpensive", "C:\\Users\\shell\\Desktop\\WCCI\\chicken image");
        Review pork = new Review(3L, "Pork", "Pork", "Considered the other white meat", "C:\\Users\\shell\\Desktop\\WCCI\\pork image");

reviewList.put(steak.getId(), steak);
        reviewList.put(chicken.getId(), chicken);
        reviewList.put(pork.getId(), pork);


    }


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
