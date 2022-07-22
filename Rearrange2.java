import java.util.Scanner;
class Rearrange2{
    private String wrd;
    private String newwrd;
    Rearrange2(){
        wrd = "";
        newwrd = "";
    }
    void readword(){
        System.out.println("Enter a word");
        wrd = new Scanner(System.in).next().toUpperCase();
    }
    void freq_vow_con(){
        int a, b;
        a = b = 0;
        for(int i = 0; i < wrd.length(); i++){
            if("AEIOU".indexOf(wrd.charAt(i))>=0)
              a++;
            else
              b++;
        }
        System.out.println("Number of vowels: " + a);
        System.out.println("Number of consonants: " + b);
    }
    void arrange(){
        for(int i = 0; i < wrd.length(); i++){
            if("AEIOU".indexOf(wrd.charAt(i))>=0){
              newwrd += wrd.charAt(i);
            }
        }
        for(int i = 0; i < wrd.length(); i++){
            if("AEIOU".indexOf(wrd.charAt(i))<0){
              newwrd += wrd.charAt(i);
            }
        }
    }
    void display(){
        System.out.println("Original Word: " + wrd);
        System.out.println("Rearranged Word: " + newwrd);
    }
    public static void main(String[] args){
        Rearrange2 ob = new Rearrange2();
        ob.readword();
        ob.freq_vow_con();
        ob.arrange();
        ob.display();
    }
}
