package Stack.StackExamples.BracketMatching;

public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    } // Constructor

    public void push(char value){
        top++;
        stackArray[top] = value;
    } // push

    public char pop(){
        char temp = stackArray[top];
        top--;
        return temp;
    } // pop

    public char peek(){
        return stackArray[top];
    } // peek

    public boolean isEmpty() {
        return (top == -1);
    } // isEmpty

    public boolean isFull() {
        return (top == maxSize -1);
    } // isFull
} // class
