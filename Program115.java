//find second largest element in array
class Program115 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 05 };
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

        System.out.println(secondmax);
    }
}