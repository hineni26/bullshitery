import java.util.*;
class Disarium{
	int num;
	int size;
	Disarium(int nn){
		num=nn;
		size=0;
	}
	void countDigit(){
		size=(int)(Math.log10(num)+1);
	}
	int sumDigits(int n,int p){
		if(n==0)
			return 0;
		else
			return (int)(Math.pow(n%10,p))+sumDigits(n/10,--p);
	}
	void check(){
		countDigit();
		if(sumDigits(num,size)==num)
			System.out.println("Disarium no.");
		else
			System.out.println("Not Disarium no.");
	}
	public static void main(String args[]){
		Disarium ob=new Disarium(135);
		ob.check();
	}
}
	
