package pe.edu.cibertec.T1_FeignGrupo7.pregunta2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta2.restclient.fakestore.model.ProductStoreDto;
import pe.edu.cibertec.T1_FeignGrupo7.pregunta2.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/products-filtrados")
    public List<ProductStoreDto> obtener() {
        return productService.obtenerProductos();
    }
}
