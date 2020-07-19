class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> sbs = new Stack<>();
        sbs.push(new StringBuilder());
        Stack<Integer> times = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int time = 0;
                while(s.charAt(i)!='['){
                    time = time * 10 + s.charAt(i)-'0';
                    i++;
                }
                times.push(time);
                sbs.push(new StringBuilder());
            }else if(s.charAt(i)==']'){
                String str = sbs.pop().toString();
                int time = times.pop();
                while(time>0){
                    sbs.peek().append(str);
                    time--;
                }
            }else{
                sbs.peek().append(s.charAt(i));
            }
        }
        
        return sbs.pop().toString();
        
    }
}