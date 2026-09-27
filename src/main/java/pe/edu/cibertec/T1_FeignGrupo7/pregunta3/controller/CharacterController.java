package pe.edu.cibertec.T1_FeignGrupo7.pregunta3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.rickmorty.model.CharacterRM;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.service.CharacterService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/characters")
@RestController
public class CharacterController {
    private final CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<CharacterRM>> getAliveHumanCharacters() {
        return ResponseEntity.ok(characterService.getAliveHumanCharacters());
    }
}
