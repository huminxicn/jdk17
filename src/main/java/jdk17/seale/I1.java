package jdk17.seale;

/**
 * 编译器会阻止我们从密封层次结构中向下转型为非法类型。
 * 可以用 getPermittedSubclasses 方法来获取允许的子类。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/14 15:55
 */
public final class I1 implements BaseInterface {
    public static void main(String[] args) {
        BaseInterface bi = new I1();
        I1 i = (I1) bi;
        //inconvertible types
//        Something s = (Something) i;
        for (var v : BaseInterface.class.getPermittedSubclasses()) {
            System.out.println(v.getSimpleName());
        }

    }

}

class Something {
}
