public class Ex0525 {
    public static void main(String[] args) {
        // static: 정적
        Person3  p1 = new Person3();
        p1.age =10;

        Person3 p2 = new Person3();
        p2.age = 20;
        p2.name = "홍길동";

        p2.자기소개();

        Person3 p3 = new Person3();
        p3.age = 30;
        p3.자기소개();

        Person3.인류평균나이 = (p1.age + p2.age + p3.age) / 3;
        Person3.인류평균나이소개();
    }
}

class Person3 {
    // 인스턴스 변수, 멤버 변수
    // static은 클래스가 로딩되면서 딱 한번 만들어진다
    static int maxSpeed;
    static int age;
    static String name;

    // 사람 평균 나이
    // 각각의 객체가 가질 필요 없는 변수는 static을 붙여서
    // Person.personAvgAge와 같은 방식으로 접근하는 것이 좋다.
    static int 인류평균나이;

    static void 인류평균나이소개() {
        System.out.printf("사람의 평균 나이는 %d살 입니다.\n", 인류평균나이);
    }

    static void 자기소개() {
        System.out.printf("제 이름은 %s이고 %d살 입니다.\n", name, age);
    }
}

class Ex0525_34_1 {
    public static void main(String[] args) {
        자동차 자동차 = new 자동차();

        자동차.달립니다();
    }
}

class 자동차 {
    void 달립니다() {
        System.out.println("자동차가 달립니다.");
    }
}

class Ex0525_34_2 {
    public static void main(String[] args) {
        사람3 a사람 = new 사람3();
    }
}

class 사람3 {
    static String 이름;
    static int 나이;
    static String 성별;

    static void 소개() {
        System.out.printf("이 사람은 %s이고, %d세이며, %s입니다.", 이름, 나이, 성별);
    }
}

class Ex0525_35_1 {
    // 상속을 쓰지 않은 경우
    public static void main(String[] args) {
        검은고양이 a검은고양이 = new 검은고양이();
        a검은고양이.숨쉬다();
        a검은고양이.먹는다();
        a검은고양이.뛰어넘다();
        a검은고양이.미래를_예지한다(); // 검은 고양이만의 기능

        흰고양이 a흰고양이 = new 흰고양이();
        a흰고양이.숨쉬다();
        a흰고양이.먹는다();
        a흰고양이.뛰어넘다();
        a흰고양이.목숨을_늘린다(); // 흰 고양이만의 기능
    }
}
class 검은고양이 {
    void 숨쉬다() {}
    void 먹는다() {}
    void 뛰어넘다() {}
    void 미래를_예지한다() {}
}

class 흰고양이 {
    void 숨쉬다() {}
    void 먹는다() {}
    void 뛰어넘다() {}
    void 목숨을_늘린다() {}
}

class Ex0525_35_2 {
    // 상속을 사용한 경우, 중복코드 적거나 없음
    public static void main(String[] args) {
        검은고양이2 a검은고양이 = new 검은고양이2();
        a검은고양이.숨쉬다();
        a검은고양이.먹는다();
        a검은고양이.뛰어넘다();
        a검은고양이.미래를_예지한다(); // 검은 고양이만의 기능

        흰고양이2 a흰고양이 = new 흰고양이2();
        a흰고양이.숨쉬다();
        a흰고양이.먹는다();
        a흰고양이.뛰어넘다();
        a흰고양이.목숨을_늘린다(); // 흰 고양이만의 기능

        점박이고양이 a점박이고양이 = new 점박이고양이();
        a점박이고양이.한강위로_걷는다();
        a점박이고양이.뛰어넘다();
    }
}

// 상속
// 부모클래스(상위타입 클래스)
class 고양이 {
    void 숨쉬다() {}
    void 먹는다() {}
    void 뛰어넘다() {
        System.out.println("담장을 뛰어넘다!");
    }
}

// is a 관계
// 자식 클래스(하위타입 클래스)
class 검은고양이2 extends 고양이 {
    void 미래를_예지한다(){}
}

class 흰고양이2 extends 고양이 {
    void 목숨을_늘린다(){}
}

class 점박이고양이 extends 고양이 {
    void 한강위로_걷는다() {}
}

/** 가정
 * 우리는 게임개발회사에 입사했다.
 * 우리게에게는 성격좋은 사수 한명이 있다.
 * 내가 개발한 게임은 옴리시뮬레이션 게임이다.
 * 선임 나의 개발을 도와주진 않지만 조언을 해준다.
 *
 * 요구사항
 * D1 요구: 오리를 생서앟고 날게하시오.
 * */

class Ex0525_36_01 {
    public static void main(String[] args) {
        오리 a오리 = new 오리();
        a오리.날다();
    }
}

/**
 * D1 요구 : 오리를 생성하고 날게하시오.
 * D1 완료 : 클래스와 메서드를 만들어서 처리
 * D2 요구: 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날개하시오.
 * */
class Ex0525_36_02 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}

/**
 * D1 요구 : 오리를 생성하고 날게하시오.
 * D1 완료 : 클래스와 메서드를 만들어서 처리
 * D2 요구: 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날개하시오.
 * D2 완료: 클래스와 메서드를 만들어서 처리
 * D3 요구: 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
 * */

class Ex0525_36_03 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}

/**
 * D1 요구 : 오리를 생성하고 날게하시오.
 * D1 완료 : 클래스와 메서드를 만들어서 처리
 * D2 요구: 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날개하시오.
 * D2 완료: 클래스와 메서드를 만들어서 처리
 * D3 요구: 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
 * D3 완료: 상속을 사용해서 처리
 * D4 요구: 게임의 재미를 위하여 고무오리를 추가하고 날게하시오.
 * */

