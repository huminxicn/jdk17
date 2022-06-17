package jdk15.npe;

/**
 * 更详细的 NullPointerException 信息。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/11 19:23
 */
public class BetterNullPointerReports {
    public static void main(String[] args) {
        C[] cs = {new C(new B(new A(null))),
                new C(new B(null)),
                new C(null)
        };
        for (C c : cs) {
            try {
                System.out.println(c.b.a.s);
            } catch (NullPointerException e) {
                System.out.println(e);
            }

        }
    }
}

class A {
    String s;

    A(String s) {
        this.s = s;
    }
}

class B {
    A a;

    B(A a) {
        this.a = a;
    }
}

class C {
    B b;

    C(B b) {
        this.b = b;
    }
}
