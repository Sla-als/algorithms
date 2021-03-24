package lesson3;

public class Expression {
    private String exp;

    public Expression(String exp) {
        this.exp = exp;
    }

    public boolean checkBracket() {
        MyStack<Character> stack = new MyStack<>(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Error in " + i + " position");
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' ||
                        ch == ']' && top != '[' ||
                        ch == '}' && top != '{') {
                    System.out.println("Error in " + i + " position: bracket doesn't match");
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: bracket doesn't match");
            return false;
        }
        return true;
    }

    public boolean checkBracketToo() {

        MyStack<Character> myStack = new MyStack<>(exp.length());

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                myStack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (myStack.isEmpty()) {
                    System.out.println("err emp");
                    return false;
                }
                char top = myStack.pop();
                if (ch == ')' && top != '(' ||
                        ch == '}' && top != '{' ||
                        ch == ']' && top != '[') return false;
            }
        }
        if (!myStack.isEmpty()){return false;}

        return true;
    }
}
