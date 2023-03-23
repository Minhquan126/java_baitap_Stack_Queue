package queue;

import java.util.ArrayDeque;

public class Solution {
    Queue queue = new Queue();
    public void enqueue(int key){
        Node temp = new Node(key);
        if (queue.front == null){
            queue.rear = queue.rear = temp;
            return;
        }
        queue.rear.link = temp;
        queue.rear = temp;

    }
    public Node dequeue(){
        if (queue.front == null){
            return null;
        }
        Node temp = queue.front;
        queue.front = queue.front.link;
        if (queue.rear == null)
            queue.rear = null;
        return temp;
    }
}


