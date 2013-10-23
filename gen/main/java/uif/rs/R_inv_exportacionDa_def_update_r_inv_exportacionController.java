package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_exportacionDa_def_update_r_inv_exportacionInput;


@Controller(value = "uif.rs.R_inv_exportacionDa_def_update_r_inv_exportacionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_exportacions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_exportacion")
public class R_inv_exportacionDa_def_update_r_inv_exportacionController extends AbstractObjectUpdateController<R_inv_exportacionDa_def_update_r_inv_exportacionInput> {
    public R_inv_exportacionDa_def_update_r_inv_exportacionController() {
        super(R_inv_exportacionDa_def_update_r_inv_exportacionInput.class);
    }
}