/*
 *
 * You can use the following import statements
 * 
 * import javax.persistence.*;
 * 
 */

// Write your code here

package com.example.nxttrendz1.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId")
    private int reviewId;

    @Column(name = "reviewcontent")
    private String reviewContent;

    @Column(name = "rating")
    private int rating;
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    public Review(int reviewId, String reviewContent, int rating) {
        this.reviewId = reviewId;
        this.reviewContent = reviewContent;
        this.rating = rating;

    }

    public Review() {
    }

    public int getReviewId() {
        return this.reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewContent() {
        return this.reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}