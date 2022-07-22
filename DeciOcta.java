import java.util.*;
class DeciOcta{
	int n;
	int oct;
	DeciOcta(){
		n=0;
		oct=0;
	}
	void getnum(int nn){
		n=nn;
	}
	void deci_oct(){
		if(n>0){
			int b=n%8;
			n/=8;
			deci_oct();
			oct=(oct*10)+b;
		}
	}
	void show(){
		System.out.println("Decimal: "+n);
		deci_oct();
		System.out.println("Octal: "+oct);
	}
	public static void main(String args[]){
		DeciOcta ob=new DeciOcta();
		System.out.println("Enter the number");
		ob.getnum(new Scanner(System.in).nextInt());
		ob.show();
	}
}
