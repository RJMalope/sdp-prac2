package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

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
