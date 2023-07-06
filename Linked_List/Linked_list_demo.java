package TT2.Linked_List;
class node{
    int data;
    node next;
    public node(int data ){
        this.data=data;
        this.next=null;
    }
}
public class Linked_list_demo {

    public static void main(String[] args) {
        node n1=new node(10);
        node n2=new node(20);
        node n3=new node(30);
        n1.next=n2;
        n2.next=n3;
        node n4=new node(40);
        node n5=new node(50);
        n3.next=n4;
//        n3.next.next=n5;
//        n5.next=null;
        node start=n1;
        while (start.next!=null){
            System.out.println(start.data);
            start=start.next;
        }

    }

}
