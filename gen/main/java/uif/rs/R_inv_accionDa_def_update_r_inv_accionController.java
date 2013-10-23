package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_accionDa_def_update_r_inv_accionInput;


@Controller(value = "uif.rs.R_inv_accionDa_def_update_r_inv_accionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_accions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_accion")
public class R_inv_accionDa_def_update_r_inv_accionController extends AbstractObjectUpdateController<R_inv_accionDa_def_update_r_inv_accionInput> {
    public R_inv_accionDa_def_update_r_inv_accionController() {
        super(R_inv_accionDa_def_update_r_inv_accionInput.class);
    }
}