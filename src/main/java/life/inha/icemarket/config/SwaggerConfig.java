package life.inha.icemarket.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi(){
        return GroupedOpenApi.builder()
                .group("life.inha")
                .pathsToMatch("/api/**")
                .build();
    }

    @Bean
    public OpenAPI SpringShopOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("정통마켓 API")
                .description("정통마켓 프로젝트 API 명세서입니다.")
                        .version("v0.0.1"));
    }
}
