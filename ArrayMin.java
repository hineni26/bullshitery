import java.util.*;
class ArrayMin{
    int arr[][];
    int m;
    ArrayMin(int mm){
        m=mm;
        arr=new arr[m][m];
    }
    void readarray(){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

            }
        }
    }
    void small(){
        for(int i=0;i<arr.length;i++){
            int min=arr[i][0];
            for(int j=0;j<arr.length;j++){
                if(min>arr[i][j])
                    min=arr[i][j];
            }
            System.out.println("Min element= "+min);
        }
    }
    void display(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m;
        System.out.println("Enter the size");
        do{m=sc.nextInt();
        }while(m<=0);
        ArrayMin ob=new ArrayMin(m);
        ob.readarray();
        ob.display();
        ob.small();
    }
}
