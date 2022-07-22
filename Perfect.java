import java.util.*;
class Perfect{
	int num;
	Perfect(int nn){
		num=nn;
	}
	int sum_of_factors(int i){
		if(i<=num/2){
			if(num%i==0)
				return i+sum_of_factors(++i);
			else
				return sum_of_factors(++i);
		}
		return 0;
	}
	void check(){
		if(sum_of_factors(1)==num)
			System.out.println("perfect no.");
		else
			System.out.println("Not");
	}
	public static void main(String args[]){
		Perfect ob=new Perfect(28);
		ob.check();
	}
}
