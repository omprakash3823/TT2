package TT2.Array;

public class test {
    static int[] Rotate_Clockwise(int[] arr){
        int n=arr.length-1;
        int i=0;
        while(i<n){
            int temp=arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            i++;
            n--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,5,3,4,8,9,3};
        Rotate_Clockwise(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print( " "+arr[i]);
        }
    }
}
