package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;

@Table(name="brands")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
}


/* BRAND class'ında nesne oluşturmak için yapılması gerekenler
* 1- Önce parametresiz constructer oluştur (değişkenlerin hiçbirini seçme boş oluşacak)
* 2- Sonra parametreli constructer oluştur (değişkenlerin hepsini seç)
* 3- Getter ve setter oluştur (tüm parametleri seç)
* */