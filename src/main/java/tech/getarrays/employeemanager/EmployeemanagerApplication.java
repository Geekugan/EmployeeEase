package tech.getarrays.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeemanagerApplication.class, args);
	}

}
