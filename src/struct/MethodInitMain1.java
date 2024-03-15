package struct;

public class MethodInitMain1 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();

        member1.name ="김민성";
        member1.age = 30;
        member1.grade = 100;

        MemberInit member2 = new MemberInit();

        member2.name ="김민성";
        member2.age = 340;
        member2.grade = 1040;

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {

            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);

        }



    }

}
