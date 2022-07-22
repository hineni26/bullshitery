import java.io.*;
class BlankToSpace{
    void get()throws IOException{
        FileReader fr=new FileReader("/home/ahan/Documents/Java/Txts/BlankToSpace.txt");
        BufferedReader br=new BufferedReader(fr);
        String tx=br.readLine();
        String[] ar=tx.split(" ");
        br.close();
        FileOutputStream fos=new FileOutputStream("/home/ahan/Documents/Java/Txts/BlankToSpace.dat");
        DataOutputStream dos=new DataOutputStream(fos);
        String s="";
        for(int i=0;i<ar.length;i++){
            s+=ar[i]+" ";
        }
        dos.writeUTF(s);
    }
    public static void main(String args[])throws IOException{
        new BlankToSpace().get();
    }
}
