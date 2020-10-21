class Solution {
    public String convertToBase7(int num) {
        
        if(num == 0 ){
            return "0";
        }else if(num>0){
            return convertToBase7Helper(num);
        }else{
            return '-'+convertToBase7Helper(-num);
        }
    }
    private String convertToBase7Helper(int num){
        StringBuilder str = new StringBuilder();
        
        while(num!=0){
            int remainder = num % 7;
            str.insert(0, remainder);
            num = num/7;
        }
        
        return str.toString();
    }
}