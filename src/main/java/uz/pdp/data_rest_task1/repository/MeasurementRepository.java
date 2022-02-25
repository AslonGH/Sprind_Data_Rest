package uz.pdp.data_rest_task1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Measurement;
import uz.pdp.data_rest_task1.projection.MeasurementInter;

@RepositoryRestResource(path = "measurement",excerptProjection = MeasurementInter.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {




}
