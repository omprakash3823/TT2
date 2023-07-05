package TT2.recursion.medium_level;

import java.util.ArrayList;

public class Dice_Problem {
    static ArrayList<String> dice_Count(int target,int curr_val){
        if(target==0){
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add("");
            return arrayList;
        }
        if(curr_val>target){
            ArrayList<String> arrayList=new ArrayList<>();
            return arrayList;
        }
        ArrayList<String> result=new ArrayList<>();
        for (int i=1;i<=6;i++){
            int new_val=curr_val+i;
            ArrayList<String> temp=dice_Count(target, new_val);
            for(String s:temp) {
                result.add(i+s);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int target=10;
        int current_val=0;
        ArrayList<String> temp=dice_Count(target,current_val);
        for(String s:temp){
            System.out.println(temp);
        }
    }
}
