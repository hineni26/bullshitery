import java.util.*;
class ConvertNumDate{
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("DAY NUMBER: ");
        int d1=sc.nextInt();
        System.out.print("YEAR: ");
        int y=sc.nextInt();
        System.out.print("DATE AFTER(N): ");
        int N=sc.nextInt();
        if(d1<=0 || d1>366){
           System.out.print("Day no. out of range ");
           return;
        }
        if(y<=999 || y>9999){
           System.out.print("Invalid year ");
           return;
        }
        if(N<=0 || N>100){
           System.out.print("Date after (N Days out of range) ");
           return;
        }
        day_date(d1,y);
        day_date(d1+N,y);
    }
    boolean isLeap(int y){
        if((y%4==0 && y%100!=0)||(y%400)==0)
          return true;
        else
          return false;
    }
    void day_date(int d,int y){
        int s=0,i=0,p=0;
        String ki="";
        String x[]={"January","February","March","April","May","June","July","August","September","October","November",
        "December"};
        int k[]={31,28,31,30,31,30,31,31,30,31,30,31};
	if(isLeap(y) && d>366){
		y++;
		d-=366;
	}
	else if(d>365){
		y++;
		d-=365;
	}
	if(isLeap(y))
		k[1]+=1;
        while(s<d && i<k.length){
            s=s+k[i];
            i++;
            if(s>=d){
              ki=x[i-1];
              p=k[i-1]-(s-d);
              break;
            }
        }
        System.out.println(p+"th "+ki+" "+y);
    }
    public static void main(String args[]){
            ConvertNumDate ob=new ConvertNumDate();
            ob.input();
        }
}
