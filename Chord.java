import java.util.*;
class Chord{
    String cd;
    Chord(){
        cd="";
    }
    void fnInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        cd=sc.nextLine();
    }
    void fnOperate(){
        if(isValid()){
            String a[]=cd.split(" ");
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]+" : "+fnVowel(a[i]));
            }
        }
        else
            System.out.println("Invalid");
    }
    boolean isValid(){
        for(int i=0;i<cd.length()-1;i++){
            if(cd.charAt(i)==32 && cd.charAt(i+1)==32)
                return false;
        }
        return true;
    }
    int fnVowel(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1)
                c++;
        }
        return c;
    }
    public static void main(String args[]){
        Chord ob=new Chord();
        ob.fnInput();
        ob.fnOperate();
    }
}
