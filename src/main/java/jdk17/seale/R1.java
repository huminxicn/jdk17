package jdk17.seale;

/**
 * record 是隐式的 final，所以不需要再前面加 final 关键字。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/16 08:42
 */
public record R1(String type) implements BaseInterface {
}
