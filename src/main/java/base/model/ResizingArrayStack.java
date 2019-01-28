package base.model;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1];
    private int N = 0;

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N==0;
    }

    private void resize(int max){
        Item temp[] = (Item[]) new Object[max];
        for(int i=0;i<N;i++){
            temp[i]=a[i];
        }
        a = temp;
    }

    public void push(Item item){
        if(N==a.length){
            resize(a.length*2);
        }
        a[N++]=item;
    }

    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if(N>0 && N==a.length/4){
            resize(a.length/2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayItemator();
    }

    private class ReverseArrayItemator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){return i>0;}
        public Item next(){
            return a[i--];
        }
        public void remove(){

        }
    }
}