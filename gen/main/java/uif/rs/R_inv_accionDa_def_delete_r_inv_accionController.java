package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_accion.F_involucradoToB_accionAssociation;


@Controller(value = "uif.rs.R_inv_accionDa_def_delete_r_inv_accionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_accions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_accion")
public class R_inv_accionDa_def_delete_r_inv_accionController extends AbstractObjectDeleteController<F_involucradoToB_accionAssociation> {
    public R_inv_accionDa_def_delete_r_inv_accionController() {
        super(F_involucradoToB_accionAssociation.class);
    }
}