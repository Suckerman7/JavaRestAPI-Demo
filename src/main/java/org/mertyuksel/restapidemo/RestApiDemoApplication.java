package org.mertyuksel.restapidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Autowired Environment env;

@Bean
public DataSource dataSource() {
    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(env.getProperty("driverClassName"));
    dataSource.setUrl(env.getProperty("url"));
    dataSource.setUsername(env.getProperty("user"));
    dataSource.setPassword(env.getProperty("password"));
    return dataSource;
}

@SpringBootApplication
public class RestApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiDemoApplication.class, args);
	}

}
