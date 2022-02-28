/*
Create your own SListIterator which, again for simplicity, does not implement ListIterator. The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
The only way to insert and remove elements from an SList is through SListIterator
 */


public class SListIterator<T>{
    public SList<T> currentNode;

    public SListIterator(SList<T> slist)
    {
        currentNode = slist;
    }

    public boolean hasNext()
    {
        return (currentNode != null);
    }

    public SList<T> next()
    {
        SList<T> node = currentNode;
        currentNode = currentNode.next;
        return node;
    }
}


