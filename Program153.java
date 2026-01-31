//count character from a String
class Program153 {
    public static void main(String[] args) {
        String s = "java is powerful";
        int count = 0;
        int count1 = 0;

        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                count++;
            } else {
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
    }
}