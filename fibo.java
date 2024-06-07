public class fibo{
  public static void main(String[] args){
    int i=6;
    System.out.println(sum(i));
  }
  static int sum(int j){
    if(j==0){
      return 0;
    }
    if(j==1){
      return 1;
    }
    int ans=sum(j-1)+sum(j-2);
    return ans;
  }
}
