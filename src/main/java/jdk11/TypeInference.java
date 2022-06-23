package jdk11;

/**
 * 局部变量支持类型推断。
 * 字段不支持类型推断。
 * 类型推断特别适合 for 循环。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/11 19:33
 */
public class TypeInference {
    void method() {
        //显示指定类型。
        String hello1 = "hello";
        //类型推断
        var hello = "hello!";
        //用户定义的类型可以起作用。
        var custom = new Custom();
        var pb2 = new Custom();
    }

    //静态方法里也可以启用。
    static void staticMethod() {
        var hello = "hello";
        var pb2 = new Custom();

    }
}

class Custom {
}

class NoInference {
    String field1 = "Field";
//    var field2 = "can't do this";
}