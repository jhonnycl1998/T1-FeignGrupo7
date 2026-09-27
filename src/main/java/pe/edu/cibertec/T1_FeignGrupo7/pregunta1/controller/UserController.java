package pe.edu.cibertec.T1_FeignGrupo7.pregunta1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta1.restclient.placeholder.model.UserPlaceHolder;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta1.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RestController
public class UserController {
    private final UserService userService;

    //localhost:8080/api/v1/users
    @GetMapping
    public ResponseEntity<List<UserPlaceHolder>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

}
