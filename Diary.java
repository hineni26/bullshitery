import java.util.Scanner;
class Diary{
    private String[] Q;
    private int size;
    private int start;
    private int end;
    Diary(int max){
        size=max;
        start=0;
        end=0;
        Q=new String[size];
    }
    void pushadd(String n) {
        Q[end++]=n;
        if(end<size){
            start++;
            System.out.println("Enter a address");
            pushadd(new Scanner(System.in).nextLine());
        }
        else{
            System.out.println("NO SPACE");
        
        }
        show();
    }
    String popadd() {
        if(start>-1){
            String s=Q[start];
            Q[start--]="";
            return s;
        }
        else
            return "?????";
    }
    void show() {
        System.out.println(popadd());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        do {
            System.out.println("Enter diary size");
            k = sc.nextInt();
        }while(k<=0);
        Diary ob = new Diary(k);
        System.out.println("Enter an address");
        ob.pushadd(new Scanner(System.in).nextLine());
    }
}
