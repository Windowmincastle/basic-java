package struct;

import java.lang.reflect.Member;

public class ConstructMain1 {

    public static void main(String[] args) {

        MemberConstruct member1 = new MemberConstruct("user1", 10, 10);
        MemberConstruct member2 = new MemberConstruct("user2", 10, 10);
        MemberConstruct member3 = new MemberConstruct("user3",100,100);
        MemberConstruct member4 = new MemberConstruct("user4", 10, 30);
        MemberConstruct member5 = new MemberConstruct("user5", 100, 100);
        MemberConstruct member6 = new MemberConstruct("user123", 100, 100);
        MemberConstruct member7 = new MemberConstruct("user1234",100,100);

        MemberConstruct[] members = {member1, member2,member3,member4,member6,member7,member5};


        for (MemberConstruct m : members) {
            System.out.println("이름->"+m.name+", 나이->"+m.age+", 성적->"+m.grade);
        }

    }
}
