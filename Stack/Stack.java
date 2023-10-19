package Stack;

public class Stack {
    private int maxSize;
    private double[] stackArray;
    private int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1;
    } // Constructor

    public void push(double value){
        top++;
        stackArray[top] = value;
        // also could use stackArray[++top] = value (explain in class)
    } // push

    public double pop(){
        double temp = stackArray[top];
        top--;
        return temp;
        // or return stackArray(top--);
    } // pop

    public double peek(){
        return stackArray[top];
    } // peek

    public boolean isEmpty() {
        return (top == -1);
    } // isEmpty

    public boolean isFull() {
        return (top == maxSize -1);
    } // isFull
} // class
