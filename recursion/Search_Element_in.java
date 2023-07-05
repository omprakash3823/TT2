package TT2.recursion;

public class Search_Element_in {
    static int position(int[] arr,int n,int index){
        int i=0;
      if(arr.length-1 == index){
          return -i;
      }
      if(arr[index]==n){
          return index;
      }
      return position(arr,n,index+1);
    }

    public static void main(String[] args) {
     int[] arr={2,5,7,9};
     int n=7;
     int result=position(arr,7,0);
        System.out.println(result);
    }
}
