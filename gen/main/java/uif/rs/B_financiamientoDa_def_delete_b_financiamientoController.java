package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_financiamientoDa_def_delete_b_financiamientoInput;


@Controller(value = "uif.rs.B_financiamientoDa_def_delete_b_financiamientoController")
@RequestMapping(value = "/application/uif_b_financiamientos/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_financiamiento")
public class B_financiamientoDa_def_delete_b_financiamientoController extends AbstractObjectDeleteController<B_financiamientoDa_def_delete_b_financiamientoInput> {
    public B_financiamientoDa_def_delete_b_financiamientoController() {
        super(B_financiamientoDa_def_delete_b_financiamientoInput.class);
    }
}