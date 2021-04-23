package lesson4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    static class Apple{};
    static class Orange{};

    public static void main(String[] args) {



        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("one");
        mll.insertFirst("two");
        mll.insertFirst("three");
//        System.out.println(mll.removeFirst());
//
//        System.out.println(mll.removeLast());
//        System.out.println(mll.removeLast());
//        System.out.println(mll);
////        mll.insertLast("four");
////        System.out.println(mll);
//
//        mll.insert(1, "four");
//        System.out.println(mll);
////
//        mll.remove("one");
//        System.out.println(mll);
//
////        for (String s : mll) {
////            System.out.println(s);
////        }
//
        ListIterator<String> li = mll.listiterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
//        while(li.hasPrevious()){
//            System.out.println(li.previous());
//
//       }
        li.previousIndex();
        li.remove();
        while(li.hasNext()){
            System.out.print(li.next());
        }

//
//        MyLinkedStack<String>myLinkedStack = new MyLinkedStack<>();
//
//        myLinkedStack.push("First");
//        myLinkedStack.push("Sec");
//        myLinkedStack.push("Thr");
//        System.out.println(myLinkedStack.pop());



//        MyOneLinkedList myOneLinkedList = new MyOneLinkedList();
//        myOneLinkedList.insert(0,9);
//        System.out.println(myOneLinkedList.getFirst());
//        myOneLinkedList.insertFirst(10);
//        System.out.println(myOneLinkedList.getFirst());
//        System.out.println(myOneLinkedList.indexOf(8)); // -1 значит элемент не найден
//        System.out.println(myOneLinkedList.toString());


        //MyLinkedQueue
//        MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue();
//        myLinkedQueue.push("First");
//        myLinkedQueue.push("Second");
//        System.out.println(myLinkedQueue.peek());
//        myLinkedQueue.pop();
//        myLinkedQueue.pop();
//        System.out.println(myLinkedQueue.peek());



    }
}
