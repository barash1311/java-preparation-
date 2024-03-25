package com.barash.day16.CustomQ;

import javax.crypto.spec.PSource;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Cque queue=new Cque(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);

        //System.out.println(queue.front());
        queue.display();

    }

}
