
public class stack {
    int size;
    int top;

    int[] array;

    stack(int capacity){
        top = 1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull(){
        return (top == size-1);
    }

    boolean isEmpty (){
        return (top == -1);
    }

    void push(int items) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        }else {
            array[top + 1] = items;
            top++;
        }
    }
    int pop(){
        int previousTop = top;
        if (isEmpty()) {
           System.out.println("Stack underflow"); 
        }else {
            top--;
        }
        return previousTop;
        
    }

   void printAllArray(){
    if (isEmpty()) {
        System.out.println("Array is empty");
    }else{
        System.out.println("Element in the stack are below");
        printElements(0);
        System.out.println();
    }
   }
   void printElements(int index) {
    if (index > top) {
        return;
    }
    System.out.println(array[index] + " ");
    printElements(index + 1);
   }
}

