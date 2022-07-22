import java.util.*;
class MatrixDecimal{
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.print("M= ");
        int M=sc.nextInt();
        System.out.println();
        System.out.print("N= ");
        int N=sc.nextInt();
        System.out.println();
        if(M>=10 || M<=0 || N<=2 || N>=6){
            System.out.println("OUT OF RANGE");
            return;
        }
        int A[][]=new int[M][N];
        for(int i=0;i<M;i++){
            int c=0;
            for(int j=0;j<N;j++){
                A[i][j]=sc.nextInt();
            }
            for(int j=0;j<N;j++){
                if(A[i][j]<0 || A[i][j]>7){
                    System.out.println("INVALID INPUT");
                    c=1;
                }
            }
            if(c==1)
                return;
        }
        display(A);
    }
    void display(int a[][]){
        System.out.println("FILLED MATRIX");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("DECIMAL EQIVALENT");
        for(int i=0;i<a.length;i++){
            int b=0,c=0;
            for(int j=a[0].length-1;j>=0;j--){
                b+=a[i][j]*(int)Math.pow(8,c++);
            }
            System.out.println(b);
        }
    }
    public static void main(String args[]){
        new MatrixDecimal().get();
    }
}
