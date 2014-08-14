package com.topic.math.careercup;

/**
 * Created by danzhu on 8/1/14.
 * write a function that has an int as input and return the equivalent String as an output


 12 -> 'twelve'
 4345 -> 'four thousand three hundred and forty-five'
 7654567643 -> 'seven billion six hundred and fifty-four million five hundred and sixty-seven thousand six hundred and forty-three'
 */
public class ReadNum {
    static String[] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    static String[] teens={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    static String[] tens={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public static void main(String[] args){
        System.out.print(readNum(-1005980514));
    }

    public static String readNum(int num){
        //num is -2147483647 to 2147483647

        if(num == 0)
            return "zero";

        StringBuilder result = new StringBuilder();
        if(num < 0) {
            result.append("Negative ");
            num = -num;
        }

        result.append(readUnsignedNum(num));
        return new String(result);
    }

    private static String readUnsignedNum(int num){
        StringBuilder s = new StringBuilder();
        if(num > 999999999){
            s.append(read(num/1000000000));
            s.append(" Billion");
            num = num % 1000000000;
            if(num > 0){
                s.append(" ");
                s.append(readUnsignedNum(num));
            }
        } else if(num > 999999){
            s.append(read(num/1000000));
            s.append(" Million");
            num %= 1000000;
            if(num > 0){
                s.append(" ");
                s.append(readUnsignedNum(num));
            }
        } else if(num > 999){
            s.append(read(num/1000));
            s.append(" Thousand");
            num %= 1000;
            if(num > 0){
                s.append(" ");
                s.append(readUnsignedNum(num));
            }
        } else {
            s.append(read(num));
        }
        return new String(s);
    }

    private static String read(int num){
        // 0 < n < 1000
        StringBuilder s = new StringBuilder();
        if(num > 99){
            s.append(ones[num/100]);
            s.append(" Hundred");
            num = num % 100;
            if(num > 0)
                s.append(" and ");
        }

        if(num == 0)
            ;
        else if(num < 10){
            s.append(ones[num]);
        } else if(num < 20){
            s.append(teens[num-10]);
        } else {
            s.append(tens[num/10]);
            num = num % 10;
            if(num > 0){
                s.append("-");
                s.append(ones[num]);
            }
        }
        return new String(s);
    }
}
