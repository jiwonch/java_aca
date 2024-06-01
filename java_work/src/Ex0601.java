public class Ex0601 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}


/**
 * 47강 생성자 심화문제
 * 사람이 생성할 때 자동으로 a왼팔 변수에 팔 객체가 연결되게 해주세요.
 * */

class Ex0601_47_01 {
    public static void main(String[] args) {
        new 사람47_1().걷다();
        System.out.println(new 사람47_1().a왼팔.길이 + "cm");
    }
}

class 사람47_1 {
    팔 a왼팔;

    void 걷다() {
        System.out.println("사람 걷는다.");
    }

    사람47_1() {
        a왼팔 = new 팔();
    }
}

class 팔{
    int 길이;
    팔() {
        this.길이 = 100;
    }
}

/**
 * 47
 * 사람의 걷다 메서드에 this. 를 적절한 곳에 추가하시오.
 * */
class Ex00601_47_02 {
    // 함수, 메서드
    // 단순히 프로그램의 시작점!
    public static void main(String[] args) {
        // 지역변수 => 하루살이 변수
        int k = 10; // main 함수 안에서만 산다

        사람47_2 a사람 = new 사람47_2();
        a사람.나이 = 20;

        int dan = 8; // main 함수 안에서만 산다.
        for (int i = 1; i < 9; i++) {
            // i => for block 안에서만 산다
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        System.out.println(a사람.나이);
        a사람.걷다();
    }
}

class 사람47_2 {
    int 길이;
    int 나이;

    void 걷다() {
        System.out.printf("%d세인 사람 걷는다.\n", this.나이);
    }
}

/**
 * 47강
 * 사람을 만들 때 왼팔과 손과 엄지손가락이 한번에 만들어지게 해주세요.
 * 아래와 같이 출려되도록 하시오.
 * */
class Ex0601_47_03 {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람47_3().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력: 5cm
    }
}

class 사람47_3 {
    int 길이;
    팔47_3 a왼팔;


    // 생성자 메서드 객체가 생성될 때 딱 한번 실행
    사람47_3() {
        a왼팔 = new 팔47_3();
    }
}

class 팔47_3 {
    손47_3 a손;

    팔47_3() {
        a손 = new 손47_3();
    }
}

class 손47_3 {
    손가락47_3 a엄지손가락;

    손47_3() {
        a엄지손가락 = new 손가락47_3();
        a엄지손가락.길이 = 5;
    }
}

class 손가락47_3 {
    int 길이;
}


/**
 * 48강 추상클래스와 인터페이스
 * 1. 추상 메서드(abstract)를 가지려면 해당 class도 추상 클래스(abstract)가 되어야 한다.
 * 2. 추상 메서드를 상속받은 자식 클래스는 메서드 오버라이딩이 필수다.
 * 3. 순도 100% 추상클래스는 인터페이스로 변경할 수 있다.
 * 4. 인터페이스는 다중 상속이 가능하다.
 * 이유는? 부모가 물려준 메서드가 있어도 자식클래스가 메서드 오버라이딩을 반드시 해야하기 때문이다.
 * */

/**
 * 추상메서드는 메서드 오버라이딩이 필수이다.
 * */
class Ex0601_48_01 {
    public static void main(String[] args) {
        칼48_01 a무기1 = new 칼48_01();
        활48_01 a무기2 = new 활48_01();
        창48_01 a무기3 = new 창48_01();

        무기48_01[] 무기들 = new 무기48_01[3];
        무기들[0] = a무기1;
        무기들[1] = a무기2;
        무기들[2] = a무기3;

        for(int i = 0; i < 무기들.length; i++) {
            무기48_01 a무기 = 무기들[i];
            a무기.작동();
        }
    }
}

abstract class 무기48_01 {
    abstract void 작동();
}

class 칼48_01 extends 무기48_01 {
    void 작동() {
        System.out.println("칼 작동");
    }
}

class 활48_01 extends 무기48_01 {
    void 작동() {
        System.out.println("활 작동");
    }
}

class 창48_01 extends 무기48_01 {
    void 작동() {
        System.out.println("창 작동");
    }
}

