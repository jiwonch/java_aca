public class Ex0518 {
    public static void main(String[] args) {
        System.out.println("hello World!");
    }
}

class Ex0518_ex1 {
    public static void main(String[] args) {
        // do while 문
        int i = 11;
        do { // 조건을 체크하기 전 무조건 처음에 한번 실행 !
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}

class Ex10518 {
    public static void main(String[] args) {
        int dan = 2;
        int i = 1;
        while (true) {
            // break: 반복문을 빠져나올 때 사용
            if (i == 10) {
                break;
            }

            // continue: 다음 실행 될 코드 skip 시킨다.
            if (i == 4) {
                i++;
                continue;
            }

            System.out.println(dan + " * " + i + " = " + dan * i);
            i++;
        }
    }
}

class Ex20518 {
    public static void main(String[] args) {
        // while for
        System.out.println("==while==");
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }

        System.out.println("==for==");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class Ex0518_3 {
    public static void main(String[] args) {
        // %d: 10진수 정소를 담을 수 있는 서식 지정자
        // %f: 실수를 담는 서식 지정자
        // %s: 문자열 담을 수 있는 서식 지정자
        // \n: 뉴라인

        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }

        dan = 3;
        int j = 1;
        // String.format: 문자열 형식으로 값을 가지고 있는 것
        String gugudan = String.format("%d * %d = %d", dan, j, dan * j);
        System.out.printf("[%s]", gugudan);
    }
}

class Ex0518_hw1 {
    public static void main(String[] args) {
        boolean[] arr1 = new boolean[3];

        arr1[0] = true;
        arr1[1] = false;
        arr1[2] = false;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }
    }
}

class Ex0518_hw2 {
    public static void main(String[] args) {
        char[] arr2 = new char[3];

        arr2[0] = 'a';
        arr2[1] = 'b';
        arr2[2] = 'c';

        for (int i = 0; i < 3; i++) {
            System.out.println(arr2[i]);
        }
    }
}

class Ex0518_hw3 {
    public static void main(String[] args) {
        double[] arr3 = new double[3];

        arr3[0] = 3.14;
        arr3[1] = 5.12;
        arr3[2] = 4.0;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr3[i]);
        }
    }
}

class Ex0518_hw4 {
    public static void main(String[] args) {
        int[] arr4 = new int[10];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i + 1;
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }

        // 향상된 if 문
        for (int i : arr4) System.out.println(i);

        // 역순 출력
        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.println(arr4[i]);
        }
    }
}

class Ex0518_array {
    public static void main(String[] args) {
        // class
        // int들
        // 10, 20, 30
        // 배열 객체

        // new는 객체를 만드는 행위
        int[] arr = new int[3]; // new를 사용해서 만들어준 것만 객체임 -- 전체에 객체 하나
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        int[] arr2 = arr;

        arr[2] = 40;

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
    }
}

class Ex0518_arrsumavg {
    public static void main(String[] args) {
        // 정수 배열 선언 및 초기화
        int[] numbers = {5, 10, 15, 20, 25};
        // int[] numbers = new int[5];

        int sum = 0;
        int avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            avg = sum / numbers.length;
        }

        System.out.printf("이 배열 객체의 합은 %d\n", sum);
        System.out.printf("이 배열 객체의 평균은 %d\n", avg);
    }
}

class Ex0518_userobjarray {
    public static void main(String[] args) {
        // 사용자 정의 객체
        // 클래스의 인스턴스화
        // 클래스의 객체화
        사람 a사람 = new 사람();
        a사람.이름 = "김철수";
        a사람.나이 = 27;
        a사람.키 = 190.5;
        a사람.취미 = "노래듣기";

        System.out.println(a사람.이름);
        System.out.println(a사람.나이);
        System.out.println(a사람.키);
        System.out.println(a사람.취미);
    }
}

// 객체를 만들기 위한 설계도
class 사람 {
    String 이름;
    int 나이;
    double 키;
    String 취미;
}

class Ex0518_objfunction {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "신짱구";
        p1.gender = "남성";
        p1.isMarried = false;

        p1.introduce();
    }
}

// 객체를 만들기 위한 설계도
class Person {
    int age;
    String name;
    String gender;
    boolean isMarried;

    // 함수
    void introduce() {
        System.out.println("== 자기소개 시작 ==");
        System.out.printf("이름 : %s\n", "신짱구");
        System.out.printf("나이 : %d\n", 20);
        System.out.printf("성별 : %s\n", "남성");
        System.out.printf("결혼여부 : %b\n", false);
        System.out.println("== 자기소개 시작 끝 ==");
    }
}