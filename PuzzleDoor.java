mport java.util.Scanner;
class PuzzleDoors{
    private int MAX;
    private int N;
    private String[] ar;
    private String[] disp;
    private int index;
    void input(){
        do{
            System.out.println("Enter number of test cases. Max: 10");
            MAX = new Scanner(System.in).nextInt();
        }while(MAX <= 0 || MAX > 10);
        disp = new String[MAX];
        index = 0;
        for(int i = 0; i < MAX; i++){
            do{
                System.out.println("Enter number of plates (between 1 to 1000)");
                N = new Scanner(System.in).nextInt();
            }while(N < 1 || N > 1000);
            ar = new String[N];
            System.out.println("For " + N + " plates, enter a word for each plate");
            for(int j = 0; j < N; j++){
                do{
                    ar[j] = new Scanner(System.in).next().toLowerCase();
                }while(ar[j].length() < 2 || ar[j].length() > 100);
            }
            isOrdered();
        }
        display();
    }
    void isOrdered(){
        String[] ar1 = ar.clone();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i == j)
                    continue;
                if(ar[i].charAt(ar[i].length()-1)==ar1[j].charAt(0)){
                    ar1[j] = " ";
                    break;
                }
            }
        }
        int c = 0;
        for(int i = 0; i < N; i++){
            if(!ar1[i].equals(" "))
                c++;
        }
        if(c > 1)
            disp[index++] = "The door cannot be opened";
        else
            disp[index++] = "Proper Ordering is possible";
        }
    void display(){
        for(String i: disp){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        new PuzzleDoors().input();
    }
}
