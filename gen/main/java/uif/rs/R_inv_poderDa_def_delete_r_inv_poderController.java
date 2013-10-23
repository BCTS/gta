package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_poder.F_involucradoToB_poderAssociation;


@Controller(value = "uif.rs.R_inv_poderDa_def_delete_r_inv_poderController")
@RequestMapping(value = "/application/relationships/uif_r_inv_poders/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_poder")
public class R_inv_poderDa_def_delete_r_inv_poderController extends AbstractObjectDeleteController<F_involucradoToB_poderAssociation> {
    public R_inv_poderDa_def_delete_r_inv_poderController() {
        super(F_involucradoToB_poderAssociation.class);
    }
}