/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.example.nxttrendz1.model.Product;
import com.example.nxttrendz1.model.Review;
import com.example.nxttrendz1.service.ReviewJpaService;

@RestController
public class ReviewController {

    @Autowired
    public ReviewJpaService reviewService;

    @GetMapping("/reviewss/{reviewId}/product")
    public Product getReviewProduct(@PathVariable("productId") int productId) {
        return reviewService.getReviewProduct(productId);

    }

    @GetMapping("/products/reviews")
    public ArrayList<Review> getReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/products/reviews/{reviewId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @PostMapping("/products/reviews")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @PutMapping("/products/reviewss/{reviewId}")
    public Review updateReview(@PathVariable("reviewId") int reviewId, @RequestBody Review review) {
        return reviewService.updateReview(reviewId, review);
    }

    @DeleteMapping("/products/reviews/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") int reviewId) {
        reviewService.deleteReview(reviewId);
    }

}