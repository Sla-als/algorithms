package lesson3;


import lesson2.MyArrayList;

import java.util.Deque;
import java.util.Queue;
import java.util.Random;

public class Main {

    static String reverseString(String s) {
        MyStack<Character> myStack = new MyStack<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            myStack.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(myStack.pop());
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        //1. Создать программу, которая переворачивает вводимые строки (читает справа налево). +
        //2. Создать класс для реализации дека. +-
        //3*. Сделать возможность расширения внутреннего массива у стека и очереди. +-


//        MyStack<String> myStack = new MyStack<>();
//
//        myStack.push("asd");
//        myStack.push("bnm");
//        myStack.push("cdfg");
//        myStack.push("dffghfghfg");
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(myStack.pop());
//        }

//        Expression expression = new Expression("(( [7] + {-8*a} + t ])");
//        System.out.println(expression.checkBracket());

//        MyQueue<Integer> myQueue = new MyQueue<>();
//        for (int i = 0; i < 5; i++) {
//            myQueue.insert(i*10);
//        }
//        System.out.println(myQueue);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(myQueue.remove());
//        }
//        System.out.println(myQueue);

//        MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();
//        mpq.insert(5);
//        mpq.insert(1);
//        mpq.insert(3);
//        mpq.insert(4);
//        mpq.insert(7);
//        mpq.insert(2);
//
//        System.out.println(mpq);
//        System.out.println(mpq.remove());
//        System.out.println(mpq);
//        mpq.insert(6);
//        System.out.println(mpq);

        // System.out.println(reverseString("Abcde"));

        MyDeque myDeque = new MyDeque(10);

    }
}
