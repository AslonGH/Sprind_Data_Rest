package uz.pdp.data_rest_task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Client;
import uz.pdp.data_rest_task1.projection.ClientInter;

@RepositoryRestResource(path = "client",excerptProjection = ClientInter.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {

}
