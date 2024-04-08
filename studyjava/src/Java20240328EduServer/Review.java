package Java20240328EduServer;

import java.util.ArrayList;

public class Review {

    static int reviewNumber = 0;
    int reviewId;
    int rating;
    String text;
    String loginId;
    int lectureId;

    public Review() {
    }

    public Review(int rating, String text, String loginId, int lectureId) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.text = text;
        this.loginId = loginId;
        this.lectureId = lectureId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public static boolean createReview
            (Review review) {
        boolean trueReview = false;
        if (review.getRating() > 0 && review.getRating() <= 10){
            for(int i = 0; i < Main.lecUserArray.size(); i++) {
                if ((review.getLoginId().equals(Main.lecUserArray.get(i).userid))
                        && review.getLectureId() == Main.lecUserArray.get(i).getLectureid()) {
                    trueReview = true;
                    i = Main.lecUserArray.size();
                }
            }
            for(int i = 0; i < Main.reviewArray.size(); i++) {
                if (review.getLoginId().equals(Main.reviewArray.get(i).loginId)
                && review.getLectureId() == Main.reviewArray.get(i).getLectureId()){
                    trueReview = false;
                    i = Main.reviewArray.size();
                }
            }
        }
        if (trueReview){
            Main.reviewArray.add(review);
            Main.reviewArray.get(reviewNumber).reviewId = reviewNumber + 1;
            reviewNumber++;
        }
        return trueReview;
    }
}
