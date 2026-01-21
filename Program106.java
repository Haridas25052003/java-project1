//missing number from the array
class Program106 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5 };
        int n = 5;
        int TotalSum = n * (n + 1) / 2;
        int ArraySum = 0;
        for (int i = 0; i < a.length; i++) {
            ArraySum += a[i];
        }
        int missingNumber = TotalSum - ArraySum;
        System.out.println(missingNumber);
    }
}