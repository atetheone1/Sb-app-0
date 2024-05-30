package tech.atetheone.Sb_app_0;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SbApp0Application {
	private static final Logger logger = LoggerFactory.getLogger(SbApp0Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SbApp0Application.class, args);
		logger.info("Spring app started. Go to http://localhost:8080/disc_student_name");
	}

	@RestController
	@RequestMapping("/disc_student_name")
	public class SbApp0Controller {
		@Value("${fullname:Até Tougué Aristide}")
		private String fullname;

		@GetMapping
		public String getFullname() {
			return "Work done by " + this.fullname + "!";
		}
	}
}