/**
 * 순도 100% 추상메서드로 이뤄진 것은 인터페이스로 변경가능하다.
 * */
class Ex0601_48_02 {
    public static void main(String[] args) {
        칼48_02 a무기1 = new 칼48_02();
        활48_02 a무기2 = new 활48_02();
        창48_02 a무기3 = new 창48_02();

        무기48_02[] 무기들 = new 무기48_02[3];
        무기들[0] = a무기1;
        무기들[1] = a무기2;
        무기들[2] = a무기3;

        for(int i = 0; i < 무기들.length; i++) {
            무기48_02 a무기 = 무기들[i];
            a무기.작동();
        }
    }
}

interface 무기48_02 {
    void 작동();
}

interface 부엌도구48_02 {
    void 작동();
}
class 칼48_02 implements 무기48_02, 부엌도구48_02 {
    public void 작동() {
        System.out.println("칼 작동");
    }
}

class 활48_02 implements 무기48_02 {
    public void 작동() {
        System.out.println("활 작동");
    }
}

class 창48_02 implements 무기48_02 {
    public void 작동() {
        System.out.println("창 작동");
    }
}

/**
 * 49강 생성자, 추상클래스 문제 1부
 * 플레이어가 어떤 공격을 할지는 플레이어의 직업에 따라 다릅니다.
 * */

class Ex0601_49_01 {
    public static void main(String[] args) {
        캐릭터49_01 a플레이어_캐릭터;

        a플레이어_캐릭터 = new 전사49_01();
        a플레이어_캐릭터.공격();
        // 출력: 전사가 대검으로 공격합니다.

        a플레이어_캐릭터 = new 마법사49_01();
        a플레이어_캐릭터.공격();
        // 출력: 마법사가 파이어볼로 공격합니다.
    }
}

abstract class 캐릭터49_01 {
    abstract void 공격();
}

class 전사49_01 extends 캐릭터49_01 {
    void 공격() {
        System.out.println("전사가 대검으로 공격합니다.");
    }
}

class 마법사49_01 extends 캐릭터49_01 {
    void 공격() {
        System.out.println("마법사가 파이어볼로 공격합니다.");
    }
}

/**
 * 49강
 * 생성자를 사용해서 전사의 기본 이름을 No Name으로 해주세요.
 * */

class Ex0601_49_02 {
    public static void main(String[] args) {
        전사49_02 a전사0 = new 전사49_02();
        a전사0.나이 = 20;
        a전사0.이름 = "칸";
        a전사0.성격 = "차가움";
        a전사0.a무기 = new 활49_02();

        전사49_02 a전사1 = new 전사49_02();
        전사49_02 a전사2 = new 전사49_02();
        전사49_02 a전사3 = new 전사49_02();
        전사49_02 a전사4 = new 전사49_02();
        전사49_02 a전사5 = new 전사49_02();

        System.out.println(a전사0.이름);
        // 출력 : 칸
        System.out.println(a전사1.이름);
        // 출력 : No Name
        System.out.println(a전사2.이름);
        // 출력 : No Name
        System.out.println(a전사3.이름);
        // 출력 : No Name
        System.out.println(a전사4.이름);
        // 출력 : No Name
        System.out.println(a전사5.이름);
        // 출력 : No Name
    }
}

class 전사49_02 {
    int 나이;
    String 이름;
    String 성격;
    무기49_02 a무기;

    // `전사()` 는 생성자 메서드 이다.
    // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
    // 생성자 메서드는 자동으로 호출됩니다.
    // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
    // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
    // 생성자 메서드는 리턴타입이 없습니다.
    // 당연하지만 생성자 메서드는 리턴값도 없습니다.
    전사49_02() {
        // 수정가능지역 시작
        this.나이 = 20;
        this.이름 = "No Name";
        this.성격 = "온순함";
        this.a무기 = new 칼49_02();
        // 수정가능지역 끝
    }
}

abstract class 무기49_02 {

}

class 칼49_02 extends 무기49_02 {

}

class 활49_02 extends 무기49_02 {

}

/**
 * 49강
 * 팔을 생성할 때 자동으로 길이가 세팅되도록 해주세요.
 * */
