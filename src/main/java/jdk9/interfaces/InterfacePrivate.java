package jdk9.interfaces;

/**
 * jdk9 接口中支持 private 方法。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/14 15:46
 */
public interface InterfacePrivate {
    private void p() {
    }

    default void d() {
    }
}
