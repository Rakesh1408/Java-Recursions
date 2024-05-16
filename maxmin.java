public class maxmin {
  public static void main(String[] args){
    int[] arr={1,3,32,4,5,0,1};
    System.out.println(maxi(arr));
  }
  static int maxi(int[] arr){
    int max=arr[0];
    int secondmax=-1;
    for(int i=0;i<arr.length;i++){
      if(max<arr[i] & secondmax<max){
        secondmax=max;
        max=arr[i];
      }
      else if(arr[i]>secondmax & arr[i]!=max){
        secondmax=arr[i];
      }
    }
    return secondmax;
  }
}
