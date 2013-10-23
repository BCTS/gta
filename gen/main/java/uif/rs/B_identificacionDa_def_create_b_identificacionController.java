package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_identificacionDa_def_create_b_identificacionInput;


@Controller(value = "uif.rs.B_identificacionDa_def_create_b_identificacionController")
@RequestMapping(value = "/application/uif_b_identificacions", method = RequestMethod.POST, params = "type=uif_da_def_create_b_identificacion")
public class B_identificacionDa_def_create_b_identificacionController extends AbstractObjectCreateController<B_identificacionDa_def_create_b_identificacionInput> {
    public B_identificacionDa_def_create_b_identificacionController() {
        super(B_identificacionDa_def_create_b_identificacionInput.class);
    }
}