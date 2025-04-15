package com.example.demo2.Maruf;

import java.time.LocalDate;

public class Feedback {
    private String feedbackId;
    private int rating;
    private String comment;
    private LocalDate feedbackDate;

    public Feedback(String feedbackId, int rating, LocalDate feedbackDate, String comment) {
        this.feedbackId = feedbackId;
        this.rating = rating;
        this.feedbackDate = feedbackDate;
        this.comment = comment;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(LocalDate feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId='" + feedbackId + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", feedbackDate=" + feedbackDate +
                '}';
    }
}
