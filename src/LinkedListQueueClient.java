public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue listQueue = new MyLinkedListQueue();
        listQueue.enqueue(1);
        listQueue.enqueue(2);
        listQueue.enqueue(3);
        listQueue.dequeue();
        System.out.println("Dequeued item is " + listQueue.dequeue().key);
    }
}
