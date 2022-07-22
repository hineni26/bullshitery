import java.util.Scanner;
class TheString{
    private String str;
    private int len;
    private int wordCount;
    private int cons;
    TheString(){
        str = "";
        len = 0;
        wordCount = 0;
        cons = 0;
    }
    TheString(String ds){
        str = ds;
        len = str.length();
    }
    void countFreq(){
        for(int i = 0; i < len; i++){
            if(str.charAt(i) == 32)
              wordCount++;
            if("AEIOUaeiou".indexOf(str.charAt(i))<0 && Character.isLetter(str.charAt(i)))
              cons++;
            }
        wordCount++;
    }
    void display(){
        System.out.println("String: " + str);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of consonants: " + cons);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String (max: 100 characters) (put only one space between each character)");
        String ds = new Scanner(System.in).nextLine().trim();
        for(int i = 0; i < ds.length()-1; i++){
            while(ds.length()>100||(ds.charAt(i)==32 && ds.charAt(i+1)==32)){
              System.out.println("Please try again");
              ds = new Scanner(System.in).nextLine().trim();
              i = 0;
            }
        }
        TheString ob = new TheString(ds);
        ob.countFreq();
        ob.display();
    }
}
