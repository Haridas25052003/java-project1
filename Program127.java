//find the missing number in array
class Program127 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 5 };
        int n = 5;
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < n; i++) {
            arraySum += i;
        }
        System.out.println(totalSum - arraySum);
    }
}