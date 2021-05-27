public class QueueTester {
    public static void main(String[] args) {
        Queue<Integer> queueInt = new Queue<>(3);
        queueInt.enqueue(10);
        queueInt.enqueue(20);
        queueInt.enqueue(30);
        queueInt.enqueue(40);
        System.out.println("Size is: " +queueInt.size());
        System.out.println("Head " + queueInt.queueHead());

        queueInt.dequeue();
        System.out.println("Size is: " +queueInt.size());
        System.out.println("Head " + queueInt.queueHead());

        queueInt.dequeue();
        System.out.println("Size is: " +queueInt.size());
        System.out.println("Head " + queueInt.queueHead());
        
        queueInt.dequeue();
        System.out.println("Size is: " +queueInt.size());
        System.out.println("Head " + queueInt.queueHead());
    }
    
}
