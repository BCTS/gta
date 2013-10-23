package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_importacion.F_involucradoToB_importacionAssociation;


@Controller(value = "uif.rs.R_inv_importacionDa_def_delete_r_inv_importacionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_importacions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_r_inv_importacion")
public class R_inv_importacionDa_def_delete_r_inv_importacionController extends AbstractObjectDeleteController<F_involucradoToB_importacionAssociation> {
    public R_inv_importacionDa_def_delete_r_inv_importacionController() {
        super(F_involucradoToB_importacionAssociation.class);
    }
}