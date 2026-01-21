class Program96 {
    public static void main(String[] args) {
        int a = 10, b = 50;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}