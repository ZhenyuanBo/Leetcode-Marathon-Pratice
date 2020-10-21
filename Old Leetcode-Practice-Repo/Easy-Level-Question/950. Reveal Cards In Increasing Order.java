class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer> index = new LinkedList();
        for(int i=0; i<deck.length; i++){
            index.add(i);
        }
        Arrays.sort(deck);
        int ans[] = new int[deck.length];
        for(int i: deck){
            //retrieve and remove the first element
            ans[index.pollFirst()] = i;
            if(!index.isEmpty()){
                //add the first element to the tail of the deque
                index.add(index.pollFirst());
            }
        }
        return ans;
    }
}
/*
deque methods:

    add(element): Adds an element to the tail.
    addFirst(element): Adds an element to the head.
    addLast(element): Adds an element to the tail.
    offer(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
    offerFirst(element): Adds an element to the head and returns a boolean to explain if the insertion was successful.
    offerLast(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
    iterator(): Returna an iterator for this deque.
    descendingIterator(): Returns an iterator that has the reverse order for this deque.
    push(element): Adds an element to the head.
    pop(element): Removes an element from the head and returns it.
    removeFirst(): Removes the element at the head.
    removeLast(): Removes the element at the tail.
    poll(): Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
    pollFirst(): Retrieves and removes the first element of this deque, or returns null if this deque is empty.
    pollLast(): Retrieves and removes the last element of this deque, or returns null if this deque is empty.
    peek(): Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
    peekFirst(): Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
    peekLast(): Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
	
	declare deque:
	
	Deque<Integer> index = new LinkedList();
	
	The Deque is related to the double-ended queue that supports addition or removal of elements from either end of the data structure, 
	it can be used as a queue (first-in-first-out/FIFO) or as a stack (last-in-first-out/LIFO). 
	
	Queue:
	A _queue_ is also a crippled list.  You may read or remove only the item at the
	front of the queue, and you may add an item only to the back of the queue.
	
	public interface Queue {
		public int size();
		public boolean isEmpty();
		public void enqueue(Object item);
		public Object dequeue();
		public Object front();
	}
	Deque:
	A _deque_ (pronounced "deck") is a Double-Ended QUEue.  You can insert and
	remove items at both ends.  You can easily build a fast deque using a
	doubly-linked list. 
	
*/