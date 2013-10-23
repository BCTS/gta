package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Fuentelicita;


@Controller(value = "uif.rs.FuentelicitaTemplateController")
@RequestMapping(value = "/application/uif_fuentelicitas/template")
public class FuentelicitaTemplateController extends AbstractObjectTemplateController<Fuentelicita> {
    public FuentelicitaTemplateController() {
        super(Fuentelicita.class);
    }
}