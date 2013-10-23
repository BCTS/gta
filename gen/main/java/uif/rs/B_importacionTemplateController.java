package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_importacion;


@Controller(value = "uif.rs.B_importacionTemplateController")
@RequestMapping(value = "/application/uif_b_importacions/template")
public class B_importacionTemplateController extends AbstractObjectTemplateController<B_importacion> {
    public B_importacionTemplateController() {
        super(B_importacion.class);
    }
}