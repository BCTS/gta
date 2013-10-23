package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_declaracionjurada;


@Controller(value = "uif.rs.B_declaracionjuradaController")
@RequestMapping(value = "/application/uif_b_declaracionjuradas/{id}")
public class B_declaracionjuradaController extends AbstractObjectController<B_declaracionjurada> {
    public B_declaracionjuradaController() {
        super(B_declaracionjurada.class);
    }
}