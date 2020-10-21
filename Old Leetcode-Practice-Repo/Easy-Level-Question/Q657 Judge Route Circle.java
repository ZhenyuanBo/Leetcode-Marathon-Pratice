class Solution {
    public boolean judgeCircle(String moves) {

        int leftMove = -1;
        int rightMove = 1;
        int upMove = 1;
        int downMove = -1;
        int sum = 0;

        for(int i=0; i<moves.length();i++){
            char currChar = moves.charAt(i);

            switch(currChar){
                case 'U':
                    sum += upMove;
                    break;
                case 'D':
                    sum += downMove;
                    break;
                case 'L':
                    sum += leftMove;
                    break;
                case 'R':
                    sum += rightMove;
                    break;
            }
        }

        if(sum == 0){
            return true;
        }

        return false;
    }
}