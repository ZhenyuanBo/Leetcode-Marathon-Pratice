class Solution {
	//using list to simulate queue
    public List<String> readBinaryWatch(int num) {
        
        if(num==0){
            String emptyStr = "0:00";
            List<String> emptyList = new ArrayList<String>();
            emptyList.add(emptyStr);
            return emptyList;
        }
        
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int[] intArr = new int[]{60, 120, 240, 480, 1, 2, 4, 8, 16, 32};
        
        for(int n: intArr){
            List<Integer> list = new ArrayList<Integer>();
            list.add(n);
            lists.add(list);
        }
        
        
        for(int i=1; i<num; i++){
            int queueSize = lists.size();
            while(queueSize>0){
                int hr=0, min=0;
                for(int j=i; j<intArr.length; j++){
                    List<Integer> firstList = lists.get(0);
                    if(firstList.indexOf(intArr[j])==-1){
						List<Integer> newList = new ArrayList<Integer>(firstList);
                        newList.add(intArr[j]);
                        if(isValidList(newList)) lists.add(newList);
					}
                }
                lists.remove(0);
                queueSize--;
            }
        }

        
        Set<String> set = new HashSet<String>();
        
		for(List<Integer> list: lists){
            int totalMin=0;
            
			for(Integer item: list){
                totalMin+=item;
			}
            
            int hr=totalMin/60;
            int min=totalMin%60;
            
			StringBuilder sb = new StringBuilder();
            
            if(hr==0){
                sb.append("0:");
            }else if(hr>0 && hr<=11){
                sb.append(hr+":");
            }
            if(min==0){
                sb.append("00");
            }else if(min>0 && min<10){
                sb.append("0" + min);
            }else if(min>=10 && min<=59){
                sb.append(min);
            }

			set.add(sb.toString());
		}
        
        List<String> res = new ArrayList<String>();
        
        for(String str: set){
            res.add(str);
        }
        
        System.out.println(res.size());

        return res;
    }
    
    public boolean isValidList(List<Integer> checkList){
        int hr=0, min=0;
        for(Integer item: checkList){
            if(item%60==0) hr+=item;
            if(item%60!=0) min+=item;
        }
        if(hr>=720 || min>=60) return false;
        
        return true;
    }
}