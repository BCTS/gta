package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_id.F_involucradoToB_identificacionAssociation;


@Controller(value = "uif.rs.R_inv_idDa_def_delete_r_inv_idController")
@RequestMapping(value = "/application/relationships/uif_r_inv_ids/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_id")
public class R_inv_idDa_def_delete_r_inv_idController extends AbstractObjectDeleteController<F_involucradoToB_identificacionAssociation> {
    public R_inv_idDa_def_delete_r_inv_idController() {
        super(F_involucradoToB_identificacionAssociation.class);
    }
}