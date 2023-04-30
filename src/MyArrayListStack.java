import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> stack;
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }
    public void push(T element){
        stack.add(element,0);
    }
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(0);
    }
    public int size(){
        return stack.size();
    }
}
