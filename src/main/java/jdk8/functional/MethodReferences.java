package jdk8.functional;

/**
 * 方法引用。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/05 23:44
 */
public class MethodReferences {
    public static void main(String[] args) {
        Describe d = new Describe();
        Callable c = d::show;
        c.call("call()");

        c = MethodReferences::hello;
        c.call("bob");

        c = new Description("valuable")::help;
        c.call("information");

        c = Helper::assist;
        c.call("help!");
    }
    static void hello(String name) {
        System.out.println("hello, " + name);
    }

    static class Description {
        String about;

        Description(String desc) {
            about = desc;
        }

        void help(String msg) {
            System.out.println(about + " " + msg);
        }
    }

    static class Helper {
        static void assist(String msg) {
            System.out.println(msg);
        }
    }

}
