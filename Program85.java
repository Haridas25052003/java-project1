class Program85 {
    public static void main(String[] args) {
        int a[] = { 10, 10, 20, 20, 30, 40, 40, 50, 50 };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    break;
                } else {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}