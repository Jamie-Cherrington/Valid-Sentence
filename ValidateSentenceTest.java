import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidateSentenceTest {
    
    @Test //Test to check sentence starts with Capital letter
    public void startsWithCapLetter() {
        ValidateSentence valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("The quick brown fox said hello Mr lazy dog."));
    }

    @Test //Tests to see if string has even quotation marks
    public void evenQuotationMarks() {
        ValidateSentence  valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("The quick brown fox said 'hello Mr lazy dog'.")); 
    }

    @Test //Tests to see if string value end with a "." / "?" / "!"
    public void finishWithCorrectPunctuation() {
        ValidateSentence  valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("How many 'lazy dogs' are there?"));

    }

    @Test //Tests to see that no period characters except at the end of string sentance 
    public void noPeriodCharApartFromLastChar() {
        ValidateSentence  valid = new ValidateSentence();
        assertTrue(ValidateSentence.SentenceValidator("One lazy dog is too few, thirteen is too many."));

    }

    @Test // Tests to see that numbers below 13 are spelt out
    public void numbersLessThanThirteenSpeltOut() {
        assertFalse(ValidateSentence.SentenceValidator("One dog is too few, thirteen is too many"));
    }


}
