import java.util.*;
class Change{
	String str;
	String newstr;
	int len;
	Change(){
		str="";
		newstr="";
		len=0;
	}
	void inputword(){
		System.out.println("Enter the word");
		str=new Scanner(System.in).next();
	}
	char caseconvert(char ch){
		if(Character.isLowerCase(ch)
			return Character.toUpperCase(ch);
		return Character.toLowerCase(ch);
	}
	void recchange(int a){
		newstr=newstr+caseconvert(str.charAt(a));
		if(len!=str.length()-1){
			++len;
			recchange(len);
		}
	}
	void display(){
		System.out.println("Original String: "+str+"\nNew String:"+newstr);
	}
	public static void main(String args[]){
		Change ob=new Change();
		ob.inputword();
		ob.recchange(0);
		ob.display();
	}
}
