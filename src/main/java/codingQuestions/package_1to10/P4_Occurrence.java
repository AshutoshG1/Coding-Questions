package codingQuestions.package_1to10;

import java.util.HashMap;
import java.util.Map;

public class P4_Occurrence {
    public static void main(String[] args) {
        String str = "java";
        Map<Character, Integer> charMapCount = new HashMap<>();
        for (Character c: str.toCharArray()){
            if (charMapCount.containsKey(c)){
                charMapCount.put(c, charMapCount.get(c)+1);
            }else {
                charMapCount.put(c,1);
            }
        }
        System.out.println(charMapCount);

    }
}
