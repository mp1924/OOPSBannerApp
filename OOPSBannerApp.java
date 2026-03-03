feature/UC7-StoreCharacterPatternClass
/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 * Displays "OOPS" using ASCII Banner Format
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    /**
     * Inner Static Class to store character and its banner pattern
     */
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Create and initialize character pattern objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        String[] space = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        return new CharacterPatternMap[] {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S),
                new CharacterPatternMap(' ', space)
        };
    }

    // Get pattern for given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        // If character not found, return space pattern
        return charMaps[3].getPattern();
    }

    // Print message as banner
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
   }
feature/UC6-StaticFunctions
public class OOPSstatic {

    // Pattern for letter O
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Pattern for letter P
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Pattern for letter S
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS (O O P S)
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "  " +
                oPattern[i] + "  " +
                pPattern[i] + "  " +
                sPattern[i]
            );
public class OOPSArrayInit {

    public static void main(String[] args) {

        // Declare and initialize array inline using String.join()
        String[] lines = {
            String.join(" ", " *** ", " *** ", " *****", " *****"),
			
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
			
            String.join(" ", "*   *", "*   *", "*    *", "*     "),
			
            String.join(" ", "*   *", "*   *", "***** ", "***** "),
			
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
			
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
			
            String.join(" ", " *** ", " *** ", "*     ", "***** ")
        };

        // Loop to print banner
        for (String line : lines) {
            System.out.println(line);
 main
        }
    }
 main
}
