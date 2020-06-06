package net.miiingle.qa.automation.web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@SpringBootApplication
class QaAutomationWebApplication {

	static void main(String[] args) {
		SpringApplication.run(QaAutomationWebApplication, args)
	}

	@Configuration
	static class WebConfig implements WebMvcConfigurer {

		@Override
		void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**").addResourceLocations("classpath:/static/")
		}
	}

}
