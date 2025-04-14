import java.util.*;
import java.math.*;

public class StackImpl<T> implements CustomStack<T> {

    private List<T> myList;

    StackImpl(){
        this.myList = new ArrayList<>();
    }

    @Override
    public void push(T t){
        this.myList.add(t);
    }

    @Override
    public T pop(){
        if (this.myList.size() == 0) {
            return null;
        }
        T elementAtTopOfStack = this.myList.get(this.myList.size()-1);
        this.myList.remove(this.myList.size()-1);
        return elementAtTopOfStack;
    }

    @Override
    public int size(){
        return this.myList.size();
    }

    @Override
    public T peek(){
        if (this.myList.size() == 0) {
            return null;
        }
        T elementAtTopOfStack = this.myList.get(this.myList.size()-1);
        return elementAtTopOfStack;
    }

    @Override
    public boolean isEmpty(){
        if (this.myList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}

