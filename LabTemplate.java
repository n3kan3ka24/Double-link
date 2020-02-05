public abstract class LabTemplate <E>
{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public abstract int getSize();
    public abstract boolean isEmpty();
    public abstract E getFirst();
    public abstract E getLast();
    public abstract ();






    private static class Node<E>
    {
        private E element;
        private Node <E> prev;
        private Node <E> next;

        public Node(E e, Node<E> p, Node<E> n)
        {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement()
        {
            return element;
        }

        public Node<E> getPrev()
        {
            return prev;
        }
        public Node<E> getNext()
        {
            return next;
        }
        public void setPrev(Node<E> p)
        {
            prev = p;
        }
        public void setNext(Node<E> n)
        {
            next = n;
        }
    }

}
