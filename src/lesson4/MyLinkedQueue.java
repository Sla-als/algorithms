package lesson4;

public class MyLinkedQueue<T> {

    private MyLinkedList<T> ll = new MyLinkedList<>();

    public void insert(T item){
        ll.insertFirst(item);
    }

    public T peek(){
        return ll.getLast();
    }

    public T remove(){
        return ll.removeLast();
    }

    public int size(){
        return ll.size();
    }

    public boolean isEmpty(){
        return ll.isEmpty();

    }
}
