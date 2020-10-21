class Solution {
    public String complexNumberMultiply(String a, String b) {
        //split the string with respect to the "+" sign
        String[] aStrArray = a.split("\\+");
        String[] bStrArray = b.split("\\+");
        
        int a1b1 = Integer.parseInt(aStrArray[0]) * Integer.parseInt(bStrArray[0]);
        int a1b2 = Integer.parseInt(aStrArray[0]) * Integer.parseInt(bStrArray[1].replace("i",""));
        int a2b1 = Integer.parseInt(aStrArray[1].replace("i","")) * Integer.parseInt(bStrArray[0]);
        int a2b2 = Integer.parseInt(aStrArray[1].replace("i","")) * Integer.parseInt(bStrArray[1].replace("i",""));
        
        int sumA1B2A2B1 = a1b2 + a2b1;
        int sumA1B1A2B2 = a1b1 + (-1) * a2b2;
        
        StringBuilder res = new StringBuilder();
        
        res.append(sumA1B1A2B2).append("+").append(sumA1B2A2B1).append("i");
        
        return res.toString();
        
    }
}