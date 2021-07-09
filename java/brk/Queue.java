import java.sql.Time;

public class Queue {
    Character[] queue;
    int head;
    int tail;
    int numberOfCharacters = 0;

    public Queue(int defSize) {
        queue = new Character[defSize];
        head = 0;
        tail = 0;
    }

    public boolean isFull() {
        return numberOfCharacters == queue.length;
    }
    public boolean isEmpty() {
        return numberOfCharacters == 0;
    }
    public void enqueue(Character c) {
        if (isFull()) return;
        queue[tail] = c;
        tail++;
        numberOfCharacters++;
    }
    public Character dequeue() {
        Character value = null;
        if (isEmpty()) return value;
        value = queue[head];
        queue[head] = null;
        numberOfCharacters--;
        tail--;
        for (int i = 0; i < size(); i++) {
            queue[i] = queue[i+1];
        }
        return value;
    }
    public Character peek() {
        return queue[head];
    }
    public int size() {
        return numberOfCharacters;
    }
    
}
