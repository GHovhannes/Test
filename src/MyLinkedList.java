import java.util.Iterator;

public class MyLinkedList<Integer> {
    public static Node first;
    private Node last;

    public MyLinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }
    public void removeFromFirst(){
        if(isEmpty()){
            first = first.next;
        }
    }
    public void makeCircular(){
        if(isEmpty()){
            last.next = first;
        }
    }

    public void addToLast(Integer item){
        if(first == null){
            first = new Node((java.lang.Integer) item, null);
            last = first;
        }else{
            last.next = new Node((java.lang.Integer) item, null);
            last = last.next;
        }

    }

    public Iterator<Integer> iterator() {
        return (Iterator<Integer>) new Itr();
    }
}
 class Node {
    Integer data;
    Node next;

    public Node (Integer data, Node next){
        this.data = data;
        this.next = next;
    }
}
class Itr implements Iterator<Integer> {
    private Node cursor = MyLinkedList.first;
    @Override
    public Integer next() {
        Integer item = cursor.data;
        cursor = cursor.next;
        return item;
    }
    @Override
    public boolean hasNext() {
        return cursor != null;
    }
    @Override
    public void remove() {
        if(cursor.next.next != null && cursor.next != null) {
            Integer item = cursor.data;
            cursor.next = cursor.next.next;
        }else{
            cursor.next = cursor;
        }

    }

}


