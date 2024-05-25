package set_map;

import java.util.HashMap;

/**
        Implement a method:  countCharacters(String str)
        that takes a string as input and returns a Map where the keys are the unique characters in the string, and the values are the count of each character.
        Input:
        String: "Hello, World!"
        Output:
        Map: {' ': 1, '!': 1, ',': 1, 'd': 1, 'e': 1, 'H': 1, 'l': 3, 'o': 2, 'r': 1, 'W': 1}
 */
public class CountCharacter {
    public static void main(String[] args) {
        String str = "Hello, World ";
        System.out.println(countCharacter(str));
    }

    public static HashMap<Character, Integer> countCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (map.containsKey(character)) {
                int count = map.get(character);
                count++;
                map.replace(character, count);
            } else {
                map.put(character, 1);
            }
        }
        return map;
    }
}

