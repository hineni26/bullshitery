import java.util.*;
class BinSearch{
	int arr[];
	int n;
	BinSearch(int nn){
		n=nn;
		arr=new int[n];
	}
	void fillarray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	}
	void sort(){
		int n=arr.length;
        	for (int i=0;i<n-1;i++)
            		for (int j=0;j<n-i-1;j++)
                		if (arr[j]>arr[j+1]){
                    			int temp=arr[j];
                    			arr[j]=arr[j+1];
                    			arr[j+1]=temp;
                }
	}
	int binary_search(int l,int u,int v){
		if (u>=l){
			int mid=(u+l)/2;
            		if (arr[mid]<v){
                		return binary_search(mid+1,u,v);
			}
            		if(arr[mid]>v){
                		return binary_search(l,mid-1,v);
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
		}while(nn<=0);
		BinSearch ob=new BinSearch(nn);
		ob.fillarray();
		System.out.println("Enter the search element");
		int v=new Scanner(System.in).nextInt();
		ob.sort();
		int s=ob.binary_search(0,nn-1,v);
		System.out.println((s!=-1)?"Element found at "+(s+1)+" position":"Element not found");
	}
}
