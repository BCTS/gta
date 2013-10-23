package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_financiamien.F_involucradoToB_financiamientoAssociation;


@Controller(value = "uif.rs.R_inv_financiamienDa_def_delete_r_inv_financiamienController")
@RequestMapping(value = "/application/relationships/uif_r_inv_financiamiens/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_financiamien")
public class R_inv_financiamienDa_def_delete_r_inv_financiamienController extends AbstractObjectDeleteController<F_involucradoToB_financiamientoAssociation> {
    public R_inv_financiamienDa_def_delete_r_inv_financiamienController() {
        super(F_involucradoToB_financiamientoAssociation.class);
    }
}