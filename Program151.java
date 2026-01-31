
//remvoe duplicate
import java.util.HashSet;

class Program151 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 10, 30, 40, 50, 50 };

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set);
    }
}