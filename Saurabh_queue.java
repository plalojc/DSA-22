class queue{
    int []a;
    int front,rear,count,size;
    queue(int n){
        a=new int[n];
        rear=-1;
        size=n;
    }
    public void enqueue(int x){
        if(count==size){
            System.out.println("queue is full.");
            return;
        }
        rear=(rear+1)%size;
        a[rear]=x;
        count++;
    }
    public int dequeue(){
        if(count==0){
            return -1;
        }
        front=(front+1)%size;
        count--;
        return a[front];
    }
    public void display(){
        System.out.println(java.util.Arrays.toString(a));
    }
}
public class Saurabh_queue{
    public static void main (String []args){
        queue q=new queue(5);
        q.enqueue(1);
        q.enqueue(4);
        q.dequeue();
        q.display();
    }
}