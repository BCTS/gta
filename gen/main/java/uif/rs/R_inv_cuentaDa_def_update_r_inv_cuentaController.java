package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_cuentaDa_def_update_r_inv_cuentaInput;


@Controller(value = "uif.rs.R_inv_cuentaDa_def_update_r_inv_cuentaController")
@RequestMapping(value = "/application/relationships/uif_r_inv_cuentas/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_cuenta")
public class R_inv_cuentaDa_def_update_r_inv_cuentaController extends AbstractObjectUpdateController<R_inv_cuentaDa_def_update_r_inv_cuentaInput> {
    public R_inv_cuentaDa_def_update_r_inv_cuentaController() {
        super(R_inv_cuentaDa_def_update_r_inv_cuentaInput.class);
    }
}