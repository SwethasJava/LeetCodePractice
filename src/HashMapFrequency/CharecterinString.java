package HashMapFrequency;

import java.util.HashMap;
import java.util.Map;

public class CharecterinString {

    public static void main(String args[])
    {
        System.out.println("Learning HashMap, charecter count in string");
        String str ="swetha shilpa";
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for(char c: str.toCharArray())
        {
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
