import java.util.*;
class PrintNonFibonacci{
    void get(){
        System.out.println("Enter the  term");
        int n=new Scanner(System.in).nextInt();
        if(n<=0)
            get();
        int a=1,b=0,d=0;
        for(int i=1;i<n-1;i++){
            a=a+b;
            b=a-b;
            int c=b+1;
            while(c<a){
                d=1;
                System.out.print((c++)+" ");
            }
        }
        if(d==0)
            System.out.println("Non-Fibonacci number(s) don't exist");
    }
    public static void main(String args[]){
        new PrintNonFibonacci().get();
    }
}
