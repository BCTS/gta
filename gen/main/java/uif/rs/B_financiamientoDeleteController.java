package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_financiamientoDeleteInput;


@Controller(value = "uif.rs.B_financiamientoDeleteController")
@RequestMapping(value = "/application/uif_b_financiamientos/{id}", method = RequestMethod.DELETE)
public class B_financiamientoDeleteController extends AbstractObjectDeleteController<B_financiamientoDeleteInput> {
    public B_financiamientoDeleteController() {
        super(B_financiamientoDeleteInput.class);
    }
}