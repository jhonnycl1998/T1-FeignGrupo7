package pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.errorhandler.CustomErrorDecoder;

@Configuration
public class RickMortyFeignConfig {
    @Bean(name = "rickMortyErrorDecoder")
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}
