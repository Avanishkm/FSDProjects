package Assignments.Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {

    }
    public static Queue<Integer> ReverseK(Queue<Integer> queue, int k){
        if(k<0 || k>queue.size()){
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size(); i++) {
            queue.add(queue.remove());
        }
        return queue;
    }
}
