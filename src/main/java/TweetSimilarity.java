import smile.math.distance.JaccardDistance;
public class TweetSimilarity {
    public double similarity(String tweet1, String tweet2){
        JaccardDistance<String> jaccard= new JaccardDistance<String>();
        double similarity=1-jaccard.d(tweet1.split("\\s"),tweet2.split("\\s"));
        return similarity;
    }
}
