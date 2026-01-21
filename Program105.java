class Program105 {
    public static void main(String[] args) {
        String s = "java is a programming language";
        String rev = "";
        // int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(ch + " " + count);
        }
    }
}