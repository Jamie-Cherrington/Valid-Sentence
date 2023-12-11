public class ValidateSentence {
    public static boolean SentenceValidator (String sentence) {

        if (!Character.isUpperCase(sentence.charAt(0))) {   //Checks to see if first character is upper case 
            return false;
        }

        int quotationMarks = 0;    // checks for even amount of quotation marks 
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '"') {
                quotationMarks++;
            }
        }
        if (quotationMarks % 2 != 0) {   // a formula to check that quotation marks are even and if not returns false 
            return false;
        }
        
        //Checks to see if the last character is "." / "?" / "!"
        if (sentence.charAt(sentence.length() - 1) != '.' && sentence.charAt(sentence.length() - 1) != '?' &&
                sentence.charAt(sentence.length() - 1) != '!') {
            return false;
        }
        //Checks if there is more than one period in a sentance 
        int period = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '.') {
                period++;
            }
        }
        // if there is a period and is not at the end of the sentance return false
        if (period > 1 || period == 1 && sentence.charAt(sentence.length() - 1) != '.') {
            return false;
        }
        //Checks if there is a number in the sentance less than 13 
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))){
                int number = Character.getNumericValue(sentence.charAt(i));
                if (i < sentence.length() -1 && Character.isDigit(sentence.charAt(i + 1))) {
                    //get the numeric value of the next character
                    int nextNumber = Character.getNumericValue(sentence.charAt(i + 1));
                    number = number * 10 + nextNumber; //combine the two numeric vlaues to forum a double digit
                    i++;
                }
                //Checks if the number is less than 13
                if (number < 13) {
                    return false;
                }

            }



        }
        return true; // if all conditions are met then return true


    }

}
