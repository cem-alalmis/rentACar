package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")  // iletişim kurma yönetemi Mapping
public class BrandsController { //API isimlendirmelerinde çoğul kullanılır
    private BrandService brandService;

@Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;

    }

    @GetMapping("/getall")
    public List<Brand> getAll(){
        return brandService.getAll();
    }
}
