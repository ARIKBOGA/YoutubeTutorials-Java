import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.size());

        System.out.println(stack);

        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.isEmpty());

    }
}
