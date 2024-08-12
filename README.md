# JAVA-Class
Java 강의 자료 입니다.



## Java 표준 스펙

> - 모든 자바 구현들은 표준 스펙에 맞게 개발되어 있어, 어떠한 걸 사용하더라도 동일하게 사용 되어진다.
> - JDK를 다른 회사로 변경 하더라도 문제 없이 작동한다.
> - Javac, JVM, JRE 등등이 표준 스펙에 맞게 개발되어 있다.

## Java 동작 과정

> 1. Hello.java 파일을 작성한다.
> 2. javac Hello.java 명령어를 통해 Hello.class 파일을 생성한다.
> 3. 자바 소스 코드를 바이트코드로 변환하며 자바 가상 머신에서 더 빠르게 실행될 수 있게 최적화하고 문법 오
     류도 검출한다.
> 4. jvm을 통해 Hello.class 파일을 실행한다.
> - 추가 정보
>> 1. JVM은 main 메소드를 찾아서 실행한다. 
>> 2. main 메소드는 프로그램의 로직을 구현하고, 다른 클래스나 메서드를 호출할 수 있다. 
>> 3. main 메소드는 프로그램이 종료될 때까지 실행된다.


## Java의 Main 메소드
> - Java의 Main 메소드는 반드시 public static void main(String[] args) 이어야 한다.
> - public : 접근 제어자, static : 정적 메소드, void : 리턴 타입, main : 메소드 이름
> - main 메소드는 표준 진입점이다.
> - String[] args는 자바 프로그램을 실행 할 때 특정 값들을 전달 할 수 있는 매개변수이다.