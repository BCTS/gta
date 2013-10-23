package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_exportacion;


@Controller(value = "uif.rs.B_exportacionTemplateController")
@RequestMapping(value = "/application/uif_b_exportacions/template")
public class B_exportacionTemplateController extends AbstractObjectTemplateController<B_exportacion> {
    public B_exportacionTemplateController() {
        super(B_exportacion.class);
    }
}