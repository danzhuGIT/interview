package com.algorithm.BFS.leetcode;

/**
 * Created by danzhu on 10/11/14.
 * Given two words (start and end), and a dictionary, find all shortest transformation sequence(s) from start to end, such that:

 Only one letter can be changed at a time
 Each intermediate word must exist in the dictionary
 For example,

 Given:
 start = "hit"
 end = "cog"
 dict = ["hot","dot","dog","lot","log"]
 Return
 [
 ["hit","hot","dot","dog","cog"],
 ["hit","hot","lot","log","cog"]
 ]
 Note:
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 */
public class WordLadderII {
    /*
    //DFS Time Limit Exceeded
    //这对找出答案很可能是不利的，如果一开始进入了一条很长的序列，就会浪费了时间
    int minLen = Integer.MAX_VALUE;
    public List<ArrayList<String>> findLadders(String start, String end, Set<String> dict) {
        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        ArrayList<String> candidate = new ArrayList<String>();
        candidate.add(start);
        findLaddersHelper(end, dict, candidate, result);
        return result;
    }

    private void findLaddersHelper(String target, Set<String> dict, ArrayList<String> candidate, ArrayList<ArrayList<String>> result){
        if(candidate.size() >= minLen)
            return;
        if(dict.isEmpty())
            return;

        String word = candidate.get(candidate.size()-1);
        char[] wordArr = word.toCharArray();
        for(int i=0; i < wordArr.length; i++){
            char cur = wordArr[i];
            for(char c = 'a'; c <= 'z'; c++){
                if(c == cur)
                    continue;
                wordArr[i] = c;
                String newWord = new String(wordArr);
                if(dict.contains(newWord)){
                    dict.remove(newWord);
                    candidate.add(newWord);
                    if(newWord.equals(target)){
                        result.add(new ArrayList<String>(candidate));
                        minLen = candidate.size();
                    }else{
                        findLaddersHelper(target, dict, candidate, result);
                    }
                    candidate.remove(candidate.size()-1);
                    dict.add(newWord);
                }
            }
            wordArr[i] = cur;
        }
    }
    */
}
