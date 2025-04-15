package sdp.prac2;

giimport java.util.*;

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

    public boolean Task3(String str){
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
    
}
