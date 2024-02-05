package pack2;

import java.util.LinkedList;

public class MyQueue<T> {
    private LinkedList<T> ll = new LinkedList<>();
    public void enqueue(T element){
        ll.addLast(element);
    }

    public T dequeue(){
        return ll.removeFirst();
    }

    public T first(){
        return ll.getFirst();

    }

    public LinkedList<T> getElements() {
        return ll;
    }
}
