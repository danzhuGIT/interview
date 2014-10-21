package chapterone;

/**
 * Created by danzhu on 7/2/14.
 *
 * Write a method to decide if two strings are anagrams or not.
 */


public class IsAnagram {
    public static void main(String[] args){

        String s="asdf";
        String t="fda";
        System.out.print(isAnangram(s,t));
    }
    public static boolean isAnangram(String s, String t){
        if(s.length() != t.length()) return false;
        int num_unique_chars = 0;
        int num_char_complete = 0;
        int[] letters = new int[256];

        char[] s_array = s.toCharArray();
        for(char i :  s_array){
            if(letters[i] == 0) num_unique_chars++;
            letters[i]++;
        }

        //char[] t_array = s.toCharArray();
        for(char i =0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            if (letters[c] == 0) return false;
            letters[c]--;
            if (letters[c] == 0) {
                num_char_complete++;
                if (num_char_complete == num_unique_chars)
                    return i == t.length() - 1;
            }

        }
        return false;
    }
}
