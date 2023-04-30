import java.util.EmptyStackException;
public class MyLinkedListStack<T> {
    // stack - instance of type MyLinkedList
    MyLinkedList<T> stack;
    // MyLinkedListStack() - constructor for the class
    public MyLinkedListStack(){
        stack = new MyLinkedList<>();
    }
    // adds an element to the top of the stack
    public void push(T element){
        stack.add(element, 0);
    }
    // returns true if the stack is empty or false if it is not
    public boolean isEmpty() {
        return stack.size() == 0;
    }
    //removes and returns the top element of the stack
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }
    //returns the top element of the stack
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(0);
    }
    //returns the number of elements in the stack
    public int size(){
        return stack.size();
    }
}
