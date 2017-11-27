package String1;

/**
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the inside.
 * The strings will not be the same length, but they may be empty (length 0).
 */
public class ComboString {
    public String comboString(String a, String b) {
        String sho;
        String lon;
        if(a.length()<b.length()){
            sho = a;
            lon = b;
        }else{
            sho = b;
            lon = a;
        }

        return sho + lon + sho;
    }
}
