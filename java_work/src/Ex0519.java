public class Ex0519 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Ex0519_01 {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.age = 20;
        p1.name = "신짱구";
        p1.gender = "남성";
        p1.isMarried = false;

        p1.introduce();

        p1.name = "신영만";
        p1.age++;
        p1.isMarried = true;
        p1.introduce();

        Person p2 = new Person();
        p2.age = 40;
        p2.name = "신짱아";
        p2.gender = "여성";
        p2.isMarried = false;

        p2.introduce();

    }
}

class Person2 {
    int age;
    String name;
    String gender;
    boolean isMarried;

    void introduce() {
        String name = this.name;
        int age = this.age;

        System.out.println("== 자기소개 시작 ==");
        System.out.printf("이름: %s\n", name);
        System.out.printf("나이: %d\n", age);
        System.out.printf("성별: %s\n", gender);
        System.out.printf("결혼여부: %s\n", this.isMarried);
        System.out.println("== 자기소개 끝 ==");

    }
}

class Ex0519_hw1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "자동차1";
        c1.color = "black";
        c1.speed = 120;

        Car c2 = new Car();
        c2.name = "자동차2";
        c2.color = "red";
        c2.speed = 180;

        Car c3 = new Car();
        c3.name = "자동차3";
        c3.color = "blue";
        c3.speed = 140;

        c1.run();
        c2.run();
        c3.run();

    }
}

class Car {
    String name;
    String color;
    int speed;

    void run() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s이 %d의 속도로 달린다\n", this.name, this.speed);
        }
    }
}

class Ex0519_hw2 {
    public static void main(String[] args) {
        플레이어 a플레이어1;
        a플레이어1 = new 플레이어();
        a플레이어1.나이 = 20;
        a플레이어1.이름 = "홍길동";
        a플레이어1.직업 = "의적";

        int a플레이어2_나이 = 40;
        String a플레이어2_이름 = "임꺽정";
        String a플레이어2_직업 = "의사";

    }
}

class 플레이어 {
    int 나이;
    String 이름;
    String 직업;
}

class Ex0519_hw3car {
    public static void main(String[] args) {
        Car2 aCar1 = new Car2();
        aCar1.nm = "1";
        aCar1.spd = 230;
        aCar1.run();

        Car2 aCar2 = new Car2();
        aCar2.nm = "2";
        aCar2.spd = 210;
        aCar2.run();
    }
}

class Car2 {
    int spd;
    String nm;

    void run() {
        System.out.printf("%s번 자동차가 최고속력 %dkm로 달립니다.\n", this.nm, this.spd);
    }
}

class Ex0519_hw4 {
    public static void main(String[] args) {
        new person().speak();
    }
}

class person {

    void speak() {
        System.out.println("사람이 말합니다.");
    }
}

class Ex0519_hw5 {
    public static void main(String[] args) {
        Turtle aTurtle = new Turtle();

        aTurtle.walk();
        aTurtle.swim();
    }
}

class Turtle {

    void walk() {
        System.out.println("걷다");
    }

    void swim() {
        System.out.println("수영하다");
    }
}

class Ex0519_ex2 {
    public static void main(String[] args) {
        int rs = Calc.sum(30, 40);
        System.out.printf("rs : %d\n", rs);

        double rs2 = Calc.divid(10.5, 0.5);
        System.out.printf("rs2: %.3f\n", rs2);
    }
}

class Calc {
    // static을 사용하게 되면 객체를 선언하지 않아도 선언된다.
    // void를 사용하게 되면 빈공간 허공? 값이므로 rs와 rs2는 각각 정수, 실수 값을 넣어주어야 하는데
    // 아무런 결과값도 리턴되지 않아서 오류가 발생한다. void는 아무런 값도 리턴해주지 않는 것이기 때문
    // 그래서 타입형을 맞춰서 해당 값을 return 해주어야 한다. return 값이 결과 값이므로
    // return 5; 라고 할 시 해당 결과값이 5로 리턴된다.
    static int sum(int a, int b) { // 매개변수
        System.out.println(a + b); // 함수 실행 결과X
        return a + b; // 함수의 실행 결과 - 함수는 리턴을 만나면 그 즉시 종료된다.
        // return을 작성하고 그 이후에 코드를 작성해도 실행되지 않음, 에러 발생
    }

    static double divid(double a, double b) {
        return a / b;
    }
}

class Ex0519_hw6 {
    public static void main(String[] args) {
        int result;

        result = Calc2.add(10, 20);
        System.out.printf("결과: %d\n", result);

        result = Calc2.add(30, 20);
        System.out.printf("결과: %d\n", result);

        result = Calc2.add(30, 70);
        System.out.printf("결과: %d\n", result);

        result = Calc2.minus(30, 70);
        System.out.printf("결과: %d\n", result);

        result = Calc2.multiple(3, 7);
        System.out.printf("결과: %d\n", result);
    }
}

class Calc2 {
    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multiple(int a, int b) {
        return a * b;
    }
}

// 문제 : 아래와 같이 출력 되도록 해주세요.

class Ex0519_hw7 {
    public static void main(String[] args) {
        // 예시 시작
        int c = 20 + Math.더하기(10, 20);
        System.out.println(c);
        // 예시 끝

        int 결과1 = Math.oneToSum(3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 6

        int 결과2 = Math.oneToSum(10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 55
    }
}

class Math {
    // static => 본사직원
    // static은 현재 클래스에 지금당장 존재한다.
    static int 더하기(int a, int b) {
        // 메인 메서드의 int c와 아래 int c는 전혀 관계가 없다.
        int c = a + b;

        // return 값의 타입과 함수명의 앞부분이 같아야 한다.
        // return => 변신
        return c;
    }

    static int oneToSum(int a) {
        int k = 0;

        for (int i = 0; i <= a; i++) {
            k += i;
        }

        return k;
    }
}

// 문제 : 아래와 같이 출력 되도록 해주세요.

class Ex0519_hw8 {
    public static void main(String[] args) {
        int 결과1 = Math_0518.nToMSum(2, 3);
        System.out.println("결과1 : " + 결과1);
        // 출력 : 결과1 : 5

        int 결과2 = Math_0518.nToMSum(5, 10);
        System.out.println("결과2 : " + 결과2);
        // 출력 : 결과2 : 45
    }
}

class Math_0518 {

    static int nToMSum(int n, int m) {
        int k = 0;

        for (int i = n; i <= m; i++) {
            k += i;
        }

        return k;
    }
}