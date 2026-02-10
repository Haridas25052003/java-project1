public class Program173 {
    public static void main(String[] args) {
        
        int n=7;
        boolean isPrime=true;

        if(n==0 || n==1){
            isPrime=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
