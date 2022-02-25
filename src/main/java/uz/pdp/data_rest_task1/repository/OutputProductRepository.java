package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.OutputProduct;
import uz.pdp.data_rest_task1.projection.OutputProductInter;


@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProductInter.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
