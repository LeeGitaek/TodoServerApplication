package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoServerApplication.class, args);
    }
}

// 레이어를 구분하여 각 레이어의 책임에 맞게 구현
// model , repository, service, controller, testCode
// controller 는 서버가 요청을 받아서 어떤 응답을 보내줄지 정해주는 곳