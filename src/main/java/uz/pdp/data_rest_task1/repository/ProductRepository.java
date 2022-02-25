package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Product;
import uz.pdp.data_rest_task1.projection.ProductInter;


@RepositoryRestResource(path = "product",excerptProjection = ProductInter.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
