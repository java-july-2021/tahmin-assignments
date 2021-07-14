package OOP.SinglyLinkedList;
public class SLLNode {
    public static void main(String[] args) {
 SinglyLinked sll=new SinglyLinked();
 sll.addtohead(90);
 sll.addtotail(23);
 sll.addtotail(40);
 sll.addtotail(88);
 sll.addtotail(90);
 sll.addtotail(70);
 
 for(Node i=sll.head ;i!=null;i=i.next){
System.out.println(i.data +" ");
}
}
}