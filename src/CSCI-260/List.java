package denisolt_shakhbulatov;

/*
 * author       : Denisolt Shakhbulatov
 * instructor  : Wenjia Li
 * course        : CSCI-260-M01
 * semester    : Fall 2016
 * created      : 11/04/16
 * updated    : 11/17/16
 */
public class List<T> {

    protected ListNode<T> head, tail, cursor;
    protected int size;

    // constructs empty list
    public List() {
        reset();
    }

    // constructs list with one node
    public List(T data) {
        reset(data);
    }

    // resets to empty list
    public void reset() {
        head = null;
        tail = null;
        cursor = null;
        size = 0;
    }

    // resets to list with one node
    public void reset(T data) {
        head = new ListNode(data);
        tail = head;
        cursor = tail;
        size = 1;
    }

    // fetches the length of the list
    public int size() {
        return size;
    }

    // checks if the list is empty
    public boolean empty() {
        return head == null && tail == null;
    }

    // fetches whatever data is located at index x
    public T get(int x) {
        return getNode(x).data;
    }

    // updates the data of index x
    public T set(int x, T data) {
        if (x >= size() || x < 0) {
            System.err.println("out of bound");
        } else {
            cursor = getNode(x);
            cursor.data = data;
        }
        return data;
    }

    // tries to fetch the index of some data
    public int find(T data) {
        cursor = head;
        for (int i = 0; i < size(); i++) {
            if (cursor.data.equals(data)) {
                return i;
            }
            cursor = cursor.next;
        }
        return -1;
    }

    // inserts some data so that it's new index is x
    public void insert(int x, T data) {
        ListNode<T> node = new ListNode(data);
        if (x > size || x < 0) {
            System.err.println("out of bound");
        } else if (x == 0 || head == null) {
             if (head == null) {
            node.next = null;
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
            size++;
        } else if (x == size()) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        } else {
            ListNode<T> prevnode = getNode(x - 1);
           ListNode next = prevnode.next;
           prevnode.next = node;
           node.next = next;
           size++;
        }
    }

    // removes whatever data is located at position x
    public void delete(int x) {
        if (x == 0) {
            head = head.next;
            size--;
        } else if (x == size()) {
            ListNode previousToTail = head;
            while (previousToTail.next != tail) {
                previousToTail = previousToTail.next;
            }
            tail = previousToTail;
            tail.next = null;
            
            size--;
        } else {
            ListNode<T> node = getNode(x - 1);
            if (node.next == tail) {
            tail = node;
            tail.next = null;
        } else if (node == tail) {
            return;
        } else {
            node.next = node.next.next;
        }
            size--;
        }
    }

    // nicely formats the entire list
    public String toString() {
        String entireList = "[";
        for (int i = 0; i < size(); i++) {
            if (i == size() - 1) {
                entireList += get(i);
            } else {
                entireList += get(i) + ", ";
            }
        }
        entireList += "]";
        return entireList;
    }

    // nicely prints the entire list
    public void print() {
        System.out.println(toString());
    }
    //gets the node
    public ListNode<T> getNode(int x) {
        cursor = head;

        for (int i = 0; i < x; i++) {
            cursor = cursor.next;
        }
        return cursor;
    }
}