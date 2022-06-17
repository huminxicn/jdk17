package jdk16.records;

import java.util.Map;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/17 00:08
 */
public class BaseRecord {
    public static void main(String[] args) {
        var bob = new Employee("bob", 26);
        var andy = new Employee("andy", 27);
//        bob.id = 12;//错误，id 在 Employee 中的访问权限为 private。
        System.out.println(bob.name() + ":" + bob.age());
        System.out.println(bob);//toString
        //Employee 可以用作 Map 中的键。
        var map = Map.of(bob, "B", andy, "A");
        System.out.println(map);
    }
}
