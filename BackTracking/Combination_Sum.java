//package TT2.BackTracking;
//
//import java.util.ArrayList;
//
//public class Combination_Sum {
//    static Arraylist<ArrayList<Integer>> combinationSum(ArrayList<ArrayList<Integer>> A, int B)
//    {
//        // add your code here
//        Arraylist<ArrayList<Integer>> arr=new Arraylist<ArrayList<>();
//
//        if(B>A[i]){
//            B=B-A[i];
//            arr.add(A[i]);
//        }
//        combinationSum(A,B);
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
//        arrayList.add(0,8);
//        arrayList.add(1,5);
//        arrayList.add(2,4);
//        int B=15;
//        combinationSum(arrayList,B);
//
//    }
//}
