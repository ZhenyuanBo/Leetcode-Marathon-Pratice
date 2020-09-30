class Solution {
    public int count = 0;
	public int numTilePossibilities(String tiles) {
        //using backtracking algorithm
        int[] freqArray = new int[26];
        for(char ch : tiles.toCharArray()){
            freqArray[ch-'A']++;
        }
        generatePossibility(freqArray);
        return count-1;
    }
	public void generatePossibility(int[] freqArray){
        count++;
        for(int i=0; i<freqArray.length; i++){
            if(freqArray[i]>0){
                freqArray[i]--;
                generatePossibility(freqArray);
                freqArray[i]++;
            }
        }
    }
}