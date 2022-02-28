/*
Create a generic, singly linked list class called SList, which, to keep things simple, does not implement the List interface.

Each Link object in the list should contain a reference to the next element in the list, but not the previous one (LinkedList, in contrast, is a doubly linked list, which means it maintains links in both directions).
 */

public class SList<T> {
    private T value;
    public SList next;

    public SList()
    {
        this.value = null;
        next = null;
    }
    public SList(T value)
    {
        this.value = value;
        next = null;
    }

    public SListIterator iterator()
    {
        return new SListIterator(this);
    }

    //function to print node value
    public String toString()
    {
        String nodeString = "Node value: " + value.toString();

        return nodeString;
    }
}
