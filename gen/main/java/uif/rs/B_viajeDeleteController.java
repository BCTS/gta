package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_viajeDeleteInput;


@Controller(value = "uif.rs.B_viajeDeleteController")
@RequestMapping(value = "/application/uif_b_viajes/{id}", method = RequestMethod.DELETE)
public class B_viajeDeleteController extends AbstractObjectDeleteController<B_viajeDeleteInput> {
    public B_viajeDeleteController() {
        super(B_viajeDeleteInput.class);
    }
}