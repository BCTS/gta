package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_direccionDa_def_create_b_direccionInput;


@Controller(value = "uif.rs.B_direccionDa_def_create_b_direccionController")
@RequestMapping(value = "/application/uif_b_direccions", method = RequestMethod.POST, params = "type=uif_da_def_create_b_direccion")
public class B_direccionDa_def_create_b_direccionController extends AbstractObjectCreateController<B_direccionDa_def_create_b_direccionInput> {
    public B_direccionDa_def_create_b_direccionController() {
        super(B_direccionDa_def_create_b_direccionInput.class);
    }
}