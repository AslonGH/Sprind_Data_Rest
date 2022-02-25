package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.InputProduct;
import uz.pdp.data_rest_task1.projection.InputProductInter;


@RepositoryRestResource(path = "inputProduct",excerptProjection = InputProductInter.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {
}
