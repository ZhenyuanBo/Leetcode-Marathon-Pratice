class Solution {
    public String similarRGB(String color) {
        
        String res="";
        
        //integer value based on a hex value
        int hex1 = Integer.parseInt(color.substring(1), 16);
        
        //r,g,b components
        int ans=0;
        
        for(int r=0; r<16; r++){
            for(int g=0; g<16; g++){
                for(int b=0; b<16; b++){
                    int hex2 = 17*r*(1<<16) + 17*g*(1<<8) + 17*b;
                    if(similarity(hex1, hex2) > similarity(hex1, ans)){
                        ans=hex2;
                    }
                }
            }
        }
        
        return String.format("#%06x", ans);
    }
    private int similarity(int hex1, int hex2){
        int res=0;
        for(int shift=16; shift>=0; shift-=8){
            int col1 = (hex1>>shift)%256;
            int col2 = (hex2>>shift)%256;
            res -= (col1-col2) * (col1-col2);
        }
        return res;
    }
}