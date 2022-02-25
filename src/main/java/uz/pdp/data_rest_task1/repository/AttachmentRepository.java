package uz.pdp.data_rest_task1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.Attachment;
import uz.pdp.data_rest_task1.projection.AttachmentInter;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = AttachmentInter.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
