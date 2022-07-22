import java.util.Scanner;
class WordPile{
    private char[] ch;
    private int capacity;
    private int top;
    WordPile(int cap){
        capacity = cap;
        top = -1;
        ch = new char[capacity];
    }
    void pushChar(char v){
        if(top==capacity-1){
            System.out.println("WordPile is full");
        }
        else{
            ch[++top] = v;
        }
    }
    char popChar(){
        if(top == -1){
            return '\\';
        }
        else{
            return ch[top--];
        }
    }
    void display(){
        for(int i = 0; i <= top; i++){
            System.out.println(ch[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter stack size");
            n = sc.nextInt();
        }while(n <= 0);
        WordPile ob = new WordPile(n);
        char ch;
        do{
            System.out.println("Press 1 for push, 2 for pop, 3 for display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1: System.out.println("Enter the element to be pushed");
                char k = new Scanner(System.in).next().charAt(0);
                ob.pushChar(k);
                break;
                case 2: ob.popChar();
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
