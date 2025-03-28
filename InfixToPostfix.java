import java.util.Stack;

public class InfixToPostfix {
    
    // Method to check if a character is an operand (either number or letter)
    public static boolean isOperand(char c) {
        return Character.isLetterOrDigit(c);
    }
    
    // Method to get precedence of operators
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    // Method to convert infix to postfix
    public static String infixToPostfix(String infix) {
        // Stack to hold operators
        Stack<Character> stack = new Stack<>();
        // StringBuilder to hold the postfix expression
        StringBuilder postfix = new StringBuilder();
        
        // Loop through each character in the infix expression
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            
            // If the character is an operand, add it to the result
            if (isOperand(c)) {
                postfix.append(c);
            } 
            // If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            } 
            // If the character is ')', pop and append to result until '(' is found
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();  // Discard the '('
            } 
            // If the character is an operator
            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }

    // Main method to test the infix to postfix conversion
    public static void main(String[] args) {
        String infix = "A*(B+C)/D";
        String postfix = infixToPostfix(infix);
        
        System.out.println("Infix Expression: " + infix);
        System.out.println("Postfix Expression: " + postfix);
    }
}