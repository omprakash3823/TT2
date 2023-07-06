package TT2.Array_2D;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    static List<List<Integer>> pascal(int rows) {
        List<List<Integer>> tri = new ArrayList<>();
        tri.add(new ArrayList<>());
        tri.get(0).add(1);
        for(int i=1;i<rows;i++){
            List<Integer> row=new ArrayList<>();
            List<Integer> preRow=tri.get(i-1);
            row.add(1);
            for (int j=1;j<i;j++){
                row.add(preRow.get(j-1)+preRow.get(j));

            }
           row.add(1);
            tri.add(row);
        }
        return tri;
    }
    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> ans = pascal(rows);
        System.out.println(ans);
    }
}