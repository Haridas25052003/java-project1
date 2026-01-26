//count charater of string
class Program122 {
    public static void main(String[] args) {
        String s = "programming";
        int count = 0;
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            count++;
        }
        System.out.println(count);
    }
}