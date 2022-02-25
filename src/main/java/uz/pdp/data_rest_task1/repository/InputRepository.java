package uz.pdp.data_rest_task1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Input;
import uz.pdp.data_rest_task1.projection.InputInter;



@RepositoryRestResource(path = "input",excerptProjection = InputInter.class)
public interface InputRepository extends JpaRepository<Input,Integer> {


}
