public class Ex0526 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**
 * 문제: 자동차 리모콘이 페라리 객체를 가리키게 한 후 해당 리모콘이 가리키고 있는
 * 객체를 다시 페라리 리모콘으로 가리키게(참조하게)하는 코드를 작성하세요.
 * */
class Ex0526_42_01 {
    public static void main(String[] args) {
        페라리 페라리a  = new 페라리();
        Ex0526_42_자동차 자동차a = 페라리a;
        자동차a = 페라리a;
        페라리 페라리a2 = (페라리)자동차a;
    }
}

class Ex0526_42_자동차 {
    void 달리다() {}
    void 서다() {}
}

class 페라리 extends Ex0526_42_자동차{
    void 뚜겅이_열리다() {}
}

/**
 * 사람이 a왼팔이라는 변수를 가질 수 있게 하라
 * */
class Ex0526_43_01 {
    public static void main(String[] args) {
        Ex0526_42_사람 a사람 = new Ex0526_42_사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔42();
    }
}

class Ex0526_42_사람 {
    int 나이;
    팔42 a왼팔;
}

class 팔42 {

}

/**
 * 전사가 가지고 있는 변수 a무기와 칼과 활에 모두 호환되게 하라
 * */

class Ex0526_43_02 {
    public static void main(String[] args) {
        Ex0526_43_전사 a전사 = new Ex0526_43_전사();

        a전사.나이 = 20;
        a전사.a무기 = new Ex0526_43_활();
        a전사.a무기 = new Ex0526_43_칼();
    }
}

class Ex0526_43_전사 {
    int 나이;
    Ex0526_43_무기 a무기;
}

class Ex0526_43_무기 {

}

class Ex0526_43_활 extends Ex0526_43_무기 {

}

class Ex0526_43_칼 extends Ex0526_43_무기 {

}

/**
 * 44강 - 객체 심화문제2
 * 전사가 들고 있는 무기에 의해서 서로 다른 공격형태를 보이도록 하라
 * */
class Ex0526_44_01 {
    public static void main(String[] args) {
        Ex0526_44_전사 a전사 = new Ex0526_44_전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new Ex0526_44_활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new Ex0526_44_칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class Ex0526_44_전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    Ex0526_44_무기 a무기;

    String 무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        a무기.작동(this.이름);
    }
}

class Ex0526_44_무기 {
    void 작동(String 사용자명) {

    }
}

class Ex0526_44_칼 extends Ex0526_44_무기 {
    void 작동(String 사용자명) {
        System.out.printf("%s가 칼로 공격합니다.\n", 사용자명);
    }
}

class Ex0526_44_활 extends Ex0526_44_무기 {
    void 작동(String 사용자명) {
        System.out.printf("%s가 활로 공격합니다.\n", 사용자명);
    }
}

/**
 * 45강 - 객체 심화문제3
 * 전사가 들고 있는 무기에 의해서 서로 다른 공격형태르 보이도록 하라(매개변수 금지)
 * */

class Ex0526_45_01 {
    public static void main(String[] args) {
        Ex0526_45_전사 a전사 = new Ex0526_45_전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new Ex0526_45_활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new Ex0526_45_칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}

class Ex0526_45_전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    Ex0526_45_무기 a무기;

    String 무기;

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격() {
        a무기.사용자 = this.이름;
        a무기.작동();
    }
}

class Ex0526_45_무기 {
    String 사용자;
    void 작동() {

    }
}

class Ex0526_45_칼 extends Ex0526_45_무기 {
    void 작동() {
        System.out.printf("%s가 칼로 공격합니다.\n", 사용자);
    }
}

class Ex0526_45_활 extends Ex0526_45_무기 {
    void 작동() {
        System.out.printf("%s가 활로 공격합니다.\n", 사용자);
    }
}

/**
 * 46강
 * 생성자 메서드
 * 생성자 메서드는 생성될 때 딱 한번 실행!
 * */
class Ex0526_46_01 {
    public static void main(String[] args) {
        사람46_01 a홍길동 = new 홍길동();
        System.out.println("== 홍길동 정보 ==");
        System.out.printf("이름: %s\n", a홍길동.이름); // 홍길동
        System.out.printf("나이: %d\n", a홍길동.나이); // 30

        사람46_01 a홍길순 = new 홍길순();
        System.out.println("== 홍길순 정보 ==");
        System.out.printf("이름: %s\n", a홍길순.이름); // 홍길순
        System.out.printf("나이: %d\n", a홍길순.나이); // 30
    }
}

class 사람46_01 {
    String 이름;
    int 나이;

    // 객체가 생성될 때 딱 한번 실행!
    사람46_01() {
        // 생성자 메서드
        this.나이 = 30;
    }
}

class 홍길동 extends 사람46_01 {
    홍길동() {
        this.이름 = "홍길동";
    }
}

class 홍길순 extends 사람46_01 {
    홍길순() {
        this.이름 = "홍길순";
    }
}
