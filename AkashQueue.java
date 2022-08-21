public class AkashQueue
{
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Queue obj=new Queue(4);
		obj.enqueue(2);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.enqueue(8);
		obj.display();
		System.out.println(obj.dequeue());
		System.out.println(obj.dequeue());
		
		
	}
}
class Queue
{
    int[] arr;
    int front,rear;
    int count,size;
    Queue(int n)
    {
        arr=new int[n];
        front=0;
        rear=-1;
        size=n;
        count=0;
    }
    public void enqueue(int val){
        if(count>size){
            System.out.println("queue is full");
            return;
        }
        rear=(rear+1)%size;
        arr[rear]=val;
        count++;
    }
    public int dequeue(){
        if(count==0){
            return-1;
        }
        front=(front+1)%size;
        count--;
        return arr[front];
    }
    public void display(){
        System.out.println(java.util.Arrays.toString(arr));
    }
}
