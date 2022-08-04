import java.util.*;
class Implement{
    int stack[] = new int[5];
    int top = 0;
    public void push(int data){
        if(top>4){
            System.out.println("Stack is full");
        }
        else{
            stack[top]=data;
            top++;
        }
    }
    public int pop(){
        int data = 0 ;
        if(top<0){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            data = stack[top];
            stack[top]=0;
           
        }
        return data;
    }
    public int peek(){
        int data=0;
        if(top<=0){
            System.out.println("No data");
        }
        data = stack[top-1];
        return data;
    }
    public void display(){
        for(int i=0;i<5;i++){
            System.out.print(stack[i]);
        }
        System.out.println();
    }
}
class Stack1{
    public static void main(String[] args){
        Implement s = new Implement();
        s.push(6);
        s.push(3);

        s.display();

        s.pop();

        
        System.out.println(s.peek());
        s.display();
        
    }
}
