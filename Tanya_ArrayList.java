

import java.io.*;
import java.util.Arrays;

class ArrayList {
    private int[] arr = new int[8];
    private int count=-1;
    
    public void add(int x){
        if(count+1==arr.length){
            int arrNew[] = new int[2*arr.length];
             for(int i=0;i<count;i++){
                 arrNew[i]=arr[i];
             }
             arrNew[++count]=x;
             arr=arrNew;
        }
        else
           
           arr[++count]=x;
        
    }
    
    
    
    public boolean contains(int e){
        for(int i=0;i<=count;i++){
            if(arr[i]==e){
                return true;
            }
        }
        return false;
    }
    
    
    
    public int size(){
        int s=count+1;
        return s;
    }
    
    public int remove(){
        if(count>-1){
            arr[count]=0;
            count--;
        }
        return arr[count];
    }
    
    public void printElement(){
        for(int i=0;i<=count;i++){
            System.out.println(arr[i]);
        }
    }

	public static void main (String[] args) {
	    ArrayList obj = new ArrayList();
	   
	    obj.add(4);
		obj.add(7);
		obj.add(9);
		obj.add(78);
		obj.remove();
		System.out.println("Size = "+obj.size());
		System.out.println(obj.contains(3));
		obj.printElement();
	}
}
