package czskola.swiapp1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Aplikuje se na všechny endpointy, které začínají na "/api/"
        registry.addMapping("/api/**")
                // Povolí přístup pouze z tvého lokálního Reactu (Vite)
                .allowedOrigins("http://localhost:5173")
                // Povolí základní HTTP metody (dobré specifikovat pro plnohodnotné REST API)
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                // Povolí odesílat jakékoliv hlavičky v requestu
                .allowedHeaders("*")
                // Povolí posílání cookies/autentizačních údajů (hodí se do budoucna pro login)
                .allowCredentials(true);
    }
}