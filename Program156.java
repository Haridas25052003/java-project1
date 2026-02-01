//Input: s = "abcabcbb"
//Output: 3

class Program156 {
    public static void main(String[] args) {
        String s = "abcdefghijkl";
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    max = j - i;
                }
            }
        }
        System.out.println(max);
    }
}