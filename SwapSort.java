import java.util.*;
class SwapSort{
    private int len;
    private String wrd;
    private String swapwrd;
    private String sortwrd;
    SwapSort(){
        len = 0;
        wrd = "";
        swapwrd = "";
        sortwrd = "";
    }
    void readword(){
        System.out.println("Enter a word");
        wrd=new Scanner(System.in).next();
        wrd=wrd.toUpperCase();
        len = wrd.length();
    }
    void sortword(){
        char[] s = wrd.toCharArray();
        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(s[j] > s[j+1]){
                    char k = s[j];
                    s[j] = s[j+1];
                    s[j+1] = k;
                }
            }
        }
        sortwrd = new String(s);
    }
    void swapchar(){
        swapwrd = wrd.charAt(len-1) + wrd.substring(1,len-1) + wrd.charAt(0) + "";
    }
    void display(){
        System.out.println("Original Word: " + wrd);
        System.out.println("Swapped Word: " + swapwrd);
        System.out.println("Sorted Word: " + sortwrd);
    }
    public static void main(String[] args){
        SwapSort ob = new SwapSort();
        ob.readword();
        ob.swapchar();
        ob.sortword();
        ob.display();
    }
}
