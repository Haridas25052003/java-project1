import java.util.Arrays;

class Program158 {
    public static void main(String[] args) {

        int[] a = { 1, 3, 5 };
        int[] b = { 6, 8, 9 };

        int c[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        // c[a.length] = b[0];
        // c[a.length + 1] = b[1];
        // c[a.length + 2] = b[2];
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }

        System.out.println(Arrays.toString(c));
    }
}