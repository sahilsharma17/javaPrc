import java.util.*;

class Queue {
    String queue[];
    int front;
    int rear;

    // Initializing Queue

    void initialize(int n) {
        queue = new String[n];
        front = rear = -1;

    }

    boolean isfull() {
        if (rear == queue.length - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (rear == -1) {
            return true;
        }
        return false;
    }

    // Inserting in the queue
    void enqueue(String numbers[]) {
        if (isfull())
            System.out.println("Queue is full.");

        else if (numbers.length == 0) {
            System.out.println("Please provide an input");
        }

        else {
            for (int i = 0; i < numbers.length; i++) {
                queue[rear + 1 + i] = numbers[i];

            }
            System.out.println(numbers.length + " elements entered in a queue.");
            rear += numbers.length;
        }

    }

    // Removing an element
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");

        }

        else if (front >= rear) {
            System.out.println("Element removed is " + queue[front]);
            front = rear = -1;      // We reset the queue as there is only one element in the queue

        }

        else {
            System.out.println("Element removed is " + queue[front+1]);
            front++;
        }

    }

    // Print first element
    void displayHead() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("First element of the queue is " + queue[front+1]);
        }
    }
}

public class QueueIn {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to insert.");
        int n = inp.nextInt();
        q1.initialize(n);
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Check if queue is empty or full");
        System.out.println("4.Print first element");
        System.out.println("5.Exit");

        n = inp.nextInt();
        while (n != 5) {
            switch (n) {
                case 1:
                    System.out.println("Please provide elements to be inserted seperated by a comma ");
                    String input = inp.next();
                    String items[] = input.split(",");
                    q1.enqueue(items);

                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    if (q1.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else if (q1.isfull()) {
                        System.out.println("Queue is full");

                    } else
                        System.out.println("There are some elements in the queue");

                    break;
                case 4:
                    q1.displayHead();
                    break;
                case 5:
                    System.out.println("See ya!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter a valid input");
                    break;
            }
            System.out.println("Choose an option");
            n = inp.nextInt();
        }

        System.out.println(q1.isEmpty());

    }

}