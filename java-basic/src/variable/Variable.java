package variable;

public class Variable {

    public static void main(String[] args) {

//        변수 선언, 초기화를 따로 하고 있다.
        int a;
        a = 10;
        System.out.println(a);
//        변수 값을 변경 해주고 있다.
        a = 20;
        System.out.println(a);
//        변수 선언과 초기화를 동시에 하고 있다.
        int b = 30;
        System.out.println(b);
//        여러개를 한번에도 가능하다.
        int c = 40, d = 50;
        System.out.println(c);
        System.out.println(d);

//        변수 type -> 이렇게 개발자가 직접 적은 값과 같은 고정된 값을 리터널이라고 한다.
        int e = 60;
        double f = 3.14;
        boolean flag = true;
        char h = 'A';
        String g = "Hello";
        System.out.println(e);
        System.out.println(f);
        System.out.println(flag);
        System.out.println(h);
        System.out.println(g);
    }
}
