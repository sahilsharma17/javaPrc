public class Stack{

    int arr[];
    int top;
    int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            System.exit(1);
        }

        arr[++top] = x;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    public int getSize(){
        return top + 1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    public Boolean isFull(){
        return top == capacity -1;
    }

    public void display(){
        for(int i = 0; i<=top; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: ");
        stack.display();

        stack.pop();
        System.out.println("\nAfter popping out: ");
        stack.display();
    }
}