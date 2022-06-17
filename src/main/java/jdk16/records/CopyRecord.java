package jdk16.records;

/**
 * 要复制一个 record，必须显示地将所有字段都传给其构造器。
 * <p>
 * 创建 record，编译器会为其生成 equals 方法，这个方法可以确保副本与其原来的对象是相等的。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/17 00:39
 */
public class CopyRecord {
    public static void main(String[] args) {
        var r1 = new R(1, 2.0, 'r');
        var r2 = new R(r1.a(), r1.b(), r1.c());
        System.out.println(r1.equals(r2));
    }
}

record R(int a, double b, char c) {

}
