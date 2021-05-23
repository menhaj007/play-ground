public class StackTester {
    public static void main(String[] args) {
        Stack<Integer> myNumberList = new Stack<Integer>(3);
        myNumberList.push(100);
        myNumberList.push(200);
        myNumberList.push(300);
        myNumberList.push(400);
        /*
        300
        200
        100
        */
        System.out.println(myNumberList.top());
        // System.out.println(myNumberList.pop());
        // System.out.println(myNumberList.top());
        // myNumberList.pop();
        // System.out.println(myNumberList.top());
        // myNumberList.pop();
        // System.out.println(myNumberList.top());
    }
    
}
