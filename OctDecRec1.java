import java.util.*;
public class OctDecRec1{
    int oct;
    int dec;
    int i;
    OctDecRec1(int oc){
        oct=oc;
        dec=0;
        i=0;
    }
    void display(){
        System.out.println("Decimal= "+dec);
    }
    static boolean checkOct(int p){
        while(p>0){
            if(p%10==9||p%10==8)
                return false;
            p/=10;
        }
        return true;
    }
    void octalDec(){
	if(oct>0){
		int b=oct%10;
		dec=dec+b*(int)Math.pow(8,i);
		i++;
		oct/=10;
		octalDec();
	}
    }
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int oct;
	    System.out.println("Enter the octal no");
	    do{
		    oct=sc.nextInt();
	    }while(oct<=0);
	    if(checkOct(oct)){
		    OctDecRec1 ob=new OctDecRec1(oct);
	    	    ob.octalDec();
	    	    ob.display();
	    }
	    else
		    System.out.println("Not octal no.");
    }
}
