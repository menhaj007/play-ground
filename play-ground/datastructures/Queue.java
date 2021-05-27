public class Queue<T> {
    private T[] queue;
    private int head;
    private int tail;
    private int numberOfElements;

    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        queue = (T[]) new Object[maxSize];
        head=tail=numberOfElements = 0;
    }
    public boolean isEmpty() {
        return numberOfElements == 0;
    }
    public boolean isFull() {
        return numberOfElements == queue.length;
    }
    
    public void enqueue(T element) {
        if (isFull()) return;
        queue[tail] = element;
        tail++;
        System.out.println(tail);
        numberOfElements++;
    }

    public void dequeue() {
        if (!isEmpty()) {
            queue[head] = null;
            numberOfElements--;
            shiftQueue();
        }
        
    }
    private void shiftQueue() {
        for (int i = 0; i < numberOfElements; i++) {
            queue[i] = queue[i+1];

        }
    }
    public int size() {
        return numberOfElements;
    }
    public T queueHead() {
        if(isEmpty()) return null;
        // System.out.println("Tail is at index: " + tail);
        return queue[head];
    }

}