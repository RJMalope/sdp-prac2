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
        if (str == null) return false;
        int bracketCount = 0;
        for (char ch : str.toCharArray()){
            if (ch == '('){
                bracketCount++;
            }
            else if(ch == ')'){
                bracketCount--;

                if (bracketCount < 0){
                    return false;
                }
            }
        }
        return bracketCount == 0;
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
    
}
