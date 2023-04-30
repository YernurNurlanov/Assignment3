public class MyArrayList<T> {
    /*
    @ size - size of the array
    @ arr - array
    @ size() - method which return size of array
    @ contains() - checks if there is an element in the array
    @ add(T item) - adds an element to the end of the array
    @ add(Object item, int index) - adds an element at the specified index
    @ boolean remove() - checks if an element has been deleted
    @ remove() - removes the element at the specified index
    @ clear() - clears array
    @ get() - return the element at the specified index
    @ indexOf() - return index of the element which first matched the incoming element
    @ lastIndexOf() - return index of the element which last matched the incoming element
    @ sort() - sorts array only if it contains only integer
     */
    public void print(){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void addAllBiIndex(Object[] list, int index){
        if (list.length + arr.length > arr.length) {
            buffered();
        }
        int point = size;
        for (int i = index; i <= point; i++){
            arr[i+list.length] = arr[i];
            size++;
        }
        for (int i = 0; i < list.length; i++){
            arr[index + i] = (T) list[i];
        }
    }
    public void buffered(){
        T[] Arr = (T[]) new Object[arr.length * 2];
        // copy elements from old array to new array
        for (int i = 0; i < arr.length; i++) {
            Arr[i] = arr[i];
        }
        // set the reference to the new array
        arr = Arr;
    }
    private int size;
    private T[] arr;
    // Constructor to initialize the array with a capacity of 5 elements
    public MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    // Returns the size of the array
    public int size() {
        return size;
    }
    // Checks if there is an incoming element in the array
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == arr[i]) {
                return true;
            }
        }
        return false;
    }
    // Adds an element to the end of the array, increasing the capacity if necessary
    public void add(T item) {
        // if the array is full, create a new array with double the capacity
        if (size == arr.length) {
            T[] Arr = (T[]) new Object[arr.length * 2];
            // copy elements from old array to new array
            for (int i = 0; i < arr.length; i++) {
                Arr[i] = arr[i];
            }
            // set the reference to the new array
            arr = Arr;
        }
        else {
            arr[size] = item;
        }
        size++;
    }
    // Adds an element at the specified index, throwing an exception if the index is out of bounds
    public void add(Object item, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if(size == arr.length) {
            buffered();
        }
        for(int i = size; i>index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = (T) item;
        size++;
    }
    // Checks if an element has been deleted
    public boolean remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (item == arr[i]) {
                return false;
            }
        }
        return true;
    }
    // Removes the element at the specified index, throwing an exception if the index is out of bounds
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // Shift all elements to the left by one position
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
    // Clears the array by creating a new array with a capacity of 5 elements and setting the size to 0
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    // Returns the element at the specified index, throwing an exception if the index is out of bounds
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }
    // Returns index of the element which first matched the incoming element
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++){
            if (o == arr[i]){
                return i;
            }
        }
        return -1;
    }
    // Returns index of the element which last matched the incoming element
    public int lastIndexOf(Object o) {
        int index = 0;
        for (int i = 0; i < size; i++){
            if (o == arr[i]) {
                index = i;
            }
        }
        return index;
    }
    // Sorts array only if it contains only integer, otherwise throws an exception
    public void sort() {
        int n = arr.length;
        try {
            // Bubble sort
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if ((int)arr[j] > (int)arr[j + 1]) {
                        // swap arr[j] and arr[j+1]
                        T temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        catch (UnsupportedOperationException e){
            System.out.println("Array has element which is not integer");
        }
    }
}
