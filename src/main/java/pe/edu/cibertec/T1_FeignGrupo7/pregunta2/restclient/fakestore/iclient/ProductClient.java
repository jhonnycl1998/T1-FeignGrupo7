package pe.edu.cibertec.T1_FeignGrupo7.pregunta2.restclient.fakestore.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta2.restclient.fakestore.model.ProductStoreDto;

@FeignClient(name = "productClient", url = "https://fakestoreapi.com")
public interface ProductClient {
    @GetMapping("/products")
    List<ProductStoreDto> getProducts();
}
