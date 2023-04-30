import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> stack;
    public MyArrayListStack() {
        stack = new MyArrayList<>();
    }
    public void push(T element){
        stack.add(element);
    }
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        stack.remove(stack.size() - 1);
        return stack.get(stack.size() - 1);
    }
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    public int size(){
        return stack.size();
    }
}
