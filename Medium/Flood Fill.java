class Solution {
    public class ImageRowCol{
        int row;
        int col;
        public ImageRowCol(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int startingColor = image[sr][sc];
        image[sr][sc] = newColor;
        boolean[][] visited = new boolean[image.length][image[0].length];
        visited[sr][sc] = true;
        int[][] neiDir = {{0,1}, {0,-1}, {1,0}, {-1,0}};
        Stack<ImageRowCol> s = new Stack<>();
        s.add(new ImageRowCol(sr, sc));
        while(!s.isEmpty()){
            ImageRowCol pos = s.pop();
            int r = pos.row;
            int c = pos.col;
            for(int i=0; i<neiDir.length; i++){
                int newR = r+neiDir[i][0];
                int newC = c+neiDir[i][1];
                
                if(newR<0||newC<0||newR>=image.length || newC>=image[0].length || visited[newR][newC]) continue;
                if(image[newR][newC]!=startingColor){
                    continue;
                }else{
                    image[newR][newC] = newColor;
                }
                s.push(new ImageRowCol(newR, newC));
                visited[newR][newC] = true;
            }
        }
        
        return image;
    }
}