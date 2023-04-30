import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> stack;
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }
    public void push(T element){
        stack.add(element, 0);
    }
    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
