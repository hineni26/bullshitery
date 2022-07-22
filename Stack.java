import java.util.Scanner;
class Stack{
    private String st[];
    private int size;
    private int top; 
    private int ctr;
    Stack(){
        size = 0;
        top = 0;
        ctr = 0;
    }
    Stack(int cap){
        size = cap;
        top = -1;
        st = new String[size];
    }
    void pushname(String s){
        if(top==size-1){
            System.out.println("OVERFLOW");
        }
        else{
            ctr++;
            st[++top] = s;
        }
    }
    String popname(){
        if(top == -1){
            return "UNDERFLOW";
        }
        else{
            ctr--;
            return st[top--];
        }
    }
    void display(){
        for(int i = 0; i < ctr; i++){
            System.out.println(st[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter stack size");
            n = sc.nextInt();
        }while(n <= 0);
        Stack ob = new Stack(n);
        char ch;
        do{
            System.out.println("Press 1 for push, 2 for pop, 3 for display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the element to be pushed");
                String k = new Scanner(System.in).nextLine();
                ob.pushname(k);
                break;
                case 2: System.out.println(ob.popname());
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
