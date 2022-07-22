import java.util.*;
class Mat_image{
	int a[][];
	int ar[][];
	int m;
	int n;
	Mat_image(){
		m=0;
		n=0;
	}
	Mat_image(int mm,int nn){
		m=mm;
		n=nn;
		a=new int[m][n];
		ar=new int[m][n];
	}
	void getmat(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
	}
	void mirror_mat(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				ar[i][j]=a[i][n-j-1];
			}
		}
	}
	void display(){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row and column");
		Mat_image ob=new Mat_image();
		Mat_image ob1=new Mat_image(sc.nextInt(),sc.nextInt());
		ob1.getmat();
		ob1.mirror_mat();
		ob1.display();
	}
}
