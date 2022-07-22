#000000#7F7F7F#800080#000000#000000import java.util.*;
class Admission{
	int Adno[];
	Admission(){
		Adno=new int[100];
	}
	void fillArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements in ascending order");
		Adno[0]=sc.nextInt();
		for(int i=1;i<100;i++){
			Adno[i]=sc.nextInt();
			if(Adno[i]<Adno[i-1])
				i--;
		}
	}
	int binSearch(int l,int u,int v){
		int m=(u+l)/2;
		if(Adno[m]==v)
			return 1;
		else if(Adno[m]>v)
			return binSearch(l,m-1,v);
		else if(Adno[m]<v)
			return binSearch(m+1,u,v);
		return -1;
	}
	public static void main(String args[]){
		Admission ob=new Admission();
		ob.fillArray();
		System.out.println("Enter the search number");
		if(ob.binSearch(0,99,new Scanner(System.in).nextInt())==1)
			System.out.println("Element found ");
		else
			System.out.println("Element not found");
	}
}
