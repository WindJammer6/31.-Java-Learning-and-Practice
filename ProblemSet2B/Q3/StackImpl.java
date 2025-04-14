import java.util.*;
import java.math.*;

public class StackImpl<T> implements CustomStack<T> {

    private List<T> myList;

    StackImpl(){
        this.myList = new ArrayList<>();
    }

    public void push(T t){
        this.myList.add(t);
    }

    public T pop(){
        if (this.myList.size() == 0) {
            return null;
        }
        T elementAtTopOfStack = this.myList.get(this.myList.size()-1);
        this.myList.remove(this.myList.size()-1);
        return elementAtTopOfStack;
    }

    public int size(){
        return this.myList.size();
    }

    public T peek(){
        if (this.myList.size() == 0) {
            return null;
        }
        T elementAtTopOfStack = this.myList.get(this.myList.size()-1);
        return elementAtTopOfStack;
    }

    public boolean isEmpty(){
        if (this.myList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

