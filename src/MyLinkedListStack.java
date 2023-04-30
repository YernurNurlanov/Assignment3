import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    MyLinkedList<T> stack;
    public MyLinkedListStack(){
        stack = new MyLinkedList<>();
    }
    public void push(T element){
        stack.add(element, 0);
    }
}
