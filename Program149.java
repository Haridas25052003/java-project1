//check that number is prime or not
class Program149 {
    public static void main(String[] args) {
        int n = 12;
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
            System.out.println("primne");
        } else {
            System.out.println("not prime");
        }
    }
}