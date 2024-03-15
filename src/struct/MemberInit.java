package struct;

public class MemberInit {

    String name;
    int age;
    int grade;


    void initMember(String name, int age, int grade) {

        this.name = name; //자신의 인스턴스의 멤버변수
        this.age = age;
        this.grade = grade;

    }
}
