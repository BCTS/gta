package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_financiamientoDa_def_create_b_financiamientoInput;


@Controller(value = "uif.rs.B_financiamientoDa_def_create_b_financiamientoController")
@RequestMapping(value = "/application/uif_b_financiamientos", method = RequestMethod.POST, params = "type=uif_da_def_create_b_financiamiento")
public class B_financiamientoDa_def_create_b_financiamientoController extends AbstractObjectCreateController<B_financiamientoDa_def_create_b_financiamientoInput> {
    public B_financiamientoDa_def_create_b_financiamientoController() {
        super(B_financiamientoDa_def_create_b_financiamientoInput.class);
    }
}