public class Program171 {
    public static void main(String[] args) {
        
        int num=121, temp=num, rev=0;
        while(num!=0){
            rev*=10;
            rev+=num%10;
            num/=10;
        }
        System.out.println(temp==rev);
    }
}
