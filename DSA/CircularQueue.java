package DSA;


public class CircularQueue {

    int size;
    int[] items;
    int front, rear;
      
    
    CircularQueue(int size)
    {
        items= new int[size];
        front=-1;
        rear=-1;
    }

    public void enqueue(int element)
    {
        if((front==0 && rear==size-1) || (front==rear+1))
        {
            System.out.println("Queue is full");
            return;
        }

        if(front==-1)
        {
            front=0;
            rear=0;
        }

        else
        {
            if(rear==size-1)
            rear=0;
            else
            rear=rear+1;
        }

        items[rear]=element;
    }

    public void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(items[front]);

        if (front == rear) {
            front = -1;
            rear = -1;
         }
         else {
            if (front == size - 1)
               front = 0;
            else
               front = front + 1;
         }
    }
}
