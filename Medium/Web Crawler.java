/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        String hostname = startUrl.substring(7).split("/")[0];
        
        Set<String> seen = new HashSet<String>();
        Queue<String> queue = new LinkedList<>();
        List<String> res = new ArrayList<>();
        
        queue.add(startUrl);
        seen.add(startUrl);
        
        while(!queue.isEmpty()){
            int size = queue.size();
            String url = queue.poll();
            for(String urlStr: htmlParser.getUrls(url)){
                if(!seen.contains(urlStr) && urlStr.indexOf(hostname)>-1){
                    queue.add(urlStr);
                    seen.add(urlStr);
                }
            }
        }
        return new ArrayList<String>(seen);
    }
}