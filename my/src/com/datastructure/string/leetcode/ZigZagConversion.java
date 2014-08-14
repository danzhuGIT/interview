package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/7/14.
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"
 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string text, int nRows);
 convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 */

//copy
public class ZigZagConversion {
    public String convert(String str, int nRow) {
        if(nRow == 1)   return str;

        StringBuffer[] buffers=new StringBuffer[nRow];
        for(int i=0;i<nRow;i++){
            buffers[i]=new StringBuffer();
        }

        for(int i=0;i<str.length();i++){
            int j=i%(2*nRow-2);
            if(j<(nRow-1)){
                buffers[j].append(str.charAt(i));
            }
            else{
                j=j%(nRow-1);
                buffers[nRow-1-j].append(str.charAt(i));
            }

        }

        StringBuffer result=new StringBuffer();
        for(int i=0;i<nRow;i++){
            result.append(buffers[i]);
        }
        return new String(result);
    }
}
