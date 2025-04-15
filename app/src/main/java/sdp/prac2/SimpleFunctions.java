package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static List<String> Task2(List<String> inputList) {
        List<String> result = new ArrayList<>();

        for (String item : inputList) {
            if (item != null && item.length() > 1) {
                result.add(item.substring(1)); 
            }
        }

        return result;
    }

    public static boolean Task3(String str){
        int BracketCount = 0;
        for (char ch : str.toCharArray()){
            if (ch == '('){
                BracketCount++;
            }
            else if(ch == ')'){
                BracketCount--;

                if (BracketCount < 0){
                    return false;
                }
            }
        }
        return BracketCount == 0;
    }

    public List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            return null;
        }

        int listSize = a.size();
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < listSize; i++) {
            int prod = a.get(i) * b.get(listSize - i - 1);
            result.add(prod);
        }
        
        return result;
    }

    /* nums: List of numbers to convert to multples of 100
     * returns list of multiples of 100*/
    public static List<Integer> Task6 (List<Integer> nums){
        // initialze list to store result
        List<Integer> output = new ArrayList<>();
        // iterate through given list
        for (int num: nums){
            // check if number is a multiple of 100
            if (num%100 == 0) output.add(num);
            // get integer division value multiplied by 100, and add 100 to round up to the next multiple
            else output.add((num/100)*100 + 100);
        }
        // return result
        return output;
    }
    
}
