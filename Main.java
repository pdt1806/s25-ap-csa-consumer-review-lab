public class Main {
    public static void main(String[] args) {
        Review review = new Review();

        // System.out.println(review.sentimentVal("cool"));
        // System.out.println(review.sentimentVal("awesome"));
        // System.out.println(review.sentimentVal("incredible"));

        // System.out.println(review.totalSentiment("simpleReview.txt"));
        // System.out.println(review.starRating("simpleReview.txt"));
        System.out.println(review.fakeReview("simpleReview.txt"));
    }
}