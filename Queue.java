import java.util.*;
class Queue{
    private int Que[];
    private int size;
    private int front;
    private int rear;
    Queue (int mm) {
        size=mm;
        front=0;
        rear=0;
        Que=new int[size];
    }
    void addele(int v){
        Que[rear++]=v;
        if(rear<size){
            front++;
            System.out.println("Enter a nunber");
            addele(new Scanner(System.in).nextInt());
        }
        else{
            System.out.println("Overflow");
        }
        display();
    }
    int delete(){
        if(front <0){
            System.out.println("Underflow");
            return -9999;
        }
        else
            return --front;
    }
    void display(){
      	int a=delete();
        if(a>=0){
            System.out.println(Que[a]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int b;
        do{
            System.out.println("Enter integer of max 100 ");
            b=sc.nextInt();
        }while(b<=0||b>100);
        Queue ob=new Queue(b);
        System.out.println("Enter numeber");
        ob.addele(sc.nextInt());
    }
}
