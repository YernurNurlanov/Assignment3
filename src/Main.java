public class Main {
    public static void main(String[] args) {
        System.out.println("Start test MyArrayListStack");
        MyArrayListStack<Object> arrayStack = new MyArrayListStack<>();
        arrayStack.push(5);
        arrayStack.push("aaa");
        arrayStack.push(true);
        arrayStack.push(111);
        System.out.println("pop: "+arrayStack.pop());
        System.out.println("peek: "+arrayStack.peek());
        System.out.println("Empty or not: "+arrayStack.isEmpty());
        System.out.println("size: "+arrayStack.size());
        System.out.println("Start test MyLinkedListStack");
        MyLinkedListStack<Object> linkedStack = new MyLinkedListStack<>();
        linkedStack.push(false);
        linkedStack.push(1);
        linkedStack.push(true);
        linkedStack.push(12345);
        linkedStack.push("qqq");
        System.out.println("pop: "+linkedStack.pop());
        System.out.println("peek: "+linkedStack.peek());
        System.out.println("Empty or not: "+linkedStack.isEmpty());
        System.out.println("size: "+linkedStack.size());
        System.out.println("Start test MyArrayListQueue");
        MyArrayListQueue<Object> arrayQueue = new MyArrayListQueue<>();
        arrayQueue.enqueue(123);
        arrayQueue.enqueue(1234567);
        arrayQueue.enqueue("www");
        System.out.println("dequeue: "+arrayQueue.dequeue());
        System.out.println("peek: "+arrayQueue.peek());
        System.out.println("isEmpty: "+arrayQueue.isEmpty());
        System.out.println("size: "+arrayQueue.size());
        System.out.println("Start test MyLinkedListQueue");
        MyLinkedListQueue<Object> linkedQueue = new MyLinkedListQueue<>();
        linkedQueue.enqueue(12);
        System.out.println("dequeue: "+linkedQueue.dequeue());
        System.out.println("peek: "+linkedQueue.peek());
        System.out.println("isEmpty: "+linkedQueue.isEmpty());
        System.out.println("size: "+linkedQueue.size());
    }
}