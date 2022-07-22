import java.util.*;
class Words{
    String sen;
    Words(String s){
        sen=s;
    }
    void show(){
        System.out.println(sen);
    }
    String extractWord(String s){
        if(s.charAt(0) == 32)
          return "";
        else
           return s.charAt(0) + extractWord(s.substring(1,s.length()));
    }
    void deleString(){
        String s = "";
        while(sen.length()>0){
            String s1 = extractWord(sen);
            if(s1.length() == 1)
                s += s1 + "*" + " ";
            else if(s1.length() == 2)
                s += s1.charAt(0) + "*" + s1.charAt(1) + " ";
            else
                s += s1.charAt(0) + "" + s1.charAt(s1.length()-1) + " ";
            if(s1.length()+1 < sen.length())
                sen = sen.substring(s1.length()+1,sen.length());
                else
                sen = "";
            }
        sen = s;
    }
    public static void main(String[] args){
        System.out.println("Enter a sentence");
        Words ob = new Words(new Scanner(System.in).nextLine().trim().toLowerCase() + " ");
        ob.show();
        ob.deleString();
        ob.show();
    }
}
