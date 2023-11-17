package DataStructures.Stack;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.println("Elements present in stack :");
        s.print();
    }

    static class Stack {
        List<Integer> stack = new ArrayList<>();

        void push(int element) {
            stack.add(0, element);
        }

        int pop() {
            if (stack.isEmpty()) {
                System.out.println("Stack Underflow");
                return 0;
            }
            return stack.remove(0);
        }

        int peek() {
            if (stack.isEmpty()) {
                System.out.println("Stack Underflow");
                return 0;
            }
            return stack.get(0);
        }

        void print() {
            for (int i = 0; i < stack.size(); i++) {
                if (i == 0)
                    System.out.println(stack.get(i) + " <- TOP");
                else
                    System.out.println(stack.get(i));
            }
        }
    }
}