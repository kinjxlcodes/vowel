
    public class vowels {
        public static void main(String[] args) {
            String input1 = "Hello";
            String input2 = "Rhythm";
    
            try {
                checkForVowels(input1);
                System.out.println(input1 + " contains vowels.");
            } catch (NoVowelsException e) {
                System.out.println(input1 + " does not contain any vowels.");
            }
    
            try {
                checkForVowels(input2);
                System.out.println(input2 + " contains vowels.");
            } catch (NoVowelsException e) {
                System.out.println(input2 + " does not contain any vowels.");
            }
        }
    
        public static void checkForVowels(String input) throws NoVowelsException {
            if (!input.matches(".*[aeiouAEIOU].*")) {
                throw new NoVowelsException("String does not contain any vowels.");
            }
        }
    }
    
    class NoVowelsException extends Exception {
        public NoVowelsException(String message) {
            super(message);
        }
    }
    

