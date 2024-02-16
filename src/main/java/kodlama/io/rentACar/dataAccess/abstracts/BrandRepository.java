package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BrandRepository extends JpaRepository<Brand, Integer> {

    // Array kullandığımızda; array'in boyutunu büyütmeye çalıştığımızda, sıfırlamamaız, yedek almamız, aktarmamız
    // gerekiyordu. Bu yüzden arraylerden çok yararlanmayız. Onun yerine Listelerden (koleksiyonlardan) yararlanıyoruz.


}
