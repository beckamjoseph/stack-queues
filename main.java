public class main {

    public static void main(String[] args) {
        stack stack = new stack(5);
        stack.push(45);
        stack.push(5);
        stack.push(15);
        stack.push(35);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printAllArray();

    }
}