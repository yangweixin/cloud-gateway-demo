package top.oyoung.cloudgatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CloudGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGatewayDemoApplication.class, args);
	}
}
