package lesson3;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyDeque<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;

    //0 1 2 3 4
    //b
    //  e
    //8


    public MyDeque(int capacity) throws IllegalArgumentException {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    /**
     * Метод добавления в очередь нового элемента
     *
     * @param item добавляемый элемент
     * @throws IllegalStateException если очередь полная
     */
    public void insertLeft(T item) throws IllegalStateException {
        if (isFull()) {
            reCapacity((int) (capacity * 1.5));
            //throw new IllegalStateException("Очередь заполнена");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertRight(T item) throws IllegalStateException {
        if (isFull()) {
            reCapacity((int) (capacity * 1.5));
            //throw new IllegalStateException("Очередь заполнена");
        }
        System.out.println(begin +"|"+end);
        size++;
        list[end] = item;
        System.out.println(begin +"|"+end);
        //end = previousIndex(end);
    }


//    public void push(T item) {
//        if (isFull()) {
//            reCapacity((int) (capacity*1.5));
//            //throw new StackOverflowError("Стек заполнен");
//        }
//        list[size]= item;
//        size++;
//    }

//    public T pop(){
//        T temp = peek();
//        size--;
//        list[size]= null;
//        return temp;
//    }

//    public T peek(){
//        if (isEmpty()){
//            throw new EmptyStackException();
//        }
//        return list[size-1];
//    }




    private int previousIndex(int index) {
        return (index - 1);
    }

    public T peekLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[begin];
    }

    public T peekRight() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return list[end-1];
    }

    public T removeLeft() {
        T temp = peekLeft();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T removeRight() {
        T temp = peekRight();
        size--;
        list[end] = null;
        end = previousIndex(end);
        return temp;
    }


    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        int i = begin;
        while (i != end) {
            sb.append(list[i]).append(", ");
            i = nextIndex(i);
        }
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(" ]");
        return sb.toString();
    }

    private void reCapacity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }
}
