import java.util.*;

class Linkedlist1 {
    private Node head;
     int count = 0;

    class Node {
        int data;
        Node next;
    

      Node(int data){
          this.data=data;
          this.next=null;
       }
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data);
        }
         count++;
    }

    public void insert(int data, int index) {
        Node add = new Node(data);
        Node prev = head;

        if (index < 0 || index > count+1) {
            System.out.println("invalid index");
            return;

        } 
        else if (index == 0 || index == count+1) {
            add(data);
        }

        else {
            for (int i = 0; i < index - 1; i++) {
                prev = prev.next;
            }
            add.next = prev.next;
            prev.next = add;
        }
       
    }

    void traverse() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public int size() {
        return count;
    }

    public static void main(String[] args) {
        Linkedlist1 ll = new Linkedlist1();
        ll.add(78);
        ll.add(34);
        ll.add(120);
        ll.add(2);
        ll.add(1);
        
        ll.traverse();
        ll.insert(11,4);
        ll.insert(66,9);
      
      System.out.println(ll.size());

    }

}
