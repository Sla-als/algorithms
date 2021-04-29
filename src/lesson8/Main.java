package lesson8;

import java.util.HashMap;
import java.util.Random;

public class Main {
    static Random random;
    public static void main(String[] args) {
        random = new Random();



        ChainingHashMap<Integer, String> chm= new ChainingHashMap<>(7);

        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");
        chm.put(3, "thee");
        chm.put(3, "three");

        for (int i = 0; i < 12; i++) {
            chm.put(random.nextInt(100), "");
        }

        System.out.println(chm);
        System.out.println("size: "+chm.size());
     //   chm.remove(2);
        chm.remove(1,"one");
        System.out.println(chm);
        System.out.println("size: "+chm.size());

        LinearProbingHashMap<Integer,String> lphm = new LinearProbingHashMap<>(19);
//        lphm.put(1, "one");
//        lphm.put(2, "two");
//        lphm.put(3, "three");
//        lphm.put(2, "twosdfsdf");
      // System.out.println(lphm);

    }
}
