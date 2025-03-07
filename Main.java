public class Main {
    public static void main(String[] args) {

        System.out.println(Review.sentimentVal("cool"));
        System.out.println(Review.sentimentVal("awesome"));
        System.out.println(Review.sentimentVal("incredible"));

        System.out.println(Review.totalSentiment("simpleReview.txt"));
        System.out.println(Review.starRating("simpleReview.txt"));
        System.out.println(Review.fakeReview("simpleReview.txt", "negative"));
    }
}