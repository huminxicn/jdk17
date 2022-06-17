package jdk17.parrten;

import java.util.List;

/**
 * 匹配模式是 jdk17 中的预览特性。
 *
 * @author huminxi2017@gmail.com
 * @since 2022/05/23 19:45
 */
public class PetPatternMatch {
    static void caseFor(Pet p) {
//        switch (p) {
//            case Dog d -> d.walk();
//            case Fish f -> f.changeWater();
//            case Pet sp -> sp.feet();
//        }
    }

    static void petCare() {
        List.of(new Dog(), new Fish()).forEach(p -> caseFor(p));
    }
}
