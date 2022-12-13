package grammer.generic;

import java.util.ArrayList;
import java.util.List;

public class ㄱ_왜_제네릭을_사용해야_하는가 {
    public static void main(String[] args) {

        /**
         * 비 제네릭 코드는 타입 변환을 해줘야 한다. -> 프로그램 성능에 악영향을 미친다
         */
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);

        /**
         * 제네릭 코드
         */
        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        String str2 = list2.get(0);
    }
}
