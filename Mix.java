import java.util.Scanner;
class Mix{
    private String wrd;
    private int len;
    Mix(){
        wrd = "";
        len = 0;
    }
    void feedword(){
        System.out.println("Enter a word");
        wrd = new Scanner(System.in).next().toUpperCase();
        len = wrd.length();
    }
    void mix_word(Mix P, Mix Q){
        for(int i = 0; i < (P.len>Q.len?P.len:Q.len); i++){
            if(i<P.len)
              wrd += P.wrd.charAt(i);
            if(i<Q.len)
              wrd += Q.wrd.charAt(i);
            }
        }
    void display(){
        System.out.println(wrd);
    }
    public static void main(String[] args){
        Mix P = new Mix();
        System.out.println("For the first word: ");
        P.feedword();
        Mix Q = new Mix();
        System.out.println("For the second word: ");
        Q.feedword();
        Mix ob = new Mix();
        ob.mix_word(P,Q);
        System.out.print("First word: ");
        P.display();
        System.out.print("Second word: ");
        Q.display();
        System.out.print("Mixed word: ");
        ob.display();
    }
}
