class Solution {
    public String addStrings(String num1, String num2) {
        
        List<Character> num1List = new ArrayList<Character>();
        List<Character> num2List = new ArrayList<Character>();
        
        for(Character ch: num1.toCharArray()){
            num1List.add(ch);
        }
        
        for(Character ch: num2.toCharArray()){
            num2List.add(ch);
        }
        
        int maxLen = Math.max(num1List.size(),num2List.size());
        
        int count=0;
        int carry=0;
        int currSum=0;
        int indexNum1 = num1List.size()-1;
        int indexNum2 = num2List.size()-1;

        StringBuilder strRes = new StringBuilder();

        while(maxLen>0){

            if(indexNum1<0){
                currSum = num2List.get(indexNum2)-'0';
            }else if(indexNum2<0){
                currSum = num1List.get(indexNum1)-'0';
            }else{
                currSum = (num1List.get(indexNum1)-'0') + (num2List.get(indexNum2)-'0');
            }
            currSum = currSum + carry;
            
            if(currSum>=10){
                carry = 1;
                currSum = currSum-10;
            }else{
                carry=0;
            }

            indexNum1--;
            indexNum2--;
            maxLen--;

            strRes.insert(0,Integer.toString(currSum));
        }
        
        if(carry == 1) strRes.insert(0,"1");

        return strRes.toString();
        
    }
}