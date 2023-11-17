package fia.ues.edu.sv.sic.control.costos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestorControlCostosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorControlCostosApplication.class, args);
	}

	// @Bean
	// public CorsConfigurationSource corsConfigurationSource() {
	// 	final CorsConfiguration configuration = new CorsConfiguration();
	// 	String[] origins = { "*" };
	// 	String[] methods = { "HEAD", "GET", "POST", "PUT", "DELETE", "PATCH" };
	// 	String[] headers = { "Authorization", "Cache-Control", "Content-Type" };
	// 	configuration.setAllowedOrigins(Arrays.asList(origins));
	// 	configuration.setAllowedOriginPatterns(Arrays.asList(origins));
	// 	// configuration.setAllowedOrigins(Arrays.asList("https://gururecharge.com","http://localhost:4200"));
	// 	configuration.setAllowedMethods(Arrays.asList(methods));
	// 	// setAllowCredentials(true) is important, otherwise:
	// 	// The value of the 'Access-Control-Allow-Origin' header in the response must
	// 	// not be the wildcard '*' when the request's credentials mode is 'include'.
	// 	configuration.setAllowCredentials(true);
	// 	// setAllowedHeaders is important! Without it, OPTIONS preflight request
	// 	// will fail with 403 Invalid CORS request
	// 	configuration.setAllowedHeaders(Arrays.asList(headers));
	// 	final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	// 	source.registerCorsConfiguration("/**", configuration);
	// 	return source;
	// }
}
