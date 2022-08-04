package stack;

class MyStack{
      int arr[];
      int size;
        int top;
        MyStack(int c){
            top=-1;
            size =c;
            arr=new int [size];

        }

        void push(int x){
            if(top== size -1){
                System.out.println("Overflow");
                return;
            }
            top++;
            arr[top]=x;
        }

        int pop(){
            if(top==-1){
                System.out.println("Underflow");
                return 0;
            }
            int res=arr[top];
            top--;
            return res;
        }

        int peek(){
            if(top==-1){
                System.out.println("Stack is Empty");
                return 0;
            }
            return arr[top];
        }

        int size(){
            return (top+1);
        }

        boolean isEmpty(){
            return top==-1;
        }
    }

    class Stack{

        public static void main (String[] args)
        {
            MyStack s=new MyStack(5);
            s.push(5);
            s.push(10);
            s.push(20);
            System.out.println(s.pop());
            System.out.println(s.size());
            System.out.println(s.peek());
            System.out.println(s.isEmpty());
        }
    }

