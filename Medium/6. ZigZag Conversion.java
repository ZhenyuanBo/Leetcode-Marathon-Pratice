class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List < StringBuilder > rows = new ArrayList < > ();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        boolean goingDown = false;
        int rowNum = 0;

        for (int i = 0; i < s.length(); i++) {
            rows.get(rowNum).append(s.charAt(i));
            if (rowNum == 0 || rowNum == numRows - 1) goingDown = !goingDown;
            rowNum += goingDown ? 1 : -1;
        }

        String res = "";
        for (StringBuilder sb: rows) {
            res += sb.toString();
        }

        return res;
    }
}