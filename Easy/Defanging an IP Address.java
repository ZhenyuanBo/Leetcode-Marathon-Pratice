class Solution {
    public String defangIPaddr(String address) {
        // String s = "";
        // for(char ch: address.toCharArray()){
        //     if(ch=='.'){
        //         s+="[.]";
        //     }else{
        //         s+=ch;
        //     }
        // }
        // return s;
        String s = address.replace(".", "[.]");
        return s;
    }
}