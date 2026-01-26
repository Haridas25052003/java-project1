//check that prime number or not
class Program120 {
    public static void main(String[] args) {
        int n = 13;
        boolean isPrime = true;

        if (n == 0 || n == 1) {
            isPrime = false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}