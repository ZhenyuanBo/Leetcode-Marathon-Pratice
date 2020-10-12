class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        // Perform the reverse of what is needed
        Arrays.sort(deck);
        int last = deck.length - 1;
        Deque<Integer> q = new LinkedList<>();
        q.add(deck[last]);
        
        while(last>0){
            int firstItem = q.remove();
            q.add(firstItem);
            q.add(deck[--last]);
        }
        
        int len = deck.length-1;
        
        while(!q.isEmpty()){
            deck[len] = q.remove();
            len--;
        }
        
        return deck;
    }
}