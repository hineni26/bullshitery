import java.util.*;
class MOBIUS_CLASS{
    int MOBIUS(int n){
        if(n==1)
            return 1;
        int a=0;
        for(int i=2;i<=n;){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            if(c==2){
                if(n%i==0){
                    if((n/i)%i==0)
                        return 0;
                    else
                        i++;
                    a++;
                }
                else
                    i++;
            }
            else
                i++;
        }
        return (int)Math.pow(-1,a);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter the no.");
            n=sc.nextInt();
        }while(n<=0);
        System.out.println(new MOBIUS_CLASS().MOBIUS(n));
    }
}
