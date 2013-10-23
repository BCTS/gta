package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_identificacionDeleteInput;


@Controller(value = "uif.rs.B_identificacionDeleteController")
@RequestMapping(value = "/application/uif_b_identificacions/{id}", method = RequestMethod.DELETE)
public class B_identificacionDeleteController extends AbstractObjectDeleteController<B_identificacionDeleteInput> {
    public B_identificacionDeleteController() {
        super(B_identificacionDeleteInput.class);
    }
}