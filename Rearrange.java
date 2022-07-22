import java.util.*;
class Rearrange{
    String Txt;
    String Cxt;
    int len;
    Rearrange(){
        Txt=Cxt="";
        len=0;
    }
    void readWord(){
        System.out.println("Enter the word");
        Txt=new Scanner(System.in).next();
        Txt=Txt.toUpperCase();
        len=Txt.length();
    }
    void convert(){
        if("AEIOU".indexOf(Txt.charAt(0))!=-1){
            Cxt=Txt+"Y";
            return;
        }
        int c=0;
        for(int i=0;i<len;i++){
            if("AEIOU".indexOf(Txt.charAt(i))!=-1){
                c=1;
                Cxt=Txt.substring(i,len)+Txt.substring(0,i)+"C";
                break;
            }
        }
        if(c==0)
            Cxt=Txt+"N";
    }
    void display(){
        System.out.println("Original: "+Txt+"\n Changed: "+Cxt);
    }
    public static void main(String args[]){
        Rearrange ob=new Rearrange();
        ob.readWord();
        ob.convert();
        ob.display();
    }
}
