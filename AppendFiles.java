import java.util.Scanner;
import java.io.*;
class AppendFiles{
    void append() throws IOException{
        FileReader fr=new FileReader("/home/ahan/Documents/Java/Txts/Append1.txt");
        BufferedReader br=new BufferedReader(fr);
        FileReader fr1=new FileReader("/home/ahan/Documents/Java/Txts/Append2.txt");
        BufferedReader br1=new BufferedReader(fr1);
        FileOutputStream fos=new FileOutputStream("/home/ahan/Documents/Java/Txts/AppendOutput.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        String tx;
        String s="";
        while((tx=br.readLine())!=null)
            s+=tx;
        while((tx=br1.readLine())!=null)
            s+="\n"+tx;
        dos.writeUTF(s);
        br.close();
        br1.close();
    }
    public static void main(String args[])throws IOException{
        new AppendFiles().append();
    }
}
