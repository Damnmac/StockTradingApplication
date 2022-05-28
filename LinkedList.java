
    public class LinkedList <T>
    {
        Node<T> head;
        Node<T> tail;
        int size = 0;
        class Node<T> {
            T element;
            Node<T> next;

            public Node(T o) {
                element = o;
            }
        }



        public LinkedList() {
            Node<T> head = null;
            Node<T> tail = null;
        }

        public int size()
        {
            return size;
        }

        public void addFirst(T e) {
            Node<T> newNode = new Node<>(e);
            newNode.next = head;
            head = newNode;
            size++;
            if (tail == null)
                tail = head;
        }

        public void addLast(T e) {
            if (tail == null) {
                head = tail = new Node<>(e);
            }
            else {
                tail.next = new Node<>(e);
                tail = tail.next;
            }
            size++;
        }

        public void add(int index, T e) {
            if (index == 0) addFirst(e);
            else if (index >= size) addLast(e);
            else {
                Node<T> current = head;
                for (int i = 1; i < index; i++)
                    current = current.next;
                Node<T> temp = current.next;
                current.next = new Node<>(e);
                (current.next).next = temp;
                size++;
            }
        }

        public String traverse()
        {
            String s ="";
            Node current;
            current = head;
            while ( current != null ) {
                s += (current.element +"\n");
                current = current.next;
            }
            return s;
        }
    }






