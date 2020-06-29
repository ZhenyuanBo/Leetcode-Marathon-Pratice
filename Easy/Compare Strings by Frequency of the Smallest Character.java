class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        //calcuate frequency of each word in words
        List<Integer> wordFreq = new ArrayList<Integer>();
        List<Integer> queryFreq = new ArrayList<Integer>();
        
        for(String word: words){
            wordFreq.add(freqCalculator(word));
        }
        
        for(String query: queries){
            queryFreq.add(freqCalculator(query));
        }
        
        int[] res = new int[queries.length];
        
        int k=0;
        
        System.out.println(wordFreq);
        System.out.println(queryFreq);
        
        for(Integer i: queryFreq){
            int count=0;
            for(Integer j: wordFreq){
                if(i<j) count++;
            }
            res[k] = count;
            k++;
        }
        
        return res;
        
    }
    private int freqCalculator(String word){
        int[] alphabet = new int[26];
        int freq=0;
        
        for(char ch: word.toCharArray()){
            int index = ch-'a';
            alphabet[index]++;
        }
        
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i]>0){
                freq = alphabet[i];
                break;
            }
        }
        
        return freq;
    }
}