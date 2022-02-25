package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.User;
import uz.pdp.data_rest_task1.projection.UserInter;

@RepositoryRestResource(path = "user",excerptProjection = UserInter.class)
public interface UserRepository extends JpaRepository<User,Integer> {

}
