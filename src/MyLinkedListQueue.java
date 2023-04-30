import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    MyLinkedList<T> queue;
    public MyLinkedListQueue(){
        queue = new MyLinkedList<>();
    }
    public void enqueue(T element){
        queue.add(element);
    }
    public T dequeue(){
        return queue.remove(0);
    }
    public T peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
    public boolean isEmpty(){
        return queue.size() == 0;
    }
    public int size(){
        return queue.size();
    }
}
