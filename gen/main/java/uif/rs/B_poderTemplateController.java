package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_poder;


@Controller(value = "uif.rs.B_poderTemplateController")
@RequestMapping(value = "/application/uif_b_poders/template")
public class B_poderTemplateController extends AbstractObjectTemplateController<B_poder> {
    public B_poderTemplateController() {
        super(B_poder.class);
    }
}