import java.util.*;
class Paragraph{
    private String para;
    void input(){
        System.out.println("Enter number of sentences in your paragraph");
        int n = new Scanner(System.in).nextInt();
        if(n < 1 || n >= 4)
          System.out.println("Invalid input");
        System.out.println("Enter your paragraph, with only 1 blank space in between each character.");
        para = new Scanner(System.in).nextLine().toUpperCase();
    }
    void count(){
      StringTokenizer st = new StringTokenizer(para,",.? ");
      System.out.println("Number of words: " + st.countTokens());
      String[] s = new String[st.countTokens()];
      String[] s2 = new String[st.countTokens()];
      int[] f = new int[st.countTokens()];
      int index = 0;
      while(st.hasMoreTokens())
        s[index++] = st.nextToken();
      for(int i = 0; i < s.length - 1; i++){
          for(int j = 0; j < s.length - i - 1; j++){
              if(s[j].compareTo(s[j+1])>0){
                  String temp = s[j];
                  s[j] = s[j+1];
                  s[j+1] = temp;
              }
          }
      }
      int u = 1;
      index = 0;
      String word = s[0];
      for(int i = 1; i < s.length; i++){
          if(!word.equals(s[i])){
              s2[index] = word;
              f[index++] = u;
              u = 1;
              word = s[i];
            }
            else
            u++;
        }
      s2[index] = word;
      f[index++] = u;
      for(int i = 0; i < index - 1; i++){
          for(int j = 0; j < index - i - 1; j++){
              if(f[j] > f[j+1]){
               int t = f[j];
               f[j] = f[j+1];
               f[j+1] = t;
               String temp = s2[j];
               s2[j] = s2[j+1];
               s2[j+1] = temp;
            }
          }
          }
      display(s2,f,index);
        }
    void display(String[] s, int[] f, int j){
        System.out.println("Word" + "  " + "Frequency");
        for(int i = 0; i < j; i++){
            System.out.println(s[i] + "\t" + f[i]);
        }
    }
    public static void main(String[] args){
        Paragraph ob = new Paragraph();
        ob.input();
        ob.count();
    }
}
