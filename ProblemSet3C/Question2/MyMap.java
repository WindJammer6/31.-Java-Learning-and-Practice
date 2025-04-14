package ProblemSet3C.Question2;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static Map<Character, Integer> letterFrequency(String s){
        Map<Character, Integer> map = new HashMap<>();
        s = s.toUpperCase();
        s = s.replaceAll("\\s", "");
        char[] arrayChar = s.toCharArray();

        for (int i = 0; i < arrayChar.length; i++){
            Integer value = map.get(arrayChar[i]);

            if (value != null){
                map.put(arrayChar[i], map.get(arrayChar[i]) + 1);
            } else{
                map.put(arrayChar[i], 1);
            }
        }

        return map;
    }
}
