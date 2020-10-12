class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<String> orderedProducts = new ArrayList<>();
        for(String product: products){
            orderedProducts.add(product);
        }
        
        orderedProducts.sort(Comparator.comparing( String::toString ));

        List<List<String>> ans = new ArrayList<>();
        
        for(int i=0; i<searchWord.length(); i++){
            String prefix = searchWord.substring(0, i+1);
            List<String> res = new ArrayList<>();
            for(String product: orderedProducts){
                if(i+1<=product.length()){
                    String productPrefix = product.substring(0, i+1);
                    if(productPrefix.equals(prefix) && res.size()<3){
                        res.add(product);
                    }
                }
            }
            ans.add(res);
        }
        
        return ans;
    }
}