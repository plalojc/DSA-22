import java.util.*;

class LinkedList{
    Node head;
    int count=0;
    class Node{
        int val;
        Node addr;
        Node(int val)
        {
            this.val=val;
            addr=null;
        }
    }
    public void add(int val)
    {
        if(head==null)
        {
            head=new Node(val);
        }
        else {
            Node tmp=head;
            while(tmp.addr!=null)
            {
                tmp=tmp.addr;
            }
            tmp.addr=new Node(val);
        }
        count++;
    }
    public void insert(int val,int index){
        Node node = new Node(val);
        if(index<0||index>count+1)
        {
            System.out.println("Can't Insert ");
        }
        else
        {
            if(index==1)
            {
                node.addr=head;
                head=node;
                count++;
            }
            else if(index==count+1){
                add(val);
            }
            else {
                int i = 1;
                Node temp = head;
                while (i < index - 1) {
                    temp = temp.addr;
                    i++;
                }
                node.addr = temp.addr;
                temp.addr=node;
                count++;
            }
        }
    }
    public int delete(int index)
    {
        int del=-1;
        if(index>count){
            System.out.println("Index Out Of Bound");
        }
        else
        {
            Node temp=head;
            if(index==1){
                del=head.val;
                head=head.addr;
                temp.addr=null;
            }
            else if(index==count){
                for(int i=0;i<index-1;i++)
                {
                    temp=temp.addr;
                }
                del=temp.addr.val;
                temp.addr=null;
            }
            else{
                for(int i=1;i<index-1;i++){
                    temp=temp.addr;
                }
                Node temp1=temp.addr;
                del=temp1.val;
                temp.addr=temp1.addr;
                temp1.addr=null;
            }
            count--;
        }
        return del;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.addr;
        }
        System.out.println();
    }
    public int size(){
        return count;
    }
}
public class Sewak_LinkedList{
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(30);
        l1.add(90);
        l1.add(65);
        l1.size();
        l1.display();
        l1.insert(34,2);
        l1.insert(78,0);
        l1.display();
    }

}
