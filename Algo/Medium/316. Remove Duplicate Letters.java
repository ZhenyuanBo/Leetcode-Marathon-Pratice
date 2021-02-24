class Solution {
    public String removeDuplicateLetters(String s) {
        // stores the final list of characters
        Stack<Character> stack = new Stack<>();
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> last_occurence = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            last_occurence.put(s.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!seen.contains(c)) {
                while (!stack.isEmpty() && c < stack.peek() && last_occurence.get(stack.peek()) > i) {
                    seen.remove(stack.pop());
                }
                seen.add(c);
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder(stack.size());
        for (Character c : stack)
            sb.append(c);
        return sb.toString();
    }
}