package projectLeasing.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import projectLeasing.business.entity.concrete.Brand;


public interface BrandRepository extends JpaRepository<Brand, Integer> {

    //List<Brand> getAll();
}
