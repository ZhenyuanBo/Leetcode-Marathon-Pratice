class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        List<String> digitLog = new ArrayList<String>();
        List<String> letterLog = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();
        
        for(String str: logs){
            String digitWordCheck = str.split("\\s+")[1];
            if(Character.isDigit(digitWordCheck.charAt(0))){
                digitLog.add(str);
            }else{
                map.put(str.split(" ",2)[1], str.split(" ", 2)[0]);
                letterLog.add(str.split(" ",2)[1]);
            }
        }
        
        String[] finalLetterLog = new String[letterLog.size()];
        finalLetterLog = letterLog.toArray(finalLetterLog);
        
        //lexicographically order strings
        Arrays.sort(finalLetterLog);
        
        for(int i=0; i<finalLetterLog.length; i++){
            finalLetterLog[i] = map.get(finalLetterLog[i])+" "+finalLetterLog[i];
        }
        
        String[] result = new String[letterLog.size() + digitLog.size()];
        
        int i=0;
        
        for(String str: finalLetterLog){
            result[i] = str;
            i++;
        }
        
        for(String str: digitLog){
            result[i] = str;
            i++;
        }
        
        return result;
        
    }
}

/*
solution: sort with lambda

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
			//compare log1 and log2 only and return the comparison result (in numeric value)
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }
}
*/