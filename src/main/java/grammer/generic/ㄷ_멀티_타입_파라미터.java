package grammer.generic;

public class ㄷ_멀티_타입_파라미터 {

    /**
     * 제네릭 타입은 두 개 이상의 멀티 타입 파라미터를 사용할 수 있다.
     */

    class Product<T, M> {

        private T kind;
        private M model;

        public T getKind() {
            return this.kind;
        }

        public M getModel() {
            return this.model;
        }

        public void setKind(T kind) {
            this.kind = kind;
        }

        public void setModel(M model) {
            this.model = model;
        }
    }
}
