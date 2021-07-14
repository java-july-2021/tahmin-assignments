package OOP.SinglyLinkedList;



public class SinglyLinked {
 
Node head;
Node tail;
public SinglyLinked(){
    head=tail=null;
}
public boolean isempty(){
   if(head==null){  
    return true;
}
else{
    return false;
}
}
public void addtohead(int data) {
    head=new Node(data);
    if(tail==null){
        head=tail;
    }
}
public void addtotail(int data){
    if(!isempty()){
        tail.next=new Node(data);
        tail=tail.next;
    }
    else{
        tail=head=new Node(data);
    }
}
}    