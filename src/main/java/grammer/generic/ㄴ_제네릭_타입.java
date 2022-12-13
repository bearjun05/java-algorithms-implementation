package grammer.generic;

public class ㄴ_제네릭_타입 {
    /**
     * 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말한다.
     * public class 클래스명<T> {...}
     * public interface 인터페이스명<T>{...}
     */

    /**
     * <T> : 타입 파라미터
     * 타입 파라미터는 일반적으로 대문자 알파벳 한 글자로 표현한다.

     * 밑에 예시 클래스가 있다 Box 클래스를 제네릭 타입으로 선언해주고,
     구현부(main) 에서 객체를 생성할 때 그 타입이 결정된다.
     */
    static class Box<T> {
        private T t;
        public T get() {return t;}
        public void set(T t) {this.t = t;}
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();  // T는 Box 클래스로 객체를 생성할 때 구체적인 타입으로 변경된다.
        box.set("hello");
        String str = box.get();
    }



}
