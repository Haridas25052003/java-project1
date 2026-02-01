
//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
import java.util.Arrays;

class Program155 {
    public static void main(String[] args) {
        int[] a = { 2, 4, 3 };
        int[] b = { 5, 6, 4 };
        int c[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        // for (int i : c) {
        // System.out.print(i);
        // }
        System.out.println("before sorting");
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(c));

    }
}