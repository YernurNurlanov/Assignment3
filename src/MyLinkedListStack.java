import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    MyLinkedList<T> stack;
    public MyLinkedListStack(){
        stack = new MyLinkedList<>();
    }
    public void push(T element){
        stack.add(element, 0);
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
