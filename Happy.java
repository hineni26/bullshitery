import java.util.*;
class Happy{
	int n;
	Happy(){
		n=0;
	}
	void getnum(int nn){
		n=nn;
	}
	int sum_sq_digits(int x){
		if(x==0)
			return x;
		else
			return (x%10)*(x%10)+sum_sq_digits(x/10);
	}
	void isHappy(){
		while(n>9)
			n=sum_sq_digits(n);
		if(n==1)
			System.out.println("Happy no.");
		else
			System.out.println("Not Happy no.");
	}
	public static void main(String args[]){
		Happy ob=new Happy();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		ob.getnum(a);
		ob.isHappy();
	}
}
