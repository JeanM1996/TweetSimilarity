import static org.junit.Assert.*;


import org.junit.Test;
import static org.junit.Assert.*;


public class TweetSimilarityTest {
    public void TweetSimilarityTest(){};

    @Test
    public void Similar(){
        String tweet1="Hola mundo";
        String tweet2="Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
        assertEquals(1.0,ts.similarity(tweet1,tweet2),0);

    }

}
