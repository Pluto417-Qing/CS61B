package deque;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T>{
    private IntNode sentinel;
    private IntNode last;
    private int size;

    private class IntNode{
        IntNode pre;
        IntNode next;
        T item;

        public IntNode(IntNode p, T t, IntNode n){
            pre = p;
            item = t;
            next = n;
        }
    }

    public LinkedListDeque61B() {
        size = 0;
        this.sentinel = new IntNode(null,null,null);
        this.last = new IntNode(this.sentinel,null,null);
        this.sentinel.next = this.last;
    }

    @Override
    public void addFirst(T x) {
        IntNode p = new IntNode(sentinel,x,sentinel.next);
        sentinel.next.pre = p;
        sentinel.next = p;
        size++;
;    }

    @Override
    public void addLast(T x) {
        IntNode p = new IntNode(last.pre,x,last);
        last.pre.next = p;
        last.pre = p;
        size++;
    }

    @Override
    public List<T> toList() {
        List<T> returnList = new ArrayList<>();
        IntNode p = sentinel.next;
        while(p != last){
            returnList.add(p.item);
            p = p.next;
        }
        return returnList;
    }

    @Override
    public boolean isEmpty() {
        if(sentinel.next == last)
            return true;
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        if(size == 0)
            return null;

        IntNode p = sentinel.next;
        sentinel.next = p.next;
        p.next.pre = sentinel;

        size--;
        return p.item;
    }

    @Override
    public T removeLast() {
        if(size == 0)
            return null;

        IntNode p = last.pre;
        last.pre = p.pre;
        p.pre.next = last;

        size--;
        return p.item;
    }

    @Override
    public T get(int index) {
        if(size == 0 || index >= size)
            return null;
        IntNode p = sentinel.next;
        int i = 0;
        while(i < index){
            i++;
            p = p.next;
        }
        return p.item;
    }

    @Override
    public T getRecursive(int index) {
        if(size == 0 || index >= size)
            return null;

        return get(sentinel.next, index);
    }

    public T get(IntNode p, int index){
        if(index == 0)
            return p.item;
        return get(p.next,index-1);
    }
}
