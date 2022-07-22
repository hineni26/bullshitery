import java.util.Scanner;
class Dequeue{
    private int[] arr;
    private int lim;
    private int front;
    private int rear;
    Dequeue(int l){
        lim = l;
        front = lim - 1; 
        rear = 0;
        arr = new int[lim];
    }
    void addfront(int v){
        if(front==-1){
            System.out.println("Overflow from front");
        }
        else{
            arr[front--] = v;
        }
    }
    void addrear(int v){
        if(rear==lim){
            System.out.println("Overflow from rear");
        }
        else{
            arr[rear++] = v;
        }
    }
    int popfront(){
        if(front == lim-1){
            return -9999;
        }
        else{
            return arr[++front];
        }
    }
    int poprear(){
        if(rear == 0){
            return -9999;
        }
        else{
            return arr[--rear];
        }
    }
    void display(){
        for(int i = 0; i < arr.length; i++)
          System.out.println(arr[i]);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter stack size");
            n = sc.nextInt();
        }while(n <= 0 || n > 100);
        Dequeue ob = new Dequeue(n);
        char ch;
        do{
            System.out.println("Press 1 for addfront, 2 for addrear, 3 for popfront, 4 for poprear, 5 for display");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            int k;
            switch(choice){
                case 1: System.out.println("Enter the element to be pushed from front");
                k = new Scanner(System.in).nextInt();
                ob.addfront(k);
                break;
                case 2:
                System.out.println("Enter the element to be pushed from rear");
                k = new Scanner(System.in).nextInt();
                ob.addrear(k);
                break;
                case 3: System.out.println("Popped: " + ob.popfront());
                break;
                case 4: System.out.println("Popped: " + ob.poprear());
                break;
                case 5: ob.display();
                break;
                default: System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue (y/n)");
            ch = sc.next().charAt(0);
        }while(ch == 'Y' || ch == 'y');
    }
}
