package pe.edu.cibertec.T1_FeignGrupo7.pregunta3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.rickmorty.iclient.CharacterClient;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.rickmorty.model.CharacterRM;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CharacterService {
    private final CharacterClient characterClient;

    public List<CharacterRM> getAliveHumanCharacters() {
        CharacterRM.CharacterPage page = characterClient.getCharacters();

        if (page == null || page.getResults() == null) {
            return List.of();
        }

        return page.getResults().stream()
                .filter(Objects::nonNull)
                .filter(character -> "Alive".equalsIgnoreCase(character.getStatus()))
                .filter(character -> "Human".equalsIgnoreCase(character.getSpecies()))
                .collect(Collectors.toList());
    }
}
