import java.util.*;
class Emirp{
	int n;
	int rev;
	int f;
	Emirp(int nn){
		n=nn;
		rev=0;
		f=2;
	}
	int isPrime(int x){
		if(n==x)
			return 1;
		else if(n%x==0)
			return 0;
		else
			return isPrime(x+1);
	}
	void isEmirp(){
        int c=n;
        while(c>0){
                rev=(rev*10)+(c%10);
                c/=10;
                }
		if(isPrime(f)==1){
			n=rev;
			if(isPrime(f)==1)
				System.out.println("Emirp number");
			else
				System.out.println("Both not Prime");
		}
		else
			System.out.println("Both not Prime");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Emirp ob=new Emirp(sc.nextInt());
		ob.isEmirp();
	}
}
