package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import javax.persistence.OneToMany;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    //global -don't need under @Test

    private Review reviewOne = new Review(1L, "review one title", "category", "content", "image");
    private Review reviewTwo = new Review(2L, "review two title", "category", "content", "image");

    @Test
    public void shouldFindReviewOne() {

        //houses and maintains database placed (underTest) - passing course to constructor of course repository
        ReviewRepository underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {

        ReviewRepository underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);

    }
}
