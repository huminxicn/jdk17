package jdk17.seale;

/**
 * 密封接口。
 * jdk 16 的 record 也可以用作接口的密封实现。因为 record 是隐式的 final，所以它们不需要在前面加 final 关键字。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/14 15:55
 */
public sealed interface BaseInterface permits I1,R1 {
}
