package JAVA.csepDS;

import java.util.HashMap;

public class maxWords {
    public static void main(String[] args) {
        
    
          String str = "java is easy and java is powerful";

        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);

        String maxWord = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                maxWord = word;
            }
        }

        System.out.println("Maximum word: " + maxWord);
        System.out.println("Count: " + max);
        
    }
}  
    

