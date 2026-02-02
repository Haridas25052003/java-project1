/*
A
BB
CCC
DDDD
EEEEE

1
22
333
4444
55555
*/
class Program162
{
    public static void main(String[]args){
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}