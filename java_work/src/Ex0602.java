import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Ex0602 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/**
 * 51강 super() 키워드
 * 1. 부모 클래스에 있는 매개변수를 지닌 생성자 메서드를 자식 클래스 내에서 호출하는게 불가능하다.
 * 2. 단 자식 클래스에서 물려 받은 부모 생성자를 사용하려면 자식 클래스에서 생성자 호출 시 super() 키워드를 사용해야 한다.
 * 3. super() 키워드를 사용하면 제공되는 기능
 * - 상위 클래스의 생성자를 호출 할 수 있다.
 * - 상위 클래스의 메서드를 호출 할 수 있다.
 */

/**
 * 51강 예제
 * 매개변수를 가지는 생성자를 자식 클래스에서 실행하려면 super() 키워드를 사용해야 한다.
 * */
class Ex0602_51_01 {
    public static void main(String[] args) {
        new 동물51_01();
        동물51_01 a동물1 = new 동물51_01(20);
        동물51_01 a동물2 = new 동물51_01(20, "콩순이");
        new 사람51_01();
        new 사람51_01();
    }
}

class 동물51_01 {
    int 나이;
    String 이름;

    // 메서드 오버로딩
    동물51_01() {
        System.out.println("동물51_01() 실행됨!!");
    }

    동물51_01(int 나이) {
        System.out.println("동물51_01(int 나이) 실행됨!!!");
    }

    동물51_01(int 나이, String 이름) {
        System.out.println("동물51_01(int 나이, String 이름) 실행됨!!!");
    }

    void 숨쉬다() {
        System.out.println("숨을 쉽니다!!");
    }
}

class 사람51_01 extends 동물51_01 {
    사람51_01() {
        super(20, "콩순이");
        System.out.println("사람51_01 실행됨!!!");
    }

    void 숨쉬다() {
        super.숨쉬다();
    }
}

/**
 * 52강 final 키워드로 변수 상수 처리
 * 변수를 상수 처리하면 좋은점
 * 1. 변수의 상수처리하면 값을 변경할 수 없기 떄문에 코드의 안정성을 높일 수 이싿.
 * 2. 의도하지 않은 값 변경으로 인한 오류를 방지할 수 있다.
 * 3. 상수처리 된 변수는 변수의 의도와 의미를 명확히 할 수 있다.
 *
 * 상수 변수를 사용시 주의사항
 * 1. 상수롤 만든 변수는 값을 변경할 수 없으므로 신중하게 선언해야 한다.
 * 2. 상수 변수 이름은 이해하기 쉬운 이름으로 지정해야 한다.
 * 3. 상수 값을 변경해야하는 경우에는 새로운 상수를 선언하는 것이 좋다.
 * */

class Ex0602_52 {
    public static void main(String[] args) {
        // final은 해당 변수를 상수처리 한다.
        final int a = 10;
        System.out.println(a);

        // a = 20; --> final이 붙은 변수는 값을 수정하는 것이 불가능하다!

        final double pi = 3.14;
    }
}

/**
 * 53강 접근제한자와 getter, setter
 * private: 외부 클래스가 내부 클래스에 접근해서 해당 데이터로 접근해서 사용하는 걸 막는다.
 * public: 외부 클래스가 내부 클ㄹ래스에 접근해서 해당 데이터를 자유롭게 사용 가능하다.
 *
 * getter: 데이터를 가져오는 역할
 * setter: 데이터를 저장하는 역할
 *
 * getter, setter는 public 키워드를 사용해야 한다.
 * */
class Ex0602_53_01 {
    public static void main(String[] args) {
        사람53_01 a사람 = new 사람53_01();
        a사람.setId(10);

        System.out.printf("제 번호는 %d입니다.\n", a사람.getId());
    }
}

class 사람53_01 {
    private int id;

    // getter, setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

/**
 * 54강 Object만을 이용해서 클래스를 통합하면 사용할 때 매번 형변환을 해야하기에 불편하다.
 * - 모든 데이터타입에는 상위타입(Object 타입)이 존재한다.
 * - 모든 클래스는 Object Class를 상속받는다.
 *
 * 제너릭을 이용함
 * */

class Ex0602_54 {
    public static void main(String[] args) {
        저장소<Integer> a저장소1 = new 저장소<>();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a); // 30

        저장소<Double> a저장소2 = new 저장소<>();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b); // 5.5

        저장소<사과> a저장소3 = new 저장소<>();

        a저장소3.setData(new 사과());
        사과 c = a저장소3.getData();

        System.out.println(c);
    }
}

class 저장소<T> {
    private Object data;

    T getData() {
        return (T) data;
    }

    void setData(T inputedData) {
        this.data = inputedData;
    }
}

class 사과 {

}

