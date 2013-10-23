package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_exportacion.F_involucradoToB_exportacionAssociation;


@Controller(value = "uif.rs.R_inv_exportacionDa_def_delete_r_inv_exportacionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_exportacions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_exportacion")
public class R_inv_exportacionDa_def_delete_r_inv_exportacionController extends AbstractObjectDeleteController<F_involucradoToB_exportacionAssociation> {
    public R_inv_exportacionDa_def_delete_r_inv_exportacionController() {
        super(F_involucradoToB_exportacionAssociation.class);
    }
}