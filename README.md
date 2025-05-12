# 🎟️ Ticketlink

**Ticketlink**는 다양한 공연 및 이벤트의 티켓을 검색하고 예약할 수 있는 웹 애플리케이션입니다.  
Spring Boot 기반으로 개발되었으며, 관리자 기능과 사용자 기능을 모두 포함하고 있습니다.

---

## 📌 프로젝트 개요

- **프로젝트명**: ticketlink
- **목적**: 공연/이벤트 티켓 검색 및 예약 플랫폼 제공
- **주요 기능**:
  - 공연/이벤트 목록 조회
  - 티켓 예약 및 결제
  - 사용자 회원가입 및 로그인
  - 관리자 페이지를 통한 공연 등록 및 관리

---

## 🛠️ 기술 스택

| 영역       | 사용 기술                        |
|------------|----------------------------------|
| Backend    | Java 17, Spring Boot             |
| Frontend   | Thymeleaf, HTML/CSS/JS           |
| Database   | MySQL                            |
| ORM        | Spring Data JPA (Hibernate)      |
| Build Tool | Gradle                           |
| Versioning | Git, GitHub                      |

---

## 📁 프로젝트 구조
```
ticketlink/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ticketlink/
│   │   │       ├── controller/      # 웹 컨트롤러
│   │   │       ├── domain/          # 엔티티 및 도메인 모델
│   │   │       ├── repository/      # JPA 레포지토리
│   │   │       └── service/         # 서비스 로직
│   │   └── resources/
│   │       ├── static/              # 정적 리소스 (CSS, JS 등)
│   │       ├── templates/           # Thymeleaf 템플릿
│   │       └── application.properties
├── build.gradle
└── README.md
```
---

## 🚀 시작하기

### 1. 프로젝트 클론

```bash
git clone https://github.com/seunggulee1007/ticketlink.git
cd ticketlink

### 2. DB 설정
src/main/resources/application.properties 파일에서 본인의 MySQL 환경에 맞게 설정을 변경하세요:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ticketlink
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. 애플리케이션 실행
```bash
./gradlew bootRun
```

## 📸 주요 화면 (추가 예정)
-	로그인 / 회원가입
-	이벤트 목록 및 상세
-	티켓 예약 페이지
-	관리자용 공연 등록 화면

## 🤝 기여 방법
1.	이슈를 확인하거나 새로 생성하세요.
2.	포크 및 브랜치를 만든 후 기능을 개발하세요.
3.	Pull Request를 통해 기여 내용을 제출해주세요.

##📄 라이선스
이 프로젝트는 MIT License를 따릅니다.
