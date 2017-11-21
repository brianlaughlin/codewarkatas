package kata.validbraces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;
import java.util.Stack;

/*
https://www.codewars.com/kata/valid-braces/train/java

 */
public class BraceChecker {
    public boolean isValid(String braces) {

        Stack<String> orderBraces = new Stack<>();
        int bracket = 0;
        int paren = 0;
        int curly = 0;
        String[] bracesCheck = braces.split("");

        if (checkBalance(bracket, paren, curly, bracesCheck, orderBraces)) return true;

        return false;
    }

    private boolean checkBalance(int bracket, int paren, int curly, String[] bracesCheck, Stack<String> orderBraces) {
        try {

            for (String brace : bracesCheck) {
                switch (brace) {
                    case "(":
                        paren++;
                        orderBraces.push("(");
                        break;
                    case ")":
                        paren--;
                        if (orderBraces.pop().equals("(")) break;
                        else return false;
                    case "[":
                        bracket++;
                        orderBraces.push("[");
                        break;
                    case "]":
                        bracket--;
                        if (orderBraces.pop().equals("[")) break;
                        else return false;
                    case "{":
                        curly++;
                        orderBraces.push("{");
                        break;
                    case "}":
                        curly--;
                        if (orderBraces.pop().equals("{")) break;
                        else return false;
                }
            }
        } catch (EmptyStackException e) {
            System.out.println(e);
            return false;
        }

        if (bracket == 0 && paren == 0 && curly == 0) return true;
        else return false;
    }

    public boolean isValidBest(String braces) {
        Stack<Character> s = new Stack<>();
        for (char c : braces.toCharArray())
            if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);
        return s.size() == 0;
    }

    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }

    public boolean isValidCleaver(String braces) {
        String b = braces;
        System.out.println(braces);
        for (int i = 0; i < braces.length() / 2; i++) {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if (b.length() == 0)
                return true;
        }
        return false;
    }


    public boolean isValidClean(String braces) {
        if (braces.equals("")) return false;

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : braces.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ']':
                case ')':
                case '}':
                    if (stack.peek() == null || !stack.peek().equals(c)) return false;
                    else stack.pop();
            }
        }
        return stack.isEmpty() ? true : false;
    }
}


