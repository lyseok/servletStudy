# Servlet Study Project

## ✨ 개요

이 프로젝트는 **Servlet을 활용하여 웹 애플리케이션 개발을 연습**하는 데 중점을 둡니다. **JSP와 함께 서블릿을 사용하여 요청 및 응답을 처리**하며, `web.xml`을 활용한 서블릿 매핑과 **애너테이션 기반 서블릿 등록**을 실습합니다.

## ✨ 사용 기술

- **Java (JDK 11 이상)**: 서블릿 기반 웹 개발
- **Jakarta Servlet (Servlet API 6.0)**: 요청 및 응답 처리
- **JSP(JavaServer Pages)**: 동적 웹 페이지 렌더링
- **HTTP 프로토콜 처리**: GET, POST 요청 응답 관리
- **웹 애플리케이션 배포 설정**: `web.xml` 설정
- **애너테이션 기반 서블릿 등록**: `@WebServlet` 활용

## ✨ 프로젝트 구조

```
src/
├── basic/
│   ├── ServletTest01.java  // web.xml을 통한 서블릿 등록
│   ├── ServletTest02.java  // @WebServlet 애너테이션을 활용한 서블릿 등록
│   ├── ServletTest03.java  // init(), service(), doGet(), doPost(), destroy() 메서드 테스트
│   ├── ServletTest04.java  // ServletContext 활용
│
├── basic/reqNresp/
│   ├── RequestTest01.java  // request 객체를 활용한 파라미터 처리
│   ├── RequestTest02.java  // request 객체를 활용한 사칙연산 계산기 서블릿
│
webapp/
├── requestTest01.jsp       // 클라이언트 요청을 서블릿으로 전달
├── requestTest02.jsp       // 입력된 데이터로 계산 수행 후 결과 반환
├── callServletTest.jsp     // 서블릿을 호출하여 실행
│
WEB-INF/
├── web.xml                 // 서블릿 매핑 및 웹 애플리케이션 설정
```

## ✨ 주요 기능

1. **서블릿 등록 및 실행**
    - `web.xml`을 활용한 서블릿 등록 (`ServletTest01`)
    - `@WebServlet` 애너테이션을 사용한 서블릿 등록 (`ServletTest02`)
2. **HTTP 요청 및 응답 처리**
    - `doGet()`, `doPost()`를 이용한 클라이언트 요청 처리
    - `service()` 메서드를 통해 요청 방식을 구분하여 처리 (`ServletTest03`)
    - `ServletContext` 활용하여 웹 서버 및 환경 정보 조회 (`ServletTest04`)
3. **Request 객체 활용**
    - `RequestTest01`: 요청된 파라미터 값 출력 및 요청 정보 조회
    - `RequestTest02`: 사용자의 입력을 받아 사칙연산을 수행하는 서블릿
4. **JSP와 서블릿 연동**
    - JSP에서 클라이언트 입력을 받아 서블릿으로 전달 (`requestTest01.jsp`, `requestTest02.jsp`)
    - JSP에서 서블릿 실행 결과를 받아서 웹 페이지에 출력 (`callServletTest.jsp`)

## ✨ 실행 방법

1. **Tomcat 서버 설정**
    - `web.xml`에서 설정한 URL 매핑을 확인 (`/servletTest01.do`, `/servletTest02.do` 등)
    - `@WebServlet` 애너테이션으로 설정한 URL 패턴 확인
    - `index.jsp` 또는 `requestTest01.jsp`를 통해 서블릿 호출 가능
2. **프로젝트 빌드 및 실행**
    - **Eclipse, IntelliJ** 등의 IDE에서 `Tomcat` 또는 `Jetty` 설정 후 실행
    - 또는 `maven`을 사용하여 실행 가능
3. **테스트 URL 예시**
    - 기본 서블릿 호출: `http://localhost:8080/webTest/servletTest01.do`
    - 애너테이션 서블릿 호출: `http://localhost:8080/webTest/servletTest02.do`
    - Request 연습: `http://localhost:8080/webTest/requestTest01.jsp`
    - 계산기 기능: `http://localhost:8080/webTest/requestTest02.jsp`
