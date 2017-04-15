package denisolt_shakhbulatov;

/*
 * author       : Denisolt Shakhbulatov
 * instructor  : Wenjia Li
 * course        : CSCI-260-M01
 * semester    : Fall 2016
 * created      : 11/04/16
 * updated    : 11/17/16
 */
public class Queue<T> extends List<T> {

    public void enqueue(T data) {
        insert(0, data);
    }

    public void dequeue() {
        delete(size()-1);
    }
}
