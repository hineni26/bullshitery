import java.util.*;
class Frequency{
	String text;
	int countand;
	int countan;
	int len;
	Frequency(){
		text="";
		countand=0;
		countan=0;
		len=text.length();
	}
	void accept(String n){
		n=n.toLowerCase();
		text=n;
		len=text.length();
	}
	void checkandfreq(){
		String a[]=text.split(" ");
		for(int i=0;i<a.length;i++){
			if(a[i].equals("and"))
				countand++;
		}
	}
	void checkanfreq(){
                  String a[]=text.split(" ");
                  for(int i=0;i<a.length;i++){
                          if(a[i].equals("an"))
                                  countan++;
                  }
	}
	void display(){
		System.out.println("And frequency= "+countand"/n an frequency= "+countan);
	}
	public static void main(String args[]){
		Frequency ob=new Frequency();
		System.out.println("Enter the sentence");
		ob.accept(new Scanner(System.in).nextLine());
		ob.checkandfreq();
		ob.checkanfreq();
		ob.display();
	}
}
