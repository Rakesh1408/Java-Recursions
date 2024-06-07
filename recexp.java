
public class exp{
  public static void main(String[] args){
 
    System.out.println(sum(2,2));
  }
  static int sum(int j,int n){
    if(n==0){
      return 1;
    }

    return j*sum(j,n-1);
  }
}
