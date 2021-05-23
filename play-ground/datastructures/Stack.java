public class Stack<T> {
    private T[] data;
    private int topIndexLocation;

    @SuppressWarnings("unchecked")
    public Stack() {
        
        data = (T[]) new Object[100];
        topIndexLocation = -1;
        // topIndexLocation = 0;
    }

    @SuppressWarnings("unchecked")
    public Stack(int maximumSize) {
        
        data = (T[]) new Object[maximumSize];
        topIndexLocation = -1;
        // topIndexLocation = 0;
    }


    public boolean isFull() {
        // return topIndexLocation+1 == data.length;
        // return topIndexLocation == data.length-1;
        if (topIndexLocation+1 == data.length) return true; 
        else return false;
    }

    public boolean isEmpty(){
        return topIndexLocation == -1;
        // return topIndexLocation == 0;
    }

    public int size() {
        return topIndexLocation + 1;
        // return topIndexLocation;
    }

    public void push(T element) {
        if (isFull()) return;
        data[++topIndexLocation] = element;
    }

    // public T pop() {
    //     T poppedElement = null;

    //     if (!isEmpty()) {
    //         poppedElement= data[topIndexLocation];
    //         data[topIndexLocation] = null;
    //         topIndexLocation--;
    //     }
    //     return poppedElement;
    // }

    public T pop() {
        if (isEmpty()) return null;
        T elementToBeRemoved = data[topIndexLocation];
        data[topIndexLocation--] = null;
        return elementToBeRemoved;
    }

    public T top() {
        if(isEmpty()) return null;
        return data[topIndexLocation];
    }


}