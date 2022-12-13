package grammer.generic;

import grammer.generic.ㄴ_제네릭_타입.Box;

public class ㄹ_제네릭_메소드 {
    /**
     * 제네릭 메소드는 매개타입과 리턴 타입으로 타입 파라미터를 갖는 메소드이다.
     * public <타입파라미터> 리턴타입 메소드명(매개변수) {...}
     * public <T> Box<T> boxing(T t) {...}
     */

    static class Util {
        public static <T> Box<T> boxing(T t) {
            Box<T> box = new Box<>();
            box.set(t);
            return box;
        }

        public void main(String[] args) {
            Box<Integer> box1 = Util.boxing(100);
            int intValue = box1.get();
        }
    }
}
