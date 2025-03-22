class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    static Node head,tail;
    public void insert(int data){
        Node n=new Node(data);
        if(head==null){
        head=n;
        tail=n;
        }
        else{
            tail.next=n;
            tail=n;
        }
    }
    public void insert_beg(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    public void delete(int data){
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next != null){
            System.out.print("->");
            }
            temp=temp.next;
        }
    }
    public void count(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
        }
        System.out.print(count);
    }
}
public class Main{
    public static void main(String[] args){
        LinkedList l=new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.display();
        l.insert_beg(0);
        System.out.println();
        System.out.print("after deleting:");
        l.delete(4);
        l.display();
        l.count();
    }
}