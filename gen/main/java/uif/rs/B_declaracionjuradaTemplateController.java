package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_declaracionjurada;


@Controller(value = "uif.rs.B_declaracionjuradaTemplateController")
@RequestMapping(value = "/application/uif_b_declaracionjuradas/template")
public class B_declaracionjuradaTemplateController extends AbstractObjectTemplateController<B_declaracionjurada> {
    public B_declaracionjuradaTemplateController() {
        super(B_declaracionjurada.class);
    }
}