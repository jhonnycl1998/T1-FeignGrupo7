package pe.edu.cibertec.T1_FeignGrupo7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class T1FeignGrupo7Application {
    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo7Application.class, args);
    }
}
