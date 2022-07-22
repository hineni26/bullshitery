import java.util.*;
class RearrangeString{
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        String a[]=s.split(" ");
        display(a);
        sort(a);
        display(a);
    }
    void sort(String a[]){
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j].compareTo(a[j+1])>0){
                    String temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    void display(String a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println(".");
    }
    public static void main(String args[]){
        new RearrangeString().get();
    }
}
