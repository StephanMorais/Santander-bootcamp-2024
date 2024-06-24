package me.dio.santander_dev_week_2024;
import jakarta.*;
import org.springframework.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@OpenAPIDefinition(servers= {@Service(url="/", description="Default Server URL")})
@SpringApplication
public class Application{
	
	public static void main (String[]args) {
		SpringApplication.run(Application.class, args);
	} 
}

