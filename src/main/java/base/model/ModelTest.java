package base.model;

import org.junit.Test;

public class ModelTest {
    @Test
    public void testFCSS(){
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        String[] test = {"to","be","or","not","to","-","be","-","-","that","-","-","-","is"};
        for(String item:test){
            if(!item.equals("-")){
                s.push(item);
            }else if(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
        System.out.println("("+s.size()+" left on stack)");

    }

    @Test
    public void testFCS(){
        FixedCapacityStack s;
        s = new FixedCapacityStack(100);
        String[] test = {"to","be","or","not","to","-","be","-","-","that","-","-","-","is"};
        for(String item:test){
            if(!item.equals("-")){
                s.push(item);
            }else if(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
        System.out.println("("+s.size()+" left on stack)");

    }

    @Test
    public void tesRAS(){
        ResizingArrayStack s;
        s = new ResizingArrayStack()  ;
        String[] test = {"to","be","or","not","to","-","be","-","-","that","-","-","-","is"};
        for(String item:test){
            if(!item.equals("-")){
                s.push(item);
            }else if(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
        System.out.println("("+s.size()+" left on stack)");

    }

    @Test
    public void testStack(){
        Stack<String> s = new Stack<>();
        String[] test = {"to","be","or","not","to","-","be","-","-","that","-","-","-","is"};
        for(String item:test){
            if(!item.equals("-")){
                s.push(item);
            }else if(!s.isEmpty()){
                System.out.print(s.pop()+" ");
            }
        }
        System.out.println("("+s.size()+" left on stack)");
    }

    @Test
    public void testQueue(){
        Queue<String> s = new Queue<>();
        String[] test = {"to","be","or","not","to","-","be","-","-","that","-","-","-","is"};
        for(String item:test){
            if(!item.equals("-")){
                s.enqueue(item);
            }else if(!s.isEmpty()){
                System.out.print(s.dequeue()+" ");
            }
        }
        System.out.println("("+s.size()+" left on stack)");
    }
}
