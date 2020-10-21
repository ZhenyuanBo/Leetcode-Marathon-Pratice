class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> strList = new HashSet<String>();
        
        for(String email :emails){

            strList.add(emailModify(email));
        }
        
        return strList.size();
    }
    private String emailModify(String Email){
        StringBuilder newEmail = new StringBuilder();
        
        boolean hasPlusSign=false;
        boolean afterAtSign=false;
        
        for(char ch: Email.toCharArray()){
            if(!afterAtSign && ch=='.') continue;
            else if(!afterAtSign && ch=='+'){
                hasPlusSign=true;
            }else if(hasPlusSign && ch!='@'){
                continue;
            }else if(ch=='@'){
                hasPlusSign=false;
                afterAtSign=true;
            }else{
                newEmail.append(ch);
            }
        }
        return newEmail.toString();
    }
}