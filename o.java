class o{
    public static void main(String args[]){
        new o().get();
    }
    void get(){
        System.out.println(fun(45));
    }
    int fun( int n ){
        if( n>100)
        return( n-5);
        return(fun (fun( n+11)));
    }
}
