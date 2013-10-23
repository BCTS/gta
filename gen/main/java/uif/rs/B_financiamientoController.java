package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_financiamiento;


@Controller(value = "uif.rs.B_financiamientoController")
@RequestMapping(value = "/application/uif_b_financiamientos/{id}")
public class B_financiamientoController extends AbstractObjectController<B_financiamiento> {
    public B_financiamientoController() {
        super(B_financiamiento.class);
    }
}