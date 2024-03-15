package struct;

public class MemberThis {

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        //지역변수에 nameField가 없기 때문에 자신의 멤버변수를 찾아가기 떄문에 this를 생략할 수 있다.

    }
}
