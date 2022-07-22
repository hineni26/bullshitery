import java.util.*;
public class OctDecRec {
    int oct;
    int dec;
    int i;
    OctDecRec(int oc){
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
	if(oct==0)
		return;
        int d=oct%10;
	oct/=10;
	dec+=(int)Math.pow(8,i++)*d;
	octalDec();
    }
    public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the octal no");
	    int oct=sc.nextInt();
	    OctDecRec ob;
	    if(checkOct(oct)){
		    ob=new OctDecRec(oct);
	    	    ob.octalDec();
	    	    ob.display();
	    }
	    else
		    System.out.println("Not octal no.");
    }
}
