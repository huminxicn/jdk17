package jdk8.functional;

import java.util.Random;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/09 23:08
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
