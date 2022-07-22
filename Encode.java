import java.util.*;
class Encode{
    void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine();
        s=s.toUpperCase();
        String a[]=s.split(" ");
        String out="";
        for(int i=0;i<a.length;i++){
            int vow=-1 ;
            for(int n=0;n<a[i].length();n++)
                if("AEIOU".indexOf(a[i].charAt(n))>-1)
                    vow=n;
            if(vow!=-1){
                out+=a[i].substring(vow)+a[i].substring(0, vow)+"AY " ;
            }
            else
            {
                out+=a[i]+" ";
            }
        }
        System.out.println(out);
    }
    public static void main(String args[]){
        new Encode().get();
    }
}
