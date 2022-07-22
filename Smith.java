import java.util.*;
class Smith{
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n<=0)
            get();
        if(isSmith(n))
            System.out.println("Smith no.");
        else
            System.out.println("Not Smith no.");
    }
    boolean isSmith(int n){
        return primeFact(n,2)==sumDig(n);
    }
    int sumDig(int a){
        if(a==0)
            return 0;
        return (a%10)+sumDig(a/10);
    }
    int primeFact(int a,int b){
        if(a<b)
            return 0;
        int c=0;
        for(int i=1;i<=b;i++){
            if(b%i==0)
                c++;
        }
        if(c==2){
            if(a%b==0){
                return sumDig(b)+primeFact(a/b,b);
            }
        }
        return primeFact(a,b+1);
    }
    public static void main(String args[]){
        new Smith().get();
    }
}
