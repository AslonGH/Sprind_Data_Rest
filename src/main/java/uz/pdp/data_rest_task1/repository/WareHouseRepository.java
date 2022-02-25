package uz.pdp.data_rest_task1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.WareHouse;
import uz.pdp.data_rest_task1.projection.WareHouseInter;


@RepositoryRestResource(path = "wareHouse",excerptProjection = WareHouseInter.class)
public interface WareHouseRepository extends JpaRepository<WareHouse,Integer> {




}
