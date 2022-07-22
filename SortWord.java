import java.util.*;
class SortWord{
    String txt;
    int len;
    SortWord(){
        txt="";
        len=0;
    }
    void readTxt(){
        System.out.println("Enter the word");
        txt=new Scanner(System.in).next();
        txt=txt.toLowerCase();
        len=txt.length();
    }
    void sortTxt(){
        char c[]=txt.toCharArray();
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(c[j]>c[j+1]){
                  char k=c[j];
                  c[j]=c[j+1];
                  c[j+1]=k;
                }
            }
        }
        txt=txt.valueOf(c);
        System.out.println(txt);
    }
    void changeTxt(){
        char c[]=txt.toCharArray();
        for(int i=0;i<len;i++){
            if("aeiou".indexOf(c[i])!=-1)
                c[i]=Character.toUpperCase(c[i]);
        }
        txt=txt.valueOf(c);
    }
    void disp(){
        System.out.println("Changed String: "+txt);
    }
    public static void main(String args[]){
        SortWord ob=new SortWord();
        ob.readTxt();
        ob.sortTxt();
        ob.changeTxt();
        ob.disp();
    }
}
