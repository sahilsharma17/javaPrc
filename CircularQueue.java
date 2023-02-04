
import java.util.Scanner;

class CircQueue {
    int f, r;
    String queue[];

    CircQueue(int size) {
        queue = new String[size];
        f = r = -1;
        System.out.println("Queue Intitialized of size " + queue.length);
    }

    void enqueue(String[] elements) {
        // if (f == (r + 1) % (queue.length)) {
        // System.out.println("Queue is full");

        // } else if (f == -1 && r == -1) {
        // f = r = 0;
        // queue[r] = element;
        // r = (r + 1) % queue.length;
        // System.out.println(element + " entered successfully");

        // }else{queue[r] = element;
        // r = (r + 1) % queue.length;
        // System.out.println(element + " entered successfully");}

        if (elements.length > queue.length) {
            System.out.println("You can only enter " + queue.length + " elements in this queue");
        } else if (f == (r + 1) % (queue.length)) {
            System.out.println("Queue is full"); 

        } else if (f == -1 && r == -1) {
            f = r = 0;
            for (int i = 0; i < elements.length; i++) {
                queue[i + r] = (elements[i]);
            }
            r = (r + elements.length-1) % queue.length;
            
        } else {
            for (int i = 0; i < elements.length; i++) {
                queue[(i + r)%queue.length] = (elements[i]);
            }
            r = (r  -1 + elements.length) % queue.length;
            
        }
    }

    void dequeue() {
        if ((f == -1 && r == -1) || f == r) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Element removed is " + queue[f]);
            f = (f + 1) % queue.length;
        }
    }

    void display() {
        if (f == -1 && r == -1 || f == r) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("First element of the queue is " + queue[f]);
        }
    }

}

public class CircularQueue {
    public static void main(String[] args) {
        System.out.println("Enter the size of the queue");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        CircQueue cQueue = new CircQueue(n);
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Print first element");
        System.out.println("4.Exit");
        n = inp.nextInt();
        while (n != 4) {

            switch (n) {
                case 1:
                    System.out.println("Enter elements seperated by comma");
                    String items[] = inp.next().split(",");
                    cQueue.enqueue(items);

                    break;
                case 2:
                    cQueue.dequeue();
                    break;
                case 3:
                    cQueue.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }
            System.out.println("Choose");
            n = inp.nextInt();
        }
    }
}