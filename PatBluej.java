import java.util.*;
class PatBluej{
	void get(){
		String a=new Scanner(System.in).next();
		for(int i=0;i<a.length();i++){
			for(int j=a.length()-i;j>=1;j--)
				System.out.print(a.charAt(i));
		        System.out.println();
		}
	}
	public static void main(String args[]){
		new PatBluej().get();
	}
}
