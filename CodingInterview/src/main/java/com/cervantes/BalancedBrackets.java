package com.cervantes;

import java.util.Stack;

/**
 * Created by ancervan on 20/06/2018.
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        String brackets = "{[(])}";

        Stack<Character> stack = new Stack<>();

        for (Character c: brackets.toCharArray()) {

            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default :
                    if (stack.isEmpty() || stack.peek() != c) {
                        break;
                    }
                    stack.pop();

            }
        }

        System.out.println(stack);

        if(stack.isEmpty() )
            System.out.println("YES"); else
            System.out.println("NO");

    }

}

