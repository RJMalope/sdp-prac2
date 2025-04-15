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
    // G22M3544 - Task One 
    //accepts two lists of ints and returns the sum of index's listed in B
    public int Adder(List<Integer> a, List<Integer> b){
        int ans = 0; 
        for (int cnt = 0; cnt < b.size(); cnt ++){
            int id = b.get(cnt); 
            if (id > 0 && id <= a.size()){
                ans += a.get(id);
            } 
        } 
        return ans
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

    //g22m9049 task 5
    public static boolean Task5(List<Integer> list) {
        // An empty list or a list with one element is trivially sorted
        if (list == null || list.size() <= 1) {
            return true;
        }

        // Check each adjacent pair
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}

    
