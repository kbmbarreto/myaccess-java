package br.com.lambdateam.myaccessjava;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.TimeZone;

@SpringBootApplication
@ServletComponentScan
public class MyaccessJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyaccessJavaApplication.class, args);
	}

	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC -3:00"));
	}

}