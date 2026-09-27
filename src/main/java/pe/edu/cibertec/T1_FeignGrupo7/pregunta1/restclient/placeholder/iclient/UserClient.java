package pe.edu.cibertec.T1_FeignGrupo7.pregunta1.restclient.placeholder.iclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta1.restclient.config.FeignConfig;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta1.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;

@FeignClient(name = "userClient",
        url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)
public interface UserClient {
    @GetMapping("/users")
    List<UserPlaceHolder> getUsersPlaceHolder();
}
