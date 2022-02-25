package uz.pdp.data_rest_task1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Category;
import uz.pdp.data_rest_task1.projection.CategoryInter;

@RepositoryRestResource(path = "category",excerptProjection = CategoryInter.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
