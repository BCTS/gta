package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_financiamiento;


@Controller(value = "uif.rs.B_financiamientoTemplateController")
@RequestMapping(value = "/application/uif_b_financiamientos/template")
public class B_financiamientoTemplateController extends AbstractObjectTemplateController<B_financiamiento> {
    public B_financiamientoTemplateController() {
        super(B_financiamiento.class);
    }
}