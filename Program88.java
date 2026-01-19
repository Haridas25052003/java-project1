//palindrome number
class Program88 {
    public static void main(String[] args) {
        int n = 121, rev = 0, temp = n;
        while (n != 0) {
            rev *= 10;
            rev += n % 10;
            n /= 10;
        }
        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}