package pe.edu.cibertec.T1_FeignGrupo7.pregunta1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta1.restclient.placeholder.iclient.UserClient;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta1.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserClient userClient;

    public List<UserPlaceHolder> getUsers() {
        return userClient.getUsersPlaceHolder().stream().filter(user -> user.getId() % 2 != 0)
                .collect(Collectors.toList());
    }
}
