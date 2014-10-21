package com.datastructure.string.careercup;

/**
 * Created by danzhu on 8/25/14.
 *
 * This class will be given a list of words (such as might be tokenized
 * from a paragraph of text), and will provide a method that takes two
 * words and returns the shortest distance (in words) between those two
 * words in the provided text.
 * Example:
 *   WordDistanceFinder finder = new WordDistanceFinder(Arrays.asList("the", "quick", "brown", "fox", "quick"));
 *   assert(finder.distance("fox","the") == 3);
 *   assert(finder.distance("quick", "fox") == 1);
 *
 */
public class WordDistance {
    public static void main(String[] args) {

        String[] strs = new String[] {"the", "quick", "brown", "fox", "quick", "the"};

        System.out.println("Distance between words is: " + wordDistance(strs, "fox", "the"));
        System.out.println("Distance between words is: " + wordDistance(strs, "quick", "fox"));
        System.out.println("Distance between words is: " + wordDistance(strs, "brown", "brown"));
        System.out.println("Distance between words is: " + wordDistance(strs, "apple", "mango"));

    }

    // record index of latest index of each string
    public static int wordDistance(String[] strs, String a, String b){
        int minDistance = -1;
        int indexOfA = -1;
        int indexOfB = -1;

        if(a.equals(b))
            return 0;

        for(int i = 0; i < strs.length; i++){
            if(strs[i].equals(a)){
                if(indexOfB >= 0){
                    if(minDistance == -1){
                        minDistance = i - indexOfB;
                    }else{
                        minDistance = Math.min(minDistance, i - indexOfB);
                    }
                }
                indexOfA = i;
            }

            if(strs[i].equals(b)){
                if(indexOfA >= 0){
                    if(minDistance == -1){
                        minDistance = i - indexOfA;
                    }else{
                        minDistance = Math.min(minDistance, i - indexOfA);
                    }
                }
                indexOfB = i;
            }
        }
        return minDistance;
    }
}
