package TT2.recursion;

public class Search_element_from_last {
    static int position(int[] arr, int pos, int Snum) {
        if (arr.length == pos && arr[arr.length-1]==Snum) {
            return pos-1;
        }
        else if(arr.length == pos && arr[arr.length-1]!=Snum) {
            return -1;
        }
        if (arr[arr.length - 1 - pos] == Snum) {
            return pos;
        }
        return position(arr, pos + 1, Snum);
    }

    public static void main(String[] args) {
        int[] arr = {34,8,6,75,56};
        int pos = 1;
        int Snum = 34;
        int res = position(arr, pos, Snum);
        if(res==-1){
            System.out.println(Snum+" is not found");
        }else {
            System.out.println(Snum+" is at position "+res+" from last.");
        }
    }
}
