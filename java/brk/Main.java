import java.util.ArrayList;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String brk = "{[()]}]";
        Queue openChars = new Queue(brk.length()/2);
        Stack<Character> closeBrackets = new Stack<Character>();

        // System.out.println(openChars.size() + " |  " + (brk.length()/2));
        // openChars.enqueue('{');
        // openChars.enqueue('(');
        // openChars.enqueue('[');
        // System.out.println(openChars.size() + " |  " + (brk.length()/2));
        
        // System.out.println(openChars.dequeue());
        // System.out.println(openChars.dequeue());
        // System.out.println(openChars.dequeue());
        // System.out.println(openChars.size() + " |  " + (brk.length()/2));



        for (int i = 0; i < brk.length(); i++) {
            if (brk.charAt(i) == '{')
                openChars.enqueue(brk.charAt(i));
            if (brk.charAt(i) == '[')
                openChars.enqueue(brk.charAt(i));
            if (brk.charAt(i) == '(')
                openChars.enqueue(brk.charAt(i));
            
        }
        for (int i = 0; i < brk.length(); i++) {
            if (brk.charAt(i) == '}')
                closeBrackets.push(brk.charAt(i));
            if (brk.charAt(i) == ']')
            closeBrackets.push(brk.charAt(i));
            if (brk.charAt(i) == ')')
            closeBrackets.push(brk.charAt(i));
            
        }
        System.out.println("close: " +closeBrackets.size());
        if (closeBrackets.size() != openChars.size()) System.out.println("Don't match");
        else System.out.println("The size match: ");

        for (int i = 0; i < openChars.size(); i++) {
            System.out.println("Open -> " + openChars.peek() + " Close -> " + closeBrackets.peek());
            
            if (openChars.peek() == '{' && closeBrackets.peek() == '}') {
                System.out.println("Open -> " + openChars.peek() + " Close -> " + closeBrackets.peek());
                openChars.dequeue();
                closeBrackets.pop();
            }
            if (openChars.peek() == '[' && closeBrackets.peek() == ']') {
                System.out.println("Open -> " + openChars.peek() + " Close -> " + closeBrackets.peek());
                openChars.dequeue();
                closeBrackets.pop();
            }
            if (openChars.peek() == '(' && closeBrackets.peek() == ')') {
                System.out.println("Open -> " + openChars.peek() + " Close -> " + closeBrackets.peek());
                openChars.dequeue();
                closeBrackets.pop();
            }
        }
        if (openChars.size() == closeBrackets.size())
            System.out.println("Equal brackets: " + openChars.size() + " stack " + closeBrackets.size());
        else
            System.out.println("None equal.");

        
    }
}