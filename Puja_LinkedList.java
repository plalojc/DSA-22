class LinkedList{
    int count=0;
    Node head=null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    
    }

    public void add(int val){
        Node newnode = new Node(val);
        if(head==null){
            head=newnode;
        }
        else if(head.next==null){
            head.next=newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        count++;
    }

    public void insert(int val, int pos){
        Node newnode = new Node(val);
        if(pos<0 || pos>count+1){
            System.out.println("can't insert");
        }
        else{
            if(pos==1){
                newnode.next=head;
                head=newnode;
                count++;
            }
            else if(pos==count+1){
                add(val);
            }
            else{
                int i=1;
                Node temp=head;
                while(i<pos-1){
                    temp=temp.next;
                    i++;
                }
                newnode.next=temp.next;
                temp.next=newnode;
                count++;
            }
            
        }

    }

    public int delete(int pos){
        int el=-1;
        if(pos>count){
            System.out.println("index out of bound");
        }
        else{
            Node temp=head;
            if(pos==1){
                el=head.data;
                head=head.next;
                temp.next=null;
            }
            else if(pos==count){
                int i=1;
                while(i<pos-1){
                    temp=temp.next;
                    i++;
                }
                el=temp.next.data;
                temp.next=null;
            }
            else{
                int i=1;
                while(i<pos-1){
                    temp=temp.next;
                    i++;
                }
                Node temp2=temp.next;
                el=temp2.data;
                temp.next=temp2.next;
                temp2.next=null;
            }
            count--;
        }
        return el;
    }

    public int size(){
        return count;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class LinkedListDemo {
    public static void main(String []args){
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.insert(4,1);
        ll.insert(9,5);
        ll.insert(80,4);
        System.out.println("Deleted element= "+ll.delete(1));
        System.out.println("Deleted element= "+ll.delete(2));
        System.out.println("Deleted element= "+ll.delete(3));
        ll.print();

        System.out.println("size= "+ll.size());
    }
}
