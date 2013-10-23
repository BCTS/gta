package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.Fuentelicita;


@Controller(value = "uif.rs.FuentelicitaController")
@RequestMapping(value = "/application/uif_fuentelicitas/{id}")
public class FuentelicitaController extends AbstractObjectController<Fuentelicita> {
    public FuentelicitaController() {
        super(Fuentelicita.class);
    }
}