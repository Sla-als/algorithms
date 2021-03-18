package lesson2;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {


//        int[] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arr[i] *=3;
//            }
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

//        for (String s : strarr) {
//            System.out.print(s);
//        }


//        String[] strarr = {"asd", "zxc", "qwe"};
//
//        System.out.println(Arrays.toString(strarr));
//
////        for (int i = 0; i < strarr.length; i++) {
////            strarr[i] += "0";
////        }
//
//        for (String s : strarr) {
//            s += "0";
//        }
//
//        System.out.println(Arrays.toString(strarr));


//        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 2, 3, 56, 2, 4, 3, 2));

//        System.out.println(list);
////        list.removeIf(i -> i == 2);
////        list.removeAll(Arrays.asList(2));
////        list.replaceAll(i -> i*i);
////        list.remove((Integer) 2);
//
//        System.out.println(list);


//        MyArrayList<Integer> mal = new MyArrayList<>();
//        mal.add(5);
//        mal.add(8);
//        mal.add(2);
//        System.out.println(mal);
//
//        mal.add(1, 99);
//        System.out.println(mal);
//
////        System.out.println(mal.remove(2));
//        System.out.println(mal.remove((Integer) 99));
//        System.out.println(mal);


//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//        msal.add(5);
//        msal.add(1);
//        msal.add(8);
//        msal.add(2);
//        msal.add(3);
//        System.out.println(msal);
//        msal.add(4);
//        System.out.println(msal);
//        System.out.println(msal.binaryIndexOf(1));


        int catacity = 100_000;
        Random r = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(catacity);
        for (int i = 0; i < catacity; i++) {
            mal.add(r.nextInt(100));
        }

        System.out.println("Array: " + mal);
        long startTime = System.currentTimeMillis();
        //mal.bubbleSort(); // 40671 ms
        //mal.selectionSort(); // 14592 ms
        //mal.insertionSort(); // 6886 ms
        long endTime = System.currentTimeMillis();
        System.out.println("Total: " + (endTime - startTime) + " ms");
        System.out.println(mal);



    }

}
