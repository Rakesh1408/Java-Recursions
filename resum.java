public class sum{
  static int recsum(int n){
     if(n==1){
        return 1;
      }
    return n +recsum(n-1);
}
 public static main(String args[]){
     int k=3;
     System.out.println(recsum(k));
}
