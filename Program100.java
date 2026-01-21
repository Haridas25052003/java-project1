class Program100 {
    public static void main(String[] args) {
        int num = 56789, rev = 0, temp = num;

        while (num != 0) {
            rev *= 10;
            rev += num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}