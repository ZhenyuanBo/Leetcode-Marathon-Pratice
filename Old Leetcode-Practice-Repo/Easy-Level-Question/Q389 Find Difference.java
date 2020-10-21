class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<Character, Integer>();
        Map<Character, Integer> tMap = new HashMap<Character, Integer>();
        char ans = '0';
        
        for(Character ch: s.toCharArray()){
            int val = sMap.getOrDefault(ch,0)+1;
            sMap.put(ch, val);
        }
        
        for(Character ch: t.toCharArray()){
            int val = tMap.getOrDefault(ch, 0)+1;
            tMap.put(ch, val);
        }
        
        for(Character key: tMap.keySet()){
            if(!sMap.keySet().contains(key)){
                ans = key;
                break;
            }else if(sMap.keySet().contains(key) && sMap.get(key) < tMap.get(key)){
                ans = key;
                break;
            }
        }
        
        return ans;
    }
}

// or using int value to compare the sum of these two strings

public class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for 
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
        // Return the difference between 2 strings as char
        return (char)(charCodeT - charCodeS);
    }
}