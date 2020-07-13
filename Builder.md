# Builder
객체의 생성 방법과 표현 방법을 분리하기 위하여 사용하는 패턴

`GoF-Design-Pattern`과 `Effective Java`의 빌더 패턴은 서로 설명이 다르다.<br/> ~~그래서 꽤 오래 삽질 하였다~~

`Effective Java`와 `GoF-Design-Pattern`은 서로 `Builder Pattern`을 바라보는 관점이 다르고 `Effective Java`는 실제 코드를 작성할 때 위주로 설명하였기 때문에 다른 것 같다.

## Effective Java에서의 Builder
Builder 패턴을 사용하는 바탕은 다음과 같다
- 많은 생성자 인자
- 그로인한 많은 오버로딩

### 순서
- 점층적 생성자 (Telescoping Constructor Pattern)
- 자바빈 (Java bean)
- 빌더 패턴 (Builder Pattern)
- 빌더 인터페이스 (Builder Interface)

### Telescoping Constructor Pattern
`점층적 생성자`는 우리가 흔히 사용하는 `생성자 오버로딩`을 이용한 방법이다. 
```Java
class User {
    private String name;
    private String id;
    private String password;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    ...
}
```

이 `점층적 생성자`는 다음과 같은 문제점이 발생한다.
- 나쁜 코드 가독성
- 생성자가 많아, 인자가 추가되면 코드를 수정하기 힘듬

### Java bean
자바빈은 자바에서 많이 사용하는 생성 방법이다. Setter를 여러 생성자 대신 사용한다

```Java
class User {
    private String name;
    private String id;
    private String password;

    public setName(String name) {
        this.name = name;
    }

    public setId(String id) {
        this.id = id;
    }
    
    ...
}
```
하지만 `자바빈`도 다음과 같은 문제가 발생한다.
- 객체 일관성이 깨짐 : 1회의 함수 호출로 객체 생성을 끝낼 수 없음 
- immutable class 생성 불가 : Unthread safe

### Builder Pattern
혹시 이러한 코드를 본적이 있다면 `Builder Pattern`을 이용한 코드를 사용한 것이다.
```java
User.Builder("1")
    .id("UserName")
    .password("P@ssword")
```

빌더 패턴은 생성 부분과 표현부분을 분리하며 `. 체이닝` 또한 가능하다 .

다음은 빌더 패턴을 이용한 예시이다.

```java
public class User {
    private String name;
    private String id;
    private String password;

    public static class Builder {
        private String name;
        private String id = "None";
        private String password = "None";

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String id) {
            this.id = id;
            return this
        }

        public Builder password(String password) {
            this.password = password;
            return this
        }

        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        name = builder.name;
        id = builder.id;
        password = builder.password;
    }
}
```
위와 같이 코드를 짜면 다음과 같이 객체 생성이 가능하다
```java
User.Builder builder = new User.Builder("이름");
builder.id("id");
User user = builder.build()
```
```java
User user = new User
    .Builder("이름")
    .id("Id")
    .password("P@ssword")
    .build();
```

### Lombok @Builder
Lombok의 @Builder 어노테이션을 사용하면 조금 더 쉽게 빌더를 생성할 수 있다.
```java
@builder
public class User {
    private final id;
}

User user = User.builder();
user.id("Id");
```

### 빌더 인터페이스
빌더 인터페이스는 유연한 객체 생성을 위하여 사용된다.<br/>
이 때 추상 팩토리를 사용하여 만든다.

```java
public interface Builder<T> {
    public T build()
}
```
## GoF
복합한 객체를 생성하는 방법과 표현하는 방법을 정의하는 클래스를 별도로 분리하여 서로 다른 표현이라도 이를 생성할 수 있는 동일한 구축 공정을 제공할 수 있도록 한다.

- Builder : 부품 만듬
- ConcerteBuilder : 실제 부품 만드는 곳
- Director : Builder가 만든 부품 조합하여 제품생성
- Product : Dircector가 만들 제품

```java
Builder builder = new UserBuilder("Id", "pw");
Director director = new Director(builder);
Product user = director.build();
```