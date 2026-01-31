//armstrong number
class Program154 {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }
}
