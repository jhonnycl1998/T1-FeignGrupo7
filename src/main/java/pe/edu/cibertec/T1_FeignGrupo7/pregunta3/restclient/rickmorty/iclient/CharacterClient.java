package pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.rickmorty.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.config.RickMortyFeignConfig;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta3.restclient.rickmorty.model.CharacterRM;

@FeignClient(name = "characterClient",
        url = "https://rickandmortyapi.com",
        configuration = RickMortyFeignConfig.class)
public interface CharacterClient {

    @GetMapping("/api/character")
    CharacterRM.CharacterPage getCharacters();
}
