# Sparta_Calculator
스파르타코딩 내일배움캠프 - 계산기 프로젝트

## 프로젝트 소개
Java 문법을 사용하여 간단한 사칙연산을 할 수 있는 계산기를 구현합니다.

## 개발 환경
- `Java`
- `Oracle OpenJDK 17.0.5`

## 주요 기능
#### 공통 기능
- 숫자 2개, 사칙연산 1개를 입력하면 계산 결과를 출력합니다.
- 아무 문자를 입력하여 계산기를 계속 진행하고, "exit"를 입력하면 계산기를 종료합니다.
--------------------
#### CalculatorStep1 계산기
**클래스 없이 기본적인 연산을 수행할 수 있는 계산기**

- CalculatorStep1/App.java - 계산기 기능이 구현된 메인 클래스

1. Scanner를 사용하여 양의 정수(0 포함)를 입력
2. 사칙연산 기호(+,-,x,/)를 입력
3. 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력
4. ***반복문(switch)*** 을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 구현

>추가구현
>
>5. ***조건문(if)*** 을 사용하여 입출력 에러 처리

--------------------
#### CalculatorStep2 계산기
**클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기**
- CalculatorStep2/App.java - 계산기 입출력을 제어하는 메인 클래스
- CalculatorStep2/Calculator.java - 계산기 기능을 수행하는 클래스

1. 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator ***클래스***를 생성
2. 사칙연산을 수행 후, 결과값 반환 메서드 구현
3. App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화 - Getter, Setter 추가)
4. ***컬렉션***을 이용하여 Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정

>추가구현
>
>5. ***try-catch절***을 사용하여 입출력 에러 처리
--------------------
#### CalculatorStep3 계산기
**num, 제네릭, 람다 & 스트림을 이해한 계산기 만들기**
- CalculatorStep3/App.java - 계산기 입출력을 제어하는 메인 클래스
- CalculatorStep3/ArithmeticCalculator.java - 입력받은 숫자 확인 및 계산을 실행하는 제네릭 클래스
- CalculatorStep3/OperatorType.java - 입력받은 사칙연산 확인 및 계산을 수행하는 사칙연산 열거형 상수 enum 클래스

1. CalculatorStep2 계산기 기능을 기본 모델로 사용
2. ***Enum*** 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기 ArithmeticCalculator 클래스에 활용
3. ***제네릭***을 사용하여 실수, 즉 double 타입의 값을 전달 받아도 연산이 수행하도록 만들기

>구현 못 한 요구사항
>- ***람다, 스트림***을 사용하여 저장된 연산 결과들 중 Scanner로 입력받은 값보다 큰 결과값 들을 출력


## 실행 화면
#### CalculatorStep1 계산기
>CalculatorStep1 -> App.java 파일 실행

![image](https://github.com/user-attachments/assets/78c57616-b8ba-481b-a593-b6c7bfccc5de)

올바른 정수를 입력하지 않았을 때

![image](https://github.com/user-attachments/assets/1c8a46d7-4dc2-405e-97c9-53c39e1bca5c)

올바른 사칙연산을 입력하지 않았을 때

![image](https://github.com/user-attachments/assets/c1a31a46-2309-4963-bc31-e1be85b22639)

올바른 정수, 올바른 사칙연산을 입력했을 때

![image](https://github.com/user-attachments/assets/d4d10758-9745-4958-bc41-808ac932b5b9)

0으로 나눗셈 시도할 때 & 계산기 종료

--------------------
#### CalculatorStep2 계산기
>CalculatorStep2 -> App.java 파일 실행

![image](https://github.com/user-attachments/assets/8cb6aa53-7c0e-40eb-af38-0d5cbda8290c)

올바른 정수를 입력하지 않았을 때

![image](https://github.com/user-attachments/assets/97aae1d8-ad81-4f50-90b6-9a1a7f22106e)

올바른 사칙연산을 입력하지 않았을 때

![image](https://github.com/user-attachments/assets/f8618ff0-df73-4d1e-8db6-c7fc689fa06e)

올바른 정수, 올바른 사칙연산을 입력했을 때

![image](https://github.com/user-attachments/assets/fdb6464a-fd61-45a9-b207-6a0f0f6c82d1)

0으로 나눗셈 시도할 때

![image](https://github.com/user-attachments/assets/f22763bc-0e9f-4367-b0ea-b05e5323d434)

계산기 종료

--------------------
#### CalculatorStep3 계산기
>CalculatorStep3 -> App.java 파일 실행

![image](https://github.com/user-attachments/assets/a5803d56-16d2-4c40-b0e5-177da7dca045)

올바른 정수를 입력하지 않았을 때

![image](https://github.com/user-attachments/assets/3eba013e-140f-4c84-b94b-38337f63fbf2)

올바른 사칙연산을 입력하지 않았을 때

![image](https://github.com/user-attachments/assets/5be57f80-ef2c-46fa-89d6-4a2ea1837a12)

올바른 정수, 올바른 사칙연산을 입력했을 때

![image](https://github.com/user-attachments/assets/d5058df6-b9d0-48bc-b5f8-ad1f992e115a)

0으로 나눗셈 시도할 때

![image](https://github.com/user-attachments/assets/740bbda5-a87c-44b2-95f7-105f121be734)

계산기 종료
