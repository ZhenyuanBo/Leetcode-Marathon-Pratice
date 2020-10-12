class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        //map remainder to its position
        if(numerator==0) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        if(numerator<0 && denominator>0 || numerator>0 && denominator<0){
            sb.append("-");
        }
        
        long num = Math.abs(Long.valueOf(numerator));
        long denom = Math.abs(Long.valueOf(denominator));
        
        long res = num/denom;
        sb.append(String.valueOf(res));
        
        long remainder = num % denom;
        
        if(remainder==0){
            return sb.toString();
        }
        
        sb.append(".");
        
        Map<Long, Integer> map = new HashMap<>();
        
        while(remainder!=0){
            if(map.containsKey(remainder)){
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }else{
                map.put(remainder, sb.length());
                remainder *=10;
                sb.append(String.valueOf(remainder/denom));
                remainder = remainder % denom;
            }
        }
        
        return sb.toString();
    }
}