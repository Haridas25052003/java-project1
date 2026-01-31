//reverese a number
class Program140 {
    public static void main(String[] args) {
        int num = 1221;
        int temp = num;
        int rev = 0;
        while (num != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        // System.out.println(rev);
        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}