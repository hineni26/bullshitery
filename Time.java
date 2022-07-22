import java.util.*;
class Time{
	int hour;
	int min;
	Time(){
		hour=0;
		min=0;
	}
	void accept(){
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter the hour");
			hour=sc.nextInt();
		}while(hour<=0);
		do{
			System.out.println("Enter the minutes");
			min=sc.nextInt();
		}while(min<=0 || min >59);
	}
	Time find(Time A,Time B){
		if(A.min-B.min>0)
			A.min=A.min-B.min;
		else{
			A.hour--;
			A.min=60+(A.min-B.min);
		}
		A.hour=A.hour-B.hour;
		return A;
	}
	void display(){
		System.out.println("The Hour: "+this.hour+"\n The minute: "+this.min);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Time A=new Time();
		A.accept();
		Time B=new Time();
		B.accept();
		A=A.find(A,B);
		A.display();
	}
}
