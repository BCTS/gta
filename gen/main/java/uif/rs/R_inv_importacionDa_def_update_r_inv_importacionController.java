package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.R_inv_importacionDa_def_update_r_inv_importacionInput;


@Controller(value = "uif.rs.R_inv_importacionDa_def_update_r_inv_importacionController")
@RequestMapping(value = "/application/relationships/uif_r_inv_importacions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_r_inv_importacion")
public class R_inv_importacionDa_def_update_r_inv_importacionController extends AbstractObjectUpdateController<R_inv_importacionDa_def_update_r_inv_importacionInput> {
    public R_inv_importacionDa_def_update_r_inv_importacionController() {
        super(R_inv_importacionDa_def_update_r_inv_importacionInput.class);
    }
}