package jdk16.records;

/**
 * 一句话概括功能。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/17 00:24
 */
public record FinalField(int i) {
    int timesTen() {
        return i * 10;
    }

    //错误，不能给最终变量 i 赋值。
//    void tryIncrease() {
//        i++;
//    }
}
