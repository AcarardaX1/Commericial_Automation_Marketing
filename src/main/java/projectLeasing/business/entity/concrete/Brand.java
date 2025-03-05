package projectLeasing.business.entity.concrete;

import jakarta.persistence.*;
import lombok.*;

//import javax.persistence.Table;

@Entity
@Table(name="brands_make")
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    private String companyFeature;
//
//    public Brand() {
//        super();
//    }
//
//    public Brand(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



