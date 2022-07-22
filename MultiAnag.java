class MultiAnag{
    void find(){
        for(int i = 1; i < 1000000; i++){
            boolean b = false;
            if(anag(i, i * 2)){
                if(anag(i, i * 3)){
                    if(anag(i, i * 4)){
                        if(anag(i, i * 5)){
                            if(anag(i, i * 6)){
                                b = true;
                            }
                        }
                    }
                }
            }
            if(b)
                System.out.println(i);
        }
    }
    boolean anag(int a, int b){
        String n1 = a + "";
        String n2 = b + "";
        for(int i = 0; i < n1.length(); i++){
            for(int j = 0; j < n2.length(); j++){
                if(n1.charAt(i) == n2.charAt(j)){
                    n2 = n2.substring(0,j) + n2.substring(j+1);
                    break;
                }
            }
        }
        return n2.equals("");
    }
    public static void main(String[] args){
        new MultiAnag().find();
    }
}
