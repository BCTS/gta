package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_identificacionDa_def_update_b_identificacionInput;


@Controller(value = "uif.rs.B_identificacionDa_def_update_b_identificacionController")
@RequestMapping(value = "/application/uif_b_identificacions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_b_identificacion")
public class B_identificacionDa_def_update_b_identificacionController extends AbstractObjectUpdateController<B_identificacionDa_def_update_b_identificacionInput> {
    public B_identificacionDa_def_update_b_identificacionController() {
        super(B_identificacionDa_def_update_b_identificacionInput.class);
    }
}