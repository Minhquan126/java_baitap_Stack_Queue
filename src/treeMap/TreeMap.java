package treeMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TreeMap {
    public static void main(String[] args) {
String document = "hello i am nguyen minh quan";
String[] listChar = document.toUpperCase().split("");
HashMap<String,Integer> map = new HashMap<>();
        System.out.println(Arrays.toString(listChar));
        for (int i = 0; i < listChar.length; i++) {
                    if (map.containsKey(listChar[i])){
                        System.out.println("ton tai");
                        int count = map.get(listChar[i]);
                        map.put(listChar[i],count+1);
                    } else {
                        map.put(listChar[i],1);
                    }
        }
        for (String key: map.keySet()) {
            System.out.println("key : " + key + "   value :" + map.get(key));
        }
        }

    }

