import java.util.*;
import java.io.*;
class CopyFiles{
    void copy() throws IOException{
        FileReader fr=new FileReader("/home/ahan/Documents/Java/Txts/Cp1.txt");
        BufferedReader br=new BufferedReader(fr);
        FileOutputStream fos=new FileOutputStream("/home/ahan/Documents/Java/Txts/Cp2.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        String tx;
        while((tx = br.readLine()) != null)
            dos.writeUTF(tx);
        br.close();
    }
    public static void main(String args[])throws IOException{
        new CopyFiles().copy();
    }
}
