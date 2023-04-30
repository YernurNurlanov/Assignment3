import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> queue;
    public MyArrayListQueue(){
        queue = new MyArrayList<>();
    }
    public void enqueue(T element){
        queue.add(element);
    }
    public T dequeue(){
        return queue.remove(0);
    }
    public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
    public boolean isEmpty(){
        return queue.size() == 0;
    }
}
