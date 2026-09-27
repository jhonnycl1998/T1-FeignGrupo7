package pe.edu.cibertec.T1_FeignGrupo7.pregunta2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta2.restclient.fakestore.iclient.ProductClient;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta2.restclient.fakestore.model.ProductStoreDto;

@Service
public class ProductService {

    @Autowired
    public ProductClient productClient;

    public List<ProductStoreDto> obtenerProductos() {
        return productClient.getProducts().stream()
                .filter(p -> p.price > 50.0 && p.category.equals("electronics"))
                .collect(Collectors.toList());
    }
}
