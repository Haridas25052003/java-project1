//
import java.util.HashSet;
class Program135 {
    public static void main(String[] args) {
        String s = "java programming";
        char a[] = s.toCharArray();

        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }
}