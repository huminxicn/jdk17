package jdk16.records;

/**
 * 尽管规范的构造器会根据 record 的参数自动创建出来，但我们可以添加一个紧凑构造器，紧凑构造器常用于验证参数。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/17 00:35
 */
record Point(int x, int y) {
    void assertPositive(int val) {
        if (val < 0) throw new IllegalArgumentException("negative " + val);
    }

    //紧凑，没有参数列表
    Point {
        assertPositive(x);
        assertPositive(y);
    }
}
