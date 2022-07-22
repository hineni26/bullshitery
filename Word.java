import java.util.*;
class Word{
    String sen;
    Word(String s){
        sen=s;
    }
    void show(){
        System.out.println("Original: "+sen);
        String p=sen;
        sen="";
        String k=extractWord(p+" ");
        System.out.println("Updated: "+sen);
    }
    String extractWord(String s){
        if(s.length()==0)
            return "";
        else if(s.indexOf(" ")!=-1){
            delete(s.substring(0,s.indexOf(' ')));
            return extractWord(s.substring(s.indexOf(' ')+1));
        }
        return "";
    }
    void delete(String s){
        String a;
        if(s.length()>2)
            a=s.charAt(0)+""+s.charAt(s.length()-1);
        else if(s.length()==2)
            a=s.charAt(0)+"*"+s.charAt(1);
        else
            a=s.charAt(0)+"*";
        sen+=a+" ";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sen=sc.nextLine();
        Word ob=new Word(sen);
        ob.show();
    }
}
