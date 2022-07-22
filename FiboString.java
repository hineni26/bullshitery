import java.util.*;
class FiboString{
    private String x;
    private String y;
    private String z;
    private int n;
    FiboString(){
        x = "a";
        y = "b";
        z = "ba";
    }
    void accept(){
        do{
            System.out.println("Enter number of terms in the series");
            n=new Scanner(System.in).nextInt();
        }while(n<=0);
    }
    void generate(){
        if(n==1)
          System.out.print(x);
        else{
          System.out.print(x+" "+y+" ");
          for(int i=3;i<=n;i++){
             z=y+x;
             System.out.print(z+ " ");
             x=y;
             y=z;
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        FiboString ob = new FiboString();
        ob.accept();
        ob.generate();
    }
}
