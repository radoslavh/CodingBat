package String3;

/**
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
 * but not the 'y' in "yellow" (not case sensitive).
 * We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */
public class CountYZ {
    public int countYZ(String str) {
        int counter = 0;
        str = str.toLowerCase() + " ";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') && !Character.isLetter(str.charAt(i + 1))) counter++;

        }
        return counter;
    }
}
