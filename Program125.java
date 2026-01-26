//find largest number among three numbers
class Program125 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is larger");

        } else if (b > c) {
            System.out.println("b is larger");

        } else {
            System.out.println("c is larger");
        }
    }
}