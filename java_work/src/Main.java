import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        int age = 20;
        int age_grade = -1;

        if (age < 10) {
            age_grade = 0;
        }

        if (age >= 10 && age < 20) {
            age_grade = 10;
        }

        if (age >= 20 && age < 30) {
            age_grade = 20;
        }

        if (age >= 30 && age < 40) {
            age_grade = 30;
        }

        if (age >= 40 && age < 50) {
            age_grade = 40;
        }

        if (age_grade == -1) {
            System.out.println("50대 이상입니다.");
        } else if (age_grade == 0) {
            System.out.println("10세 미만 아동입니다.");
        } else {
            System.out.println(age_grade + "대 입니다.");
        }
    }
}

class workTF {
    public static void main(String[] args) {
        if (true) {
            System.out.println("참");
        } else if (false) {
            System.out.println("거짓");
        }

        int a = 10;

        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참");
        }

        if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
            System.out.println("참");
        }

        if (10 != 10 || 10 < 2) {
            System.out.println("거짓");
        }

    }
}

// 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.

class Main2 {
    public static void main(String[] args) {
        if (true) {
            System.out.println("참1");
        }

        if (false) {
            System.out.println("거짓1");
        }

        int a = 10;

        // `==` => 같다.
        if (a == 10) {
            System.out.println("참2");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓2");
        }

        if (a > 10) {
            System.out.println("거짓3");
        }

        if (a >= 10) {
            System.out.println("참3");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참4");
        }

        // boolean c => c 에는 오직 true/false 만 담을 수 있다.
        boolean c = a != b;

        if (c) {
            System.out.println("거짓4");
        }

        if (c == false) {
            System.out.println("참5");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참6");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓5");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참7");
        }

        if (20 > 2 && 10 > 3 && true != false && 10 != 10) {
            System.out.println("거짓6");
        }

        if (10 != 10 || 10 < 2) {
            System.out.println("거짓7");
        }
    }
}


// 두 정수의 크기를 비교하여 왼쪽 수가 크면 left 를 출력, 오른쪽 수가 크면 right 를 출력, 같으면 equal 을 출력해주세요.

class Main3 {
    public static void main(String[] args) {
        int left = 30;
        int right = 30;

        if (left == right) {
            System.out.println("equal");
        } else if (left > right) {
            System.out.println("left");
        } else if (left < right) {
            System.out.println("right");
        }
    }
}

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다.
// 조건 : 4가지 이상의 방법으로 풀어야 합니다.
// 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.

class Main4 {
    public static void main(String[] args) {
        int age = 28; // 이 값을 바꿔가면서 실행해보세요.


        System.out.println("당신의 나이는 " + age + "살 입니다.");

        // 구현시작

        if (age <= 19) {
            System.out.println("할인대상입니다.");
        } else if (age >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }
        // 출력 => 할인대상입니다. 또는 할인 대상이 아닙니다.
    }
}

class Main_switch {
    public static void main(String[] args) {
        // switch
        int month = 5;
        String season = "";

        switch (month) {
            case 1:
            case 2:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
            default:
                season = "겨울";
                break;
        }

        System.out.println(season); // 6월
    }
}

class Main_newSwitch {
    public static void main(String[] args) {

        int month = 5;

        String season = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "겨울";
        };

        System.out.println("현재 계절은 " + season + "입니다.");

        System.out.println(switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "겨울";
        });

        String season2 = switch (month) {
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> {
                String a = "여름";
                String rs = month + "월";
                yield rs; // yield는 중괄호 안쪽에서 실행 된 결과를 의미
            } // 중괄호 안쪽에 코드가 한줄이면 중괄호 생략 가능(yield 생략 가능)
            case 9, 10, 11 -> "가을";
            default -> "겨울";
        };

        System.out.println(season2);
    }
}

// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
// 반복문 사용금지

class MainGugudan {
    public static void main(String[] args) {
        int dan = 8;

        for (int i = 1; i <= 1000; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    ...
    8 * 1000
    */
    }
}

class MainPrintInteger {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class MainPrintminusInteger {
    public static void main(String[] args) {
        for (int i = -100; i <= 25; i++) {
            System.out.println(i);
        }
    }
}

class Main0512hw1 {
    public static void main(String[] args) {
        int dan = 8;
        for (int i = 1000; i > 0; i--) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}

class Main0512hw2 {
    public static void main(String[] args) {
        int dan = 8;
        for (int i = 1000; i >= -500; i--) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}

class Main0512hw3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

class Main0512hw4 {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println(j);
//            }
//        }

        int i = 0;
        while (i < 10) {
            int j = 1;
            while (j <= 3) {
                System.out.println(j);
                j++;
            }
            i++;
        }
    }
}