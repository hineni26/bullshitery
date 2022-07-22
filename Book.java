import java.util.*;
class Book{
            private String name[];
            private int max;
            private int point;
            Book(int cap){
                  max=cap+1;
                  name=new String[max];
                  point=-1;
            }
            void tell(){
                  String a="";
                  for(int i=0;i<max;i++){
                       if(!(name[i].equals(""))){
                          a=name[i];
                       }
                  }
                  if(point==-1)
                     System.out.println("SHELF EMPTY");
                  else
                     System.out.println("LAST BOOK: "+a);
            }
            void add(String v){
                 name[++point]=v;
                 if(!(point<max-1))
                    System.out.println("SHELF FULL");
                 else{
                    System.out.println("Enter the Book name");
                    String a=new Scanner(System.in).nextLine();
                    add(a);
                 }
            }
            void display(){
                 for(int i=0;i<max;i++){
                     if(!(name[i].equals(""))){
                        System.out.println(name[i]);
                     }
                 }
            }
            public static void main(String args[]){
                 Scanner sc=new Scanner(System.in);
                 int cap;
                 do{System.out.println("Enter the size");
                    cap=sc.nextInt();
                 }while(cap<=0);
                 Book ob=new Book(cap);
                 System.out.println("Enter name");
                 String a=sc.nextLine();
                 ob.add(a);
            }
}
