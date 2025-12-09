plugins {
	java
	id("org.springframework.boot") version "4.0.0"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com"
version = "0.0.1-SNAPSHOT"
description = "RestAPI(study)"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
    // Validation
    implementation("org.springframework.boot:spring-boot-starter-validation")
    // Web
    implementation("org.springframework.boot:spring-boot-starter-web")
    // JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // OpenAPI / Swagger
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:3.0.0")

    // DB - H2
    runtimeOnly("com.h2database:h2")
    runtimeOnly("org.springframework.boot:spring-boot-h2console")

    // Test
    // ✅ Web MVC 테스트용 (Spring Boot 4에서 분리됨)
    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")



    // Devtools
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    //lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")


}

tasks.withType<Test> {
	useJUnitPlatform()
}
