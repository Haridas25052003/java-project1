//prime number
class Program141 {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;
        if (num == 0 || num == 1) {
            isPrime = false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}