class Ex0525_36_04 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.
    }
}

/**
 * D1 요구 : 오리를 생성하고 날게하시오.
 * D1 완료 : 클래스와 메서드를 만들어서 처리
 * D2 요구: 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날개하시오.
 * D2 완료: 클래스와 메서드를 만들어서 처리
 * D3 요구: 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
 * D3 완료: 상속을 사용해서 처리
 * D4 요구: 게임의 재미를 위하여 고무오리를 추가하고 날게하시오.
 * D4 완료: 클래스와 메서드를 만들어서 처리
 * D5 요구: 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔다.
 * 고무오리 계열은 하늘을 날 수 없게 해주세요.
 * */
class Ex0525_36_05 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

/**
 * D1 요구 : 오리를 생성하고 날게하시오.
 * D1 완료 : 클래스와 메서드를 만들어서 처리
 * D2 요구: 게임의 디테일을 살리기 위해서 `청둥오리`와 `흰오리`를 생성하고 날개하시오.
 * D2 완료: 클래스와 메서드를 만들어서 처리
 * D3 요구: 오리 계열의 클래스에 날다 메서드가 중복되었습니다. 중복을 제거해주세요.
 * D3 완료: 상속을 사용해서 처리
 * D4 요구: 게임의 재미를 위하여 고무오리를 추가하고 날게하시오.
 * D4 완료: 클래스와 메서드를 만들어서 처리
 * D5 요구: 주말 주주회의에서 고무오리가 하늘을 날아다니는 것에 대해서 태클이 들어왔다.
 * 고무오리 계열은 하늘을 날 수 없게 해주세요.
 * D5 완료: 메서드 오버라이드를 사용해서 처리
 * D6 요구: 고무오리가 반응이 좋습니다. 고무2오리를 추가하고 날수 없게 해주세요.
 * */
class Ex0525_36_06 {
    public static void main(String[] args) {
        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        // 출력 : 저는 날 수 없어요. ㅜㅠ
    }
}

class 오리 {
    void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 청둥오리 extends 오리{
}

class 흰오리 extends 오리{
}

// 메서드 오버라이딩 --> 상속에 있는 메서드를 새로운 메서드로 재정의한다.
// 메서드 재정의라고도 함 = 부모가 물려준 능력을 다시 구현
class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}
// 상속의 딜레마
// 상속을 받아도 중복되는 요소가 생길 수 있는데
// 상속은 모든 것을 만족시킬 순 없다.
class 고무2오리 extends 오리 {
    void 날다() {
        System.out.println("저는 날 수 없어요. ㅜㅠ");
    }
}

class Ex0525_38_01 {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
    }
}

class Ex0525_38_02 {
    public static void main(String[] args) {
        칼 a칼 = new 칼();
        활 a활 = new 활();
    }
}


class Ex0525_39_01 {
    public static void main(String[] args) {
        무기 a무기 = new 칼();
        a무기.공격();
    }
}


class 무기 {
    void 공격() {
        System.out.println("칼로 공격합니다.");
    }

    void 칼() {}

    void 활() {}
}

class 칼 extends 무기 {
}

class 활 extends 무기 {
}

// 문제 : 아래 코드가 실행되도록 해주세요.

class Ex0525_40_01 {
    public static void main(String[] args) {
        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!
    }
}


// 상황 : DVD방에 3개의 서로다른 tv가 있다. 영업을 하다보니 각 tv의 특별한 기능은 거의 사용될 일이 없고 기본적인 켜기/끄기 만 사용된다. 현재 리모콘이 3개나 있는습니다.
// 문제 : 알바를 편하게 하기 위해서 표준Tv 리모콘을 구현해주세요.

class Ex0525_40_02 {
    public static void main(String[] args) {
        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");

        샤오미Tv a샤오미Tv = new 샤오미Tv();
        삼성Tv a삼성Tv = new 삼성Tv();
        LGTv aLGTv = new LGTv();

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 만든다.
//        표준Tv a표준Tv;

        표준Tv a표준Tv = new 표준Tv();
        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.

        a표준Tv = a샤오미Tv;
//        a표준Tv.TvName = "샤오미TV";
        a표준Tv.켜기();
        // 출력 : 샤오기TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오기TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
//        a표준Tv.TvName = "삼성TV";
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
//        a표준Tv.TvName = "LGTv";
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.

        // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
        // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
        LGTv aLGTv2 = (LGTv)a표준Tv;
        aLGTv2.게임모드전환();
    }
}


class 표준Tv {
    String TvName = "";
    void 켜기() {
        System.out.printf("%s 켜집니다.\n", this.TvName);
    }

    void 끄기() {
        System.out.printf("%s 꺼집니다.\n", this.TvName);
    }
}

class 샤오미Tv extends 표준Tv {
    public 샤오미Tv() {
        TvName=super.TvName="샤오미Tv";
    }
    void vr켜기() {
        System.out.println("샤오미Tv vr켜기!");
    }
}

class 삼성Tv extends 표준Tv {
    public 삼성Tv() {
        TvName=super.TvName="삼성Tv";
    }
    void ar켜기() {
        System.out.println("삼성Tv ar켜기!");
    }
}

class LGTv extends 표준Tv {
    public LGTv() {
        TvName=super.TvName="LGTv";
    }
    void 게임모드전환() {
        System.out.println("LGTv 게임모드전환!");
    }
}
