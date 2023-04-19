public class Review {
    private byte rating;
    private String reviewerName;
    private String comments;

    public Review(byte rating, String reviewerName, String comments) {
        this.rating = rating;
        this.reviewerName = reviewerName;
        this.comments = comments;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
