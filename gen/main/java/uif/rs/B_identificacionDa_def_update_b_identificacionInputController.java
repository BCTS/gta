package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_identificacionDa_def_update_b_identificacionInput;


@Controller(value = "uif.rs.B_identificacionDa_def_update_b_identificacionInputController")
@RequestMapping(value = "/application/uif_b_identificacions/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_identificacion")
public class B_identificacionDa_def_update_b_identificacionInputController extends AbstractObjectController<B_identificacionDa_def_update_b_identificacionInput> {
    public B_identificacionDa_def_update_b_identificacionInputController() {
        super(B_identificacionDa_def_update_b_identificacionInput.class);
    }
}