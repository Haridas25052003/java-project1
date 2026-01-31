//finding the largest element in arrayand also the secondlargest number form arrayand
class Program150 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60 };
        int max = 0;
        int secondmax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                secondmax = max;
                max = a[i];
            } else if (a[i] > secondmax && a[i] != max) {
                secondmax = a[i];
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
    }
}