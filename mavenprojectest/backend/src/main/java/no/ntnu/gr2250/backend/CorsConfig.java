package no.ntnu.gr2250.backend;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

// from origin 'https://3000-sondrp-gitpodtesting-5cobtnvpwe0.ws-eu73.gitpod.io' has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource.
    // https://sondrp-gitpodtesting-5cobtnvpwe0.ws-eu73.gitpod.io/

	@Bean
	public FilterRegistrationBean corsFilter() {

        String workspaceUrl = System.getenv("GITPOD_WORKSPACE_URL");
        String origin = workspaceUrl.substring(0, 8) + "3000-" + workspaceUrl.substring(8);


		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin(origin);
		config.addAllowedOrigin("http://localhost:3000/");
		config.addAllowedOrigin("http://localhost:8080/");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
        //config.setAllowedOriginPatterns(Arrays.asList("https://*"));
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}
}