package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta.F_involucradoToB_cuenta_bancariaAssociation;


@Controller(value = "uif.rs.R_inv_cuentaDa_def_delete_r_inv_cuentaController")
@RequestMapping(value = "/application/relationships/uif_r_inv_cuentas/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_cuenta")
public class R_inv_cuentaDa_def_delete_r_inv_cuentaController extends AbstractObjectDeleteController<F_involucradoToB_cuenta_bancariaAssociation> {
    public R_inv_cuentaDa_def_delete_r_inv_cuentaController() {
        super(F_involucradoToB_cuenta_bancariaAssociation.class);
    }
}