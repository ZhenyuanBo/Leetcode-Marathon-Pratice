class Solution {
    public boolean isPathCrossing(String path) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        List<List<Integer>> res = new ArrayList<>();
        res.add(list);
        
        for(int i=0; i<path.length(); i++){
            List<Integer> prev = res.get(i);
            List<Integer> curr = new ArrayList<>();
            if(path.charAt(i)=='N'){
                int yVal = prev.get(1);
                curr.add(prev.get(0));
                curr.add(yVal+1);
                if(res.contains(curr)) return true;
                else
                    res.add(curr);
            }else if(path.charAt(i)=='E'){
                int xVal = prev.get(0);
                curr.add(xVal+1);
                curr.add(prev.get(1));
                if(res.contains(curr)) return true;
                else
                    res.add(curr);
            }else if(path.charAt(i)=='S'){
                int yVal = prev.get(1);
                curr.add(prev.get(0));
                curr.add(yVal-1);
                if(res.contains(curr)) return true;
                else
                    res.add(curr);
            }else if(path.charAt(i)=='W'){
                int xVal = prev.get(0);
                curr.add(xVal-1);
                curr.add(prev.get(1));
                if(res.contains(curr)) return true;
                else
                    res.add(curr);
            }
            System.out.println(res);
        }
        return false;
    }
}