class Ex0601_49_03 {
    public static void main(String[] args) {
        사람49_03 a사람 = new 사람49_03();
        a사람.나이 = 10;
        a사람.a왼팔 = new 팔49_03();

        System.out.println(a사람.a왼팔.길이 +"cm");
//      출력 : 100cm
    }
}

class 사람49_03 {
    int 나이;
    팔49_03 a왼팔;

    사람49_03() {
        a왼팔 = new 팔49_03();
    }

}

class 팔49_03 {
    int 길이;

    팔49_03() {
        길이 = 100;
    }
}

/**
 * 50강 생성자, 추상클래스 문제 2부
 * 각각의 사람이 배달음식을 주문할 때, 각장의 상황과 기호에 따라
 * 적절한 음식점과 음식이 배달되도록 해주세요.
 * */

class Ex0601_50_01 {
    public static void main(String[] args) {
        사람50_01 a김철수 = new 사람50_01();
        a김철수.이름 = "김철수";
        a김철수.전화번호 = "010-1234-1234";
        a김철수.a좋아하는_음식점 = new 영화반점();
        a김철수.선호하는_음식의_매운정도 = "매운";
        a김철수.선호하는_음식 = "짬뽕";

        사람50_01 a김영희 = new 사람50_01();
        a김영희.이름 = "김영희";
        a김영희.전화번호 = "010-4321-4321";
        a김영희.a좋아하는_음식점 = new 북경반점();
        a김영희.선호하는_음식의_매운정도 = "안매운";
        a김영희.선호하는_음식 = "짬뽕";

        a김철수.배달_음식_주문하다();
        // 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.

        a김영희.배달_음식_주문하다();
        // 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.

        a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
        a김영희.선호하는_음식의_매운정도 = "아주 매운";
        a김영희.선호하는_음식 = "짜장";

        a김영희.배달_음식_주문하다();
        // 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.
    }
}

class 사람50_01 {
    String 이름;
    String 전화번호;
    String 선호하는_음식의_매운정도;
    String 선호하는_음식;

    음식점 a좋아하는_음식점;

    void 배달_음식_주문하다() {
        System.out.printf("%s에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", this.a좋아하는_음식점.음식점이름, this.이름, this.전화번호,  this.선호하는_음식의_매운정도, this.선호하는_음식);
    }
}

abstract class 음식점 {
    String 음식점이름;
}

class 영화반점 extends 음식점{
    영화반점() {
        this.음식점이름 = "영화반점";
    }
}

class 북경반점 extends 음식점 {
    북경반점() {
        this.음식점이름 = "북경반점";
    }
}

class Ex0601_50_02 {
    public static void main(String[] args) {
        사람50_02 a김철수 = new 김철수();
        사람50_02 a김영희 = new 김영희();

        a김철수.배달_음식_주문하다();
        // 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.

        a김영희.배달_음식_주문하다();
        // 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.

        a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
        a김영희.선호하는_음식의_매운정도 = "아주 매운";
        a김영희.선호하는_음식 = "짜장";

        a김영희.배달_음식_주문하다();
        // 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.

    }
}

abstract class 사람50_02 {
    String a좋아하는_음식점;
    String 선호하는_음식의_매운정도;
    String 선호하는_음식;
    String 이름;
    String 전화번호;

    void 배달_음식_주문하다() {
        System.out.printf("%s에서 %s(%s)에게 %s %s(을)를 배달합니다.\n", this.a좋아하는_음식점, this.이름, this.전화번호,  this.선호하는_음식의_매운정도, this.선호하는_음식);
    }
}

class 김철수 extends 사람50_02 {
    김철수() {
        this.a좋아하는_음식점 = "영화반점";
        this.이름 = "김철수";
        this.전화번호 = "010-1234-1234";
        this.선호하는_음식의_매운정도 = "매운";
        this.선호하는_음식 = "짬뽕";
    }
}

class 김영희 extends 사람50_02 {
    김영희() {
        this.a좋아하는_음식점 = "북경반점";
        this.이름 = "김영희";
        this.전화번호 = "010-4321-4321";
        this.선호하는_음식의_매운정도 = "안매운";
        this.선호하는_음식 = "짬뽕";
    }
}









