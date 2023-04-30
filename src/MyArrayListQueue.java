import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> queue;
    public MyArrayListQueue(){
        queue = new MyArrayList<>();
    }
    public void enqueue(T element){
        queue.add(element);
    }
}
