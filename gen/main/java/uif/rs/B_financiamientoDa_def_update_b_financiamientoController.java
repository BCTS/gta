package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_financiamientoDa_def_update_b_financiamientoInput;


@Controller(value = "uif.rs.B_financiamientoDa_def_update_b_financiamientoController")
@RequestMapping(value = "/application/uif_b_financiamientos/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_b_financiamiento")
public class B_financiamientoDa_def_update_b_financiamientoController extends AbstractObjectUpdateController<B_financiamientoDa_def_update_b_financiamientoInput> {
    public B_financiamientoDa_def_update_b_financiamientoController() {
        super(B_financiamientoDa_def_update_b_financiamientoInput.class);
    }
}