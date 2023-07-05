package TT2.Array;

public class Gas_Cost {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int rem_gas=0;
        int startpoint=0;
        int n=gas.length;
        int loss=0;
        for(int i=0;i<n;i++){
            rem_gas+=gas[i]-cost[i];
            if(rem_gas<0){
                startpoint=i+1;
                loss+=rem_gas;
                rem_gas=0;
            }

        }
        return loss+rem_gas>=0?startpoint:-1;
    }

    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        int res=canCompleteCircuit(gas,cost);
        System.out.println("Starting from INDEX:- "+res);
    }
}