/**
 * 56강 예외신고의 적극성
 * */

class Ex0602_56_01 {
    public static void main(String[] args) {
        int[] datas = new int[2]; // 0, 1

        try {
            work(datas);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    static void work(int[] datas) {
        datas[0] = 10;
        datas[1] = 20;
        datas[2] = 30; // ArrayIndexOutOfBoundsException() 이 발생한다.
    }
}

/**
 * v2: 사건이 터질것을 예측해서 미리보고(예외직접발생, throw new)
 * */

class Ex0602_56_02 {
    public static void main(String[] args) {
        int[] datas = new int[2]; // 0, 1

        try {
            work(datas);
        } catch (IllegalArgumentException e) {
            // v1 코드보다 원인이 좀 더 명확해진다. 즉 v1  보다 더 가독성 높은 코드이다.
            System.out.println("값을 잘못 입력했어요.");
        }
    }

    static void work(int[] datas) {
        if (datas.length < 3) {
            throw new IllegalArgumentException(); // 함수가 여기서 멈춤
        }

        datas[0] = 10;
        datas[1] = 20;
        datas[2] = 30;
    }
}

/**
 * v3: 명확한 사건보고를 위해 직접 예외 클래스를 생성하여 보고(예외직접발생, throw new)
 * */

class Ex0602_56_03 {
    public static void main(String[] args) {
        int[] datas = new int[2]; // 0, 1

        try {
            work(datas);
        } catch (입력된_배열의_사이즈가_3보다_작은_Exception e) {
            // v2 코드보다 좋음. 단, 예의 클래스를 만들어야해서 번거롭다
            // 실무에서는 예외클래스를 꼭 필요한 경우에만 만든다.
            System.out.println("오류 발생!");
        }
    }

    static void work(int[] datas) {
        if (datas.length < 3) {
            throw new 입력된_배열의_사이즈가_3보다_작은_Exception(); // 함수가 여기서 멈춤
        }

        datas[0] = 10;
        datas[1] = 20;
        datas[2] = 30;
    }
}

class 입력된_배열의_사이즈가_3보다_작은_Exception extends RuntimeException {
}

/**
 * 57강 Scanner를 이용한 표준입력, nextInt, nextLine
 * */

class Ex0602_57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("숫자 입력 : ");
        int inputData = sc.nextInt();
        System.out.printf("입력받은 숫자 : %d\n", inputData);
         */

        System.out.print("문장 입력 : ");
        String inputData = sc.nextLine();
        System.out.printf("입력받은 문장 : %s\n", inputData);

        sc.close();

    }
}

/**
 * 58강
 * 올바른 숫자를 입력할 때까지 반복, nextInt 후에 남은 데이터들을 버퍼에서 지우기
 * */

class Ex0602_58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 표준입력

        int input;

        while (true) { // 무한루프
            System.out.print("숫자 입력: ");

            try {
                input = sc.nextInt();
                // nextInt 후 딱히 다른 이유가 없다면 버퍼를 지워줘야 한다.
                // 왜? 엔터키로 인한 공백이 버퍼에 남아있기 떄문에, 제거해줘야 한다.
                sc.nextLine(); // 버퍼를 지운다.
                break;
            } catch (InputMismatchException e) {
                // 여기서 버퍼를 비우는 코드가 있는 이유
                // 여기로 넘어왔다는 것은 sc.nextInt(); 까지만 실행되었다는 의미이다.
                // 버퍼를 비우지 않은 상태에서 실행 되었기 때문에 무한으로 반복된다.
                sc.nextLine(); // 그래서 여기서 버퍼를 비워줘야만 밑에 코드가 실행된다.
                System.out.println("숫자를 제대로 입력해주세요.");
            }
        }

        System.out.printf("입력받은 숫자: %d\n", input);

        sc.close();
    }
}

/**
 * 59강 - 백준 #1000
 * @brief 두 정수 A와 B를 입력받은 다음 A+B출력
 * @details 0 < A, B < 10
 * @return 첫째줄에 A+B 출력
 * */

class Ex0602_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
//        sc.nextLine();
        int B = sc.nextInt();
//        sc.nextLine();

        sc.close();

        System.out.printf("%d", A+B);
    }
}

/**
 * 60강 - 백준 #11382 꼬마 정민
 * @brief 세 정수 A, B, C를 입력받은 다음 A+B+C 출력
 * @details A, B, C (1 <= A, B, C <= 10^12)이 공백을 사이에 두고 주어진다.
 * @return A+B+C의 값을 출력한다.
 * */

class Ex0602_60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
//        sc.nextLine();
        long B = sc.nextLong();
//        sc.nextLine();
        long C = sc.nextLong();
        sc.nextLine();
        sc.close();

        System.out.printf("%d", A+B+C);
    }
}