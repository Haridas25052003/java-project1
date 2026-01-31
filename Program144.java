import java.util.HashSet;
import java.util.Arrays;

class Program144 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 40, 50 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
        Arrays.sort(set);
        System.out.println(set);
    }
}