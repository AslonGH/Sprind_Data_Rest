package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentInter {

     Integer getId();

     String  getName();

     long   getSize();

     String getContentType();

}
