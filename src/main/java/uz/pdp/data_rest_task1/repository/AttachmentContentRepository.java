package uz.pdp.data_rest_task1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.data_rest_task1.entity.AttachmentContent;
import uz.pdp.data_rest_task1.projection.AttachmentContentInter;


@RepositoryRestResource(path = "attachmentContent",excerptProjection = AttachmentContentInter.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {
}
