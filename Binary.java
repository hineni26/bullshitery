import java.util.*;
class Binary{
	int A[];
	int n;
	int l;
	int u;
	Binary(int nn){
		n=nn;
		A=new int[n];
		l=0;
		u=A.length-1;
	}
	void readdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		A[0]=sc.nextInt();
		for(int i=1;i<A.length;i++){
			A[i]=sc.nextInt();
			if(A[i]<A[i-1])
				i--;
		}
	}
	int binary_search(int v){
		if (u>=l){
			int mid=(u+l)/2;
            		if (A[mid]<v){
				l=mid+1;
                		return binary_search(v);
			}
            		if(A[mid]>v){
				u=mid-1;
                		return binary_search(v);
			}
            		return mid;
        	}
        	return -1;
	}
	public static void main(String args[]){
		int nn;
		do{
			System.out.println("Enter the size");
			nn=new Scanner(System.in).nextInt();
		}while(nn<=0 || nn>100);
		Binary ob=new Binary(nn);
		ob.readdata();
		System.out.println("Enter the search element");
		int v=new Scanner(System.in).nextInt();
		int s=ob.binary_search(v);
		System.out.println((s!=-1)?"Element found at "+(s+1)+" position":"Element not found");
	}
}
