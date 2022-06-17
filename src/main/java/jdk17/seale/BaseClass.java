package jdk17.seale;

/**
 * 密封类。
 * 只有指定的类才能继承 BaseClass。
 *
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/14 15:50
 */
sealed class BaseClass permits C1, C2, SubBaseClass {
}