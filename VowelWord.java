import java.util.*;
class VowelWord{
    String str;
    int freq;
    VowelWord(){
        str="";
        freq=0;
    }
    void readstr(){
        str=new Scanner(System.in).nextLine();
    }
    void freq_vowel(){
        String s[]=str.split(" ");
        for(int i=0;i<s.length;i++){
            if("AEIOUaeiou".indexOf(s[i].charAt(0))!=-1)
                freq++;
        }
    }
    void display(){
        System.out.println(str+"\n Frequency: "+freq);
    }
    public static void main(String args[]){
        VowelWord ob=new VowelWord();
        ob.readstr();
        ob.freq_vowel();
        ob.display();
    }
}
