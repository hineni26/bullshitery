import java.util.*;
class Exchange{
    String sent;
    String rev;
    int size;
    Exchange(){
        sent=rev="";
        size=0;
    }
    void readsentence(){
        System.out.println("Enter a sentence");
        sent=new Scanner(System.in).nextLine();
    }
    void exfirstlast(){
        String s[]=sent.split(" ");
        for(int i=0;i<s.length;i++){
            size=s[i].length();
            if(s[i].length()>1)
                rev+=" "+s[i].charAt(size-1)+s[i].substring(1,size-1)+s[i].charAt(0);
            else
                rev+=" "+s[i];
        }
    }
    void display(){
        System.out.println("Original: "+sent+"\n Updated: "+rev);
    }
    public static void main(String args[]){
        Exchange ob=new Exchange();
        ob.readsentence();
        ob.exfirstlast();
        ob.display();
    }
}
