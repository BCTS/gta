package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_direccionDa_def_delete_b_direccionInput;


@Controller(value = "uif.rs.B_direccionDa_def_delete_b_direccionController")
@RequestMapping(value = "/application/uif_b_direccions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_direccion")
public class B_direccionDa_def_delete_b_direccionController extends AbstractObjectDeleteController<B_direccionDa_def_delete_b_direccionInput> {
    public B_direccionDa_def_delete_b_direccionController() {
        super(B_direccionDa_def_delete_b_direccionInput.class);
    }
}