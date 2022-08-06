import java.util.*;
class Stack{

    private int size;
    private int arr[];
    private int top=-1;
    Stack(int size){
       this.size=size;
       arr=new int[size];
    }
    public boolean isempty(){
       return top==-1;
    }
    public boolean isfull(){
       return top==size-1;
    }
    public void push(int a){
        if(isfull())
        {
            System.out.println("Stack is already Full");
        }
        else
        {
            arr[++top]=a;
        }

    }
    public int pop(){
        int temp=0;
        if(isempty())
        {
            System.out.println("Stack Is Empty");
        }
        else
        {
             temp=arr[top];
             arr[top]=0;
             top--;
            System.out.println("Poped element="+temp);
        }
        return temp;
    }
    public void display(){
        for(int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class Sewak_StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        stack.push(34);
        stack.push(23);
        stack.push(58);
        stack.push(67);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(56);
        stack.display();
    }
}
