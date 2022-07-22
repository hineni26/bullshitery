import java.util.*;
class CaesarCipher{
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        if(s.length()<4||s.length()>99){
            get();
        }
        String a="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                a+=(char)(((s.charAt(i)-'a')+13)%26 +'a');
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                a+= (char)(((s.charAt(i)-'A')+13)%26+'A');
            else
                a+=(char)s.charAt(i);
        }
        System.out.println(a);
    }
    public static void main(String args[]){
        new CaesarCipher().get();
    }
}
