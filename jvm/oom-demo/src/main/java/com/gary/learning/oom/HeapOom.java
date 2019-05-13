package com.gary.learning.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 2019-05-13.
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @author Gary
 * @version 0.0.1
 * @date 2019-05-13
 * @since 0.0.1
 */
public class HeapOom {

    public static void main(String[] args) {
        List<HeapOom> list = new ArrayList<>();
        while (true) {
            list.add(new HeapOom());
        }
    }
}
