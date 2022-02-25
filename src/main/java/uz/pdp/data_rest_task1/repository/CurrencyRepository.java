package uz.pdp.data_rest_task1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Currency;
import uz.pdp.data_rest_task1.projection.CurrencyInter;


@RepositoryRestResource(path = "currency",excerptProjection = CurrencyInter.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
}
