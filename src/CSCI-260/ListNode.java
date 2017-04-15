package denisolt_shakhbulatov;

/*
 * author       : Denisolt Shakhbulatov
 * instructor  : Wenjia Li
 * course        : CSCI-260-M01
 * semester    : Fall 2016
 * created      : 11/04/16
 * updated    : 11/17/16
 */
public class ListNode<T> {

    protected T data;
    protected ListNode<T> prev, next;

    public ListNode(T data) {
        this.data = data;
        prev = null;
        next = null;
    }
}
