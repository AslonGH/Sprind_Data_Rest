package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Supplier;
import uz.pdp.data_rest_task1.projection.SupplierInter;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierInter.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {


}
