/class Solution {
    public String tree2str(TreeNode t) {

        if(t == null){
        	return "";
        }

        String result = Integer.toString(t.val);
        String leftSearch = tree2str(t.left);
        String rightSearch = tree2str(t.right);

        if(leftSearch == "" && rightSearch == ""){
        	return result;
        }

        if(rightSearch == ""){
        	return result + "(" + leftSearch + ")";
        }

        if(leftSearch == "" ){
        	return result + "()" + "(" + rightSearch + ")";
        }


        return result + "(" + leftSearch + ")" + "("+rightSearch + ")";
     }
}