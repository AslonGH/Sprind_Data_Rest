package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Attachment;
import uz.pdp.data_rest_task1.entity.AttachmentContent;



@Projection(types = AttachmentContent.class)
public interface AttachmentContentInter {

     Integer getId();

     byte[] getBytes();

     Attachment getAttachment();
}
