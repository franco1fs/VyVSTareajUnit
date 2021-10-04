import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordDetectorTest {
    private WordDetector wordDetector = new WordDetector();

    @Test
    public void messageNotContainTheWordTest(){
        String msg = "This is a test that should return false";
        String word ="true";
        boolean answer = wordDetector.messageContainTheWord(msg,word);
        assertEquals(false,answer);
    }

    @Test
    public void messageContainTheWordTest(){
        String msg = "This is a test that should return true";
        String word ="true";
        boolean answer = wordDetector.messageContainTheWord(msg,word);
        assertEquals(true,answer);
    }

    @Test
    public void thereIsNoNumberAtBeginningTest(){
        String msg = "This test should return true because there is no number at beginnig";
        boolean answer = wordDetector.isNoNumberAtBeginning(msg);
        assertTrue(answer);
    }

    @Test
    public void thereIsNumberAtBeginningTest(){
        String msg = "1 This test should return false because there is number at beginnig";
        boolean answer = wordDetector.isNoNumberAtBeginning(msg);
        assertFalse(answer);
    }

    @Test
    public void thereAreNoTenLettersTest(){
        String msg = "This test should return false because there are no hundred of letters";
        boolean answer = wordDetector.isTenLetters(msg);
        assertFalse(answer);
    }

    @Test
    public void thereAreTenLettersTest(){
        String msg = "HiiThisTen";
        boolean answer = wordDetector.isTenLetters(msg);
        assertTrue(answer);
    }
}
