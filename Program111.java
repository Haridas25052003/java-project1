class Program111 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5 };
        int n=5;
        int TotalSum = 0;
        int expectedSum = n * (n + 1) / 2;
        for (int i = 0; i < a.length; i++) {
            TotalSum += a[i];
        }
        System.out.println(expectedSum - TotalSum);
    }

}
