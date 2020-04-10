package com.pw;

import com.pw.box.Box;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBoxApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyBoxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Box box = new Box();
        box.initBox();
    }
}
