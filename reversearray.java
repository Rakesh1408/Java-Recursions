import java.util.Arrays;

public class reversearray {
  public static void main(String[] args){
    int[] k={1,2,3,4,5,6,7};
    int[] p=reve(k,0,k.length-1);
    System.out.println(Arrays.toString(p));
  }
  static int[] reve(int[] k,int start,int end){
    if(start>=end){
      return k;
    }
    int l=k[end];
   k[end]= k[start];
   k[start]=l;
   return reve(k,start+1,end-1);
  }
}
