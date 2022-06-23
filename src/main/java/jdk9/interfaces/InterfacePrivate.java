package jdk9.interfaces;

/**
 * jdk9 接口中支持 private 方法。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/14 15:46
 */
public interface InterfacePrivate {
    /**
     * JDK 9 支持 private 方法。
     */
    private void p() {
    }

    /**
     * JDK 8 支持 default、static 方法。
     */
    default void d() {
    }

    /**
     * JDK 7 版本之前，接口类只能定义一些抽象方法与常量，子类必须重写接口类中定义的全部方法。
     */
    abstract void a();
}
