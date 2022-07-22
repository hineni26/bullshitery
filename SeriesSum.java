import java.util.*;
class SeriesSum{
	int x;
	int n;
	double sum;
	SeriesSum(int xx,int nn){
		x=xx;
		n=nn;
	}
	double findFact(int m){
		if(m==1)
			return m;
		else
			return m*(findFact(m-1));
	}
	double findPower(int x,int y){
		if(y==1)
			return x;
		else
			return x*findPower(x,y-1);
	}
	void calculate(){
		for(int i=1;i<=n;i++){
			sum+=findPower(x,i*2)/findFact(i*2-1);
		}
	}
	void display(){
		System.out.println("The sum= "+sum);
	}
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		do{
		   System.out.println("Enter the number and no. of terms");
		   a=sc.nextInt();
		   b=sc.nextInt();
		}while(b<=0);
		SeriesSum ob=new SeriesSum(a,b);
		ob.calculate();
		ob.display();
	}
}
