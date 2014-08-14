package com.datastructure.string.leetcode;

import java.util.Stack;

/**
 * Created by danzhu on 7/8/14.
 *
 * Given an absolute path for a file (Unix-style), simplify it.

 For example,
 path = "/home/", => "/home"
 path = "/a/./b/../../c/", => "/c"
 click to show corner cases.

 Corner Cases:
 Did you consider the case where path = "/../"?
 In this case, you should return "/".
 Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
 In this case, you should ignore redundant slashes and return "/home/foo".
 *
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0)  return path;

        Stack<String> stack = new Stack<String>();
        int i = 0;

        while (i < path.length()){
            while(i < path.length() && path.charAt(i) == '/' )
                i++;

            if(i == path.length()) break;

            int start = i;
            while(i < path.length() && path.charAt(i) != '/' )
                i++;

            String element = path.substring(start, i);

            if(element.equals("..")){
                if(!stack.empty())
                    stack.pop();
            } else if(!element.equals(".")){
                stack.push(element);
            }
        }
        if(stack.empty())   return "/";
        String result = "";
        while(!stack.empty()){
            result = "/" + stack.pop() + result;
        }
        return result;
    }
}
