public class Codec {
    
    private String host = "http://tinyurl.com";
    Map<Integer, String> map = new HashMap<Integer, String>();
    
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int key = longUrl.hashCode();
        map.put(key, longUrl);
        String shortenedUrl = host + key;
        return shortenedUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int key = Integer.parseInt(shortUrl.replace(host,""));
        return map.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));