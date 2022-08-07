import java.util.*;
class Stack2{
    ArrayList<Integer> l = new ArrayList<>(8);
    public int size(){
        return l.size();
    }
    public void push(int a){
        l.add(a);
    }
    public int pop(){
        if(l.isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        l.remove(l.size()-1);
        return l.get(l.size()-1);
    }
    public int peek(){
        if(l.isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return l.get(l.size()-1);
    }
    public void display(){
        if(l.isEmpty()){
            System.out.println("Stack is Empty");
        }
        for(int i=l.size()-1;i>=0;i--){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
    }
}
public class Sewak_StackUsingArrayList {
    public static void main(String[] args) {
        Stack2 s = new Stack2();
        s.push(45);
        s.push(9);
        s.push(21);
        s.display();
        s.pop();
        s.display();
        s.pop();
        s.display();
        s.push(36);
        s.push(25);
        s.push(89);
        int z=s.peek();
        System.out.println(z);
        s.display();
        s.pop();
        s.display();
        z=s.peek();
        System.out.println(z);
        s.display();

    }

}
