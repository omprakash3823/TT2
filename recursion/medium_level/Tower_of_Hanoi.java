package TT2.recursion.medium_level;

public class Tower_of_Hanoi {
    static void TOH(int n,char S,char E,char M){
        if(n==0){
            return;
        }
        TOH(n-1,S,M,E);
        System.out.println("Move disk "+n+" from "+S+" to "+E);
        TOH(n-1,M,E,S);

    }
    public static void main(String[] args) {
        TOH(3,'A','C','B');
    }
}
