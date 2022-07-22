import java.util.Scanner;
class Register{
    private String[] stud;
    private int cap;
    private int top;
    Register(int max) {
        cap = max;
        top = -1;
        stud = new String[cap];
    } 
    void push(String n) {
        stud[++top] = n;
        if(top<cap-1){
            System.out.println("Enter a name");
            push(new Scanner(System.in).nextLine());
        }
        else{
            System.out.println("Overflow");
        }
        display();
    }
    String pop() {
        if(top>-1) {
            String s = stud[top];
            stud[top--] = "";
            return s;
        }
        else
            return "$$";
    }
    void display() {
        System.out.println(pop());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        do{
            System.out.println("Enter number of names in the register (max: 100)");
            k=sc.nextInt();
        }while(k<=0);
        Register ob = new Register(k);
        System.out.println("Enter a name");
        ob.push(new Scanner(System.in).nextLine());
    }
}
