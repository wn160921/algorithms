package base.model;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int N;

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return first==null;
    }

    private class Node{
        Item item;
        Node next;
    }

    public void enqueue(Item item){
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if(isEmpty()){
            first = last;
        }else {
            oldLast.next=last;
        }
        last.next=null;
        N++;
    }

    public Item dequeue(){
        Item firstItem = first.item;
        first = first.next;
        if(first==null){
            last = null;
        }
        N--;
        return firstItem;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){return current!=null;}
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove(){

        }
    }
}
