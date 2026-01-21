//remove duplicate character from the string
class Program109 {
    public static void main(String[] args) {
        String s = "java";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!result.contains(s.charAt(i) + "")) {
                result += s.charAt(i);
            }
        }
        System.out.println(result);
    }
}