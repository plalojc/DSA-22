import java.io.*;
import java.util.*;

class StackUsingArrayList {
    
    ArrayList<Integer> al = new ArrayList<>();
    
    public void push(int x){
          al.add(x);    
    }
    
    public int pop(){
        if(al.isEmpty()){
            System.out.println("Stack is empty");
        }
        int deletedEle = al.get(al.size()-1);
        al.remove(al.size()-1);
        return deletedEle;
    }
    
    public int peek(){
        if(al.isEmpty()){
            System.out.println("Stack is empty");
        }
        
        return al.get(al.size()-1);
        
    }
    public void display(){
        if(al.isEmpty()){
            System.out.println("Stack is empty");
        }
        
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
	public static void main (String[] args) {
		StackUsingArrayList s = new StackUsingArrayList();
		s.push(67);
		s.push(89);
		s.push(34);
		s.push(2);
		s.push(12);
    
    System.out.println("Popped element is ::"+s.pop());
    
		s.push(23);
		s.push(22);
		
		System.out.println("Top element in the stack is ::"+s.peek());
		s.display();
		
	}
}
