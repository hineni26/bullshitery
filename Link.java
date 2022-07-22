import java.util.Scanner;
class Link{
    private int[] Ink;
    private int max;
    private int begin;
    private int end;
    Link(int mm){
        max = mm;
        begin = 0;
        end = 0;
        Ink = new int[max];
    }
    void addlink(int v){
        if(end==max){
            System.out.println("OUT OF SIZE");
        }
        else{
            Ink[end++] = v;
        }
    }
    int dellink(){
        if(end==begin){
            System.out.println("EMPTY");
            return -99;
        }
        else{
            return Ink[--end];
        }
    }
    void display(){
        for(int i = 0; i < end; i++)
          System.out.println(Ink[i]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter stack size, max. : 100");
            n = sc.nextInt();
        }while(n <= 0 || n > 100);
        Link ob = new Link(n);
        char ch;
        do{
            System.out.println("Press 1 for push, 2 for pop, 3 for display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the element to be pushed");
                int k = new Scanner(System.in).nextInt();
                ob.addlink(k);
                break;
                case 2: System.out.println(ob.dellink());
                break;
                case 3: ob.display();
                break;
                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue (y/n)");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
    }
}
