class RecurPat {
  static int a[][] ;
  public static void main(String args[] ){
      a= new int[4][4] ;
      a[0][0]=1 ;
      fill(3, 3);
      for( int i=0 ; i < 4 ; i++) {
      for ( int j=0 ; j < 4 ; j++)
      System.out.print( a[i][j]+ " " );
      System. out. println( );
      }
  }
  static void fill( int i , int j ){
    System.out.println(i+" v "+j);
    if ( i==0 || j== 0)
    a[i][j]=1 ;
    else
    {
    System.out.println(i+" "+j);
    fill( i , j-1);
    System.out.println(i+" a "+j);
    fill( i-1 , j );
    System.out.println(i+" b "+j);
    a[ i ][ j ]= 4*( a [ i-1][ j ] + a[ i ] [ j-1]) ;
    }
 }
}
