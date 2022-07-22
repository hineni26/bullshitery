import java.util.*;
class Sentence{
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        if("!.?".indexOf(s.charAt(s.length()-1))==-1)
                get();
        String a[]=s.split(" ");
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i].length();
            a[i]=a[i].toLowerCase();
            if(i==a.length-1)
                b[i]=b[i]-1;
        }
        System.out.println("Original sentence");
        display(a);
        char c=a[a.length-1].charAt(a[a.length-1].length()-1);
        a[a.length-1]=a[a.length-1].substring(0,a[a.length-1].length()-1);
        sort(a,b);
        a[a.length-1]=a[a.length-1]+c;
        char d=a[0].charAt(0);
        a[0]=Character.toUpperCase(d)+a[0].substring(1,a[0].length());
        System.out.println("Updated sentence");
        display(a);
    }
    void sort(String a[],int b[]){
        for(int i=0;i<b.length-i;i++){
            for(int j=0;j<b.length-1-i;j++){
                if(b[j]>b[j+1]){
                    int t=b[j];
                    String ts=a[j];
                    b[j]=b[j+1];
                    a[j]=a[j+1];
                    b[j+1]=t;
                    a[j+1]=ts;
                }
            }
        }
    }
    void display(String a[]){
        for(int i=0;i<a.length;i++){
            if(i==0)
                System.out.print(Character.toUpperCase(a[i].charAt(0))+a[i].substring(1,a[0].length())+" ");
            else
                System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        new Sentence().get();
    }
}
