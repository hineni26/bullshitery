import java.util.*;
class Palindrome{
    String str;
    String rev;
    int len;
    Palindrome(){
        str="";
        rev="";
        len=0;
    }
    void accept(){
        System.out.println("Enter the sentence");
        str=new Scanner(System.in).nextLine();
        str=str.toUpperCase();
	len=str.length();
	reverse(str,len);
    }
    void reverse(String  w,int a){
        if(a>0){
            rev+=w.charAt(a-1);
            reverse(w,a-1);
        }
    }
    void show(){
        if(rev.equals(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static void main(String args[]){
	    Palindrome ob=new Palindrome();
	    ob.accept();
	    ob.show();
    }
}
