public class NatoChallenge {
    private static final String ABLE = "Able";
    private static final String BAKER = "Baker";
    private static final String CHARLIE = "Charlie";
    private static final String DOG = "Dog";
    private static final String EASY = "Easy";
    private static final String NOT_FOUND = "Not found";

    public static void main(String[] args) {
        System.out.println(charConverterToNato('A'));
        System.out.println(charConverterToNato('b'));
        System.out.println(charConverterToNato('C'));
        System.out.println(charConverterToNato('d'));
        System.out.println(charConverterToNato('E'));
        System.out.println(charConverterToNato('F'));
    }
    private static String charConverterToNato (char character) {
        String finalMessage = character + " - ";

        switch(character) {
            case 'A', 'a':
                finalMessage += ABLE;
                break;
            case 'B', 'b':
                finalMessage += BAKER;
                break;
            case 'C', 'c':
                finalMessage += CHARLIE;
                break;
            case 'D', 'd':
                finalMessage += DOG;
                break;
            case 'E', 'e':
                finalMessage += EASY;
                break;
            default:
                finalMessage = NOT_FOUND;
        }
        return finalMessage;
    }

}
