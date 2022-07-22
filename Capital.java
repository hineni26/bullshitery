import java.util.Scanner;
class Capital{
    private String sent;
    private int freq;
    Capital(){
        sent = "";
        freq = 0;
    }
    void input(){
        System.out.println("Enter a sentence");
        sent = new Scanner(System.in).nextLine().trim()+" ";
    }
    boolean isCap(String w){
        return w.charAt(0)<65?false:w.charAt(0)>90?false:true;
    }
    void display(){
        String word = "";
        for(int i = 0; i < sent.length(); i++){
            char ch = sent.charAt(i);
            if(ch == 32){
              if(isCap(word))
                freq++;
              word = "";
            }
            else{
                word+=ch;
            }
        }
        System.out.println("Sentence given: " + sent);
        System.out.println("Frequency of words that start with capital letters: " + freq);
    }
    public static void main(String[] args){
        Capital ob = new Capital();
        ob.input();
        ob.display();
    }
}
