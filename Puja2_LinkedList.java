import java.util.Scanner;

class LinkedList {
    private Node head;
    private int count;
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val=val;
            next=null;
        }
    }
    public void add(int val)
    {
        if(head==null) {
            head=new Node(val);
        }
        else {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new Node(val);
        }
        count++;
    }
    public void insert(int val, int index) {
        Node node = new Node(val);
        if(index<0 || index>count+1){
            System.out.println("can't insert");
        }
        else{
            if(index==1){
                node.next=head;
                head=node;
                count++;
            }
            else if(index==count+1){
                add(val);
            }
            else {
                Node temp=head;
                for(int i=1;i<index-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
                count++;
            }
        }
    }
    public int size()
    {
        return count;
    }
    public int delete(int index)
    {
        int del=-1;
        if(index>count){
            System.out.println("index out of bound");
        }
        else{
            Node temp=head;
            if(index==1){
                del=head.val;
                head=head.next;
                temp.next=null;
            }
            else if(index==count){
                for(int i=1;i<index-1;i++){
                    temp=temp.next;
                }
                del=temp.next.val;
                temp.next=null;
            }
            else{
                for(int i=1;i<index-1;i++){
                    temp=temp.next;
                }
                Node temp1=temp.next;
                del=temp1.val;
                temp.next=temp1.next;
                temp1.next=null;
            }
            count--;
        }
        return del;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
class Puja_LinkedList {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        LinkedList list=new LinkedList();
        int option=0;
        while(option!=6)
        {
            System.out.println("\n\nOPTIONS");
            System.out.println("\n1. Add\n2. Size\n3. Insert\n4. Delete\n5. Display\n6. EXIT\n");
            System.out.println("\nEnter your option: ");
            option=sn.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.println("\nEnter the element: ");
                    int element=sn.nextInt();
                    list.add(element);
                    break;
                }
                case 2:
                {
                    System.out.println("\nSize = "+list.size());
                    break;
                }
                case 3:
                {
                    System.out.println("\nEnter the element: ");
                    int element=sn.nextInt();
                    System.out.println("Enter the index: ");
                    int index=sn.nextInt();
                    list.insert(element,index);
                    break;
                }
                case 4:
                {
                    System.out.println("\nEnter the index to be deleted: ");
                    int index=sn.nextInt();
                    System.out.println(list.delete(index)+" is deleted\n");
                    break;
                }
                case 5:
                {
                    System.out.println("\nThe elements are\n");
                    list.display();
                    break;
                }
                case 6:
                {
                    System.out.println("\nEXIT\n");
                    break;
                }
                default:
                {
                    System.out.println("\nINVALID OPTION\n");
                    break;
                }
            }
        }
        sn.close();
    }
}
