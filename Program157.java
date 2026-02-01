
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
import java.util.Arrays;

class Program157 {
    public static void main(String[] args) {
        int[] a = { 2, 3, 5 };
        int[] b = { 1, 6, 9 };

        Arrays.sort(a);
        Arrays.sort(b);
        int c[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            c[i + a.length] = b[i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        int mid = c.length / 2;
        System.out.println(c[mid]);
    }
}