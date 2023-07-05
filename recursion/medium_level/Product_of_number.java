package TT2.recursion.medium_level;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_of_number {
    static ArrayList<Integer> product(ArrayList<Integer> list,int n,int pro){
        ArrayList<Integer> arrayList=new ArrayList();

        if(list.size()==n){
            list.clear();
            list.add(pro);
            return list;
        }
        pro=pro*list.get(n);

        return product(list,n+1,pro);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements int the list : ");
        for (int i = 0; i < n; i++) {
            int elements = sc.nextInt();
            list.add(elements);
        }
        ArrayList<Integer> ans = product(list, 0, 1);
        System.out.println("Product of element is : " + ans);


    }
}
