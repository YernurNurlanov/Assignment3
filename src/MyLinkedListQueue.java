import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> {
    MyLinkedList<T> queue;
    public MyLinkedListQueue(){
        queue = new MyLinkedList<>();
    }
    public void enqueue(T element){
        queue.add(element);
    }
}
