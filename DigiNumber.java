import java.util.Scanner;
class DigiNumber{
    private long num;
    DigiNumber(){
        num = 0l;
    }
    DigiNumber(long l){
        num = l;
    }
    void digitfrequency(){
        for(int i = 0; i <= 9; i++){
            long cp = num;
            int c = 0;
            while(cp > 0){
                int dg = (int)(cp % 10);
                if(dg == i)
                  c++;
                cp/=10;
            }
            System.out.println("Frequency of " + i + " is: " + c);
        }
    }
    long sumDigits(long N){
        if(N==0)
          return 0;
        else
           return N%10 + sumDigits(N/10);
    }
    void printsum(){
        System.out.println("Sum of digits: " + sumDigits(num));
    }
    public static void main(String[] args){
        long n;
        do{
            System.out.println("Enter a number");
            n = new Scanner(System.in).nextLong();
        }while(n<=0);
        DigiNumber ob = new DigiNumber(n);
        ob.digitfrequency();
        ob.printsum();
    }
}
