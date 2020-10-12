class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] alphabet = new int[26];
        for(char ch: text.toCharArray()){
            if(ch=='a' || ch=='b' || ch=='l'|| ch=='o' || ch=='n'){
                int index = ch-'a';
                alphabet[index]++;
            }
        }
        int indexL = 'l'-'a';
        int numL = alphabet[indexL];
        
        int indexO = 'o'-'a';
        int numO = alphabet[indexO];
        
        int indexB = 'b'-'a';
        int numB = alphabet[indexB];
        
        int numA = alphabet[0];
        
        int indexN = 'n'-'a';
        int numN = alphabet[indexN];
        
        int tempMinLO = Math.min(numL/2, numO/2);
        int tempMinBAN = Math.min(numB, Math.min(numA, numN));
        
        return Math.min(tempMinLO, tempMinBAN);
        
    }
}