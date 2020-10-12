class Solution {
    public int calculateTime(String keyboard, String word) {
        int timeCost = keyboard.indexOf(word.charAt(0));
        
        for(int i=1; i<word.length(); i++){
            int currIndex = keyboard.indexOf(word.charAt(i));
            int prevIndex = keyboard.indexOf(word.charAt(i-1));
            int diff = Math.abs(currIndex - prevIndex);
            timeCost += diff;
        }
        
        return timeCost;
    }
}