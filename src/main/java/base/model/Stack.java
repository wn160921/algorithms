package base.model;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
    private Node first;
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

    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first .next = oldFirst;
        first.item = item;
        N++;
    }

    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListItemator();
    }

    private class ListItemator implements Iterator<Item>{
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
