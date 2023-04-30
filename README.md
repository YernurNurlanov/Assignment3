# Assignment3
## MyLinkedListStack or MyArrayListStack
### push()
Definition: adds an element to the top of the stack
```
public void push(T element){
        stack.add(element,0);
    }
```
### pop()
Definition: removes and returns the top element of the stack
```
public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }
```
### peek()
Definition: returns the top element of the stack
```
public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(0);
    }
```
### isEmpty()
Definition: returns true if the stack is empty or false if it is not
```
public boolean isEmpty() {
        return stack.size() == 0;
    }
```
### size()
Definition: returns the number of elements in the stack
```
public int size(){
        return stack.size();
    }
```
## MyLinkedListQueue or MyArrayListQueue
### enqueue(T element)
Definition: adds an element to the back of the queue
```
public void enqueue(T element){
        queue.add(element);
    }
```
### dequeue()
Definition: removes and returns the front element of the queue
```
public T dequeue(){
        return queue.remove(0);
    }
```
### peek()
Definition: returns the front element of the queue
```
public T peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return queue.get(0);
    }
```
### isEmpty()
Definition: returns true if the queue is empty or false if it is not
```
public boolean isEmpty(){
        return queue.size() == 0;
    }
```
### size()
Definition: returns the number of elements in the queue
```
public int size(){
        return queue.size();
    }
```
