import java.util.*;
class Revstr{
	String Str;
	String Revst;
	void getStr(){
		Scanner sc=new Scanner(System.in);
		Str=sc.next();
	}
	void recReverse(String a){
		Revst=Revst+a.charAt(a.length()-1);
		if(a.length()>1)
			recReverse(a.substring(0,a.length()-1));
	}
	void check(){
		Revst="";
		recReverse(Str);
		if(Revst.equals(Str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String args[]){
		Revstr ob=new Revstr();
		ob.getStr();
		ob.check();
	}
}
