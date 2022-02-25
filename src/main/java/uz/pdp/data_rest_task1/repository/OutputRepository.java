package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Output;
import uz.pdp.data_rest_task1.projection.OutputInter;

@RepositoryRestResource(path = "output",excerptProjection = OutputInter.class)
public interface OutputRepository extends JpaRepository<Output, Integer> {
}
