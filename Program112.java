import java.util.Arrays;
class Program112 {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DABC";

        char ch[] = s2.toCharArray();
        Arrays.sort(ch);
        String s3 = new String(ch);
        if (s1.equals(s3)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}
