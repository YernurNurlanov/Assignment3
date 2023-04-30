import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    // queue - instance of type MyLinkedList
    MyLinkedList<T> queue;
    // MyLinkedListQueue() - constructor for the class
    public MyLinkedListQueue(){
        queue = new MyLinkedList<>();
    }
    // adds an element to the back of the queue
    public void enqueue(T element){
        queue.add(element);
    }
    // removes and returns the front element of the queue
    public T dequeue(){
        return queue.remove(0);
    }
    //returns the front element of the queue
    public T peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
    // returns true if the queue is empty or false if it is not
    public boolean isEmpty(){
        return queue.size() == 0;
    }
    //returns the number of elements in the queue
    public int size(){
        return queue.size();
    }
}
