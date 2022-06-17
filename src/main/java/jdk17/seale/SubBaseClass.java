package jdk17.seale;

/**
 * 1. 一个 sealed 的基类无法阻止 non-sealed 的子类的使用，因此可以随时开放限制。
 * 2. non-sealed 类可以允许任意数量的子类。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/14 15:58
 */
public non-sealed class SubBaseClass extends BaseClass {
}
