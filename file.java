class Solution {

    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs.length == 0 || strs[0].isEmpty()) {
            return res;
        }
        if (strs.length == 1) {
            return strs[0];
        }
        for (int j = 0; ; j++) {
            for (int i = 0; i < strs.length; i++) {
                if (j == strs[i].length()) {
                    return res;
                }
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    return res;
                }
            }
            res += strs[0].charAt(j);
        }
    }

    public static void main(String[] args) {
        String []arr={"flower","flight","flow"};
       longestCommonPrefix(arr);
    }
}
