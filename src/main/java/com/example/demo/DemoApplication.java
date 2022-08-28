
package com.example.demo;
import com.example.demo.controllers.CurrencyParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		String urlGif = "";
		try {
			urlGif = CurrencyParser.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "<div style='width: 500px; margin: auto; margin-top: 150px;'><img src='"+urlGif+"'></div>";
	}

}
