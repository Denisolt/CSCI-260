package denisolt_shakhbulatov;

/*
 * author       : Denisolt Shakhbulatov
 * instructor  : Wenjia Li
 * course        : CSCI-260-M01
 * semester    : Fall 2016
 * created      : 11/04/16
 * updated    : 11/17/16
 */
public class Stack<T> extends List<T> {

    public void push(T data) {
        insert(size(), data);
    }

    public void pop() {
        delete(size() - 1);
    }

    public T top() {
        return tail.data;
    }
}