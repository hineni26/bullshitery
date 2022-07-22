import java.util.*;
class Palin{
	int num;
	int revnum;
	Palin(){
		num=revnum=0;
	}
	void accept(){
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	int reverse(int y){
		int c=(int)(Math.log10(y)+1);
		if(c==1){
			return y;
		}
		else{
			return ((y%10)*(int)(Math.pow(10,c-1)))+reverse(y/10);
		}
	}
	void check(){
		accept();
		if(reverse(num)==num)
			System.out.println("Palindrome no.= "+num);
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String args[]){
		Palin ob=new Palin();
		ob.check();
	}
}
