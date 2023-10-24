package Stack.StackExamples.BracketMatching;

public class BracketMatcher {
    private String input;

    public BracketMatcher(String input) {
        this.input = input;
    } // constructor

    public void match(){
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);
        char ch;

        // loop through the string and push any delimiters onto the stack.
        for(int i = 0; i < input.length(); i++) {
            // System.out.println("\n\ni is:" + i);
            ch = input.charAt(i);
            // System.out.println("ch is:" + ch);
            switch (ch) {
                case '{':  // opening chars
                case '(':
                case '[':
                // System.out.println("Pushing " + ch);
                    theStack.push(ch); // got an opening put it on the stack
                    break; // get next character
                case '}':   // closing chars
                case ')':
                case ']': 
                    // System.out.println("isEmpty()? " + theStack.isEmpty());
                    if(!theStack.isEmpty()){ // anything in stack?
                        char temp = theStack.pop();
                        // System.out.println("temp is: " + temp);
                        if((ch == '}' && temp != '{') || (ch == ')' && temp != '(') ||
                           (ch == ']' && temp != '[')) { // they don't match print error msg
                            System.out.println("Error: " + ch + " at index " + i);
                        } else {
                            System.out.println("all match");
                            break; // they match so nothing to do.
                        }
                    } else {
                        System.out.println("Error " + ch + " at " + i);
                    }
                default:
                    break;
        } // switch(ch)
    } // for
        // when the execution gets here, all characters have been processed.
        if(!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    } // match()
    
} // class
