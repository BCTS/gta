package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_importacionDa_def_update_b_importacionInput;


@Controller(value = "uif.rs.B_importacionDa_def_update_b_importacionController")
@RequestMapping(value = "/application/uif_b_importacions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_b_importacion")
public class B_importacionDa_def_update_b_importacionController extends AbstractObjectUpdateController<B_importacionDa_def_update_b_importacionInput> {
    public B_importacionDa_def_update_b_importacionController() {
        super(B_importacionDa_def_update_b_importacionInput.class);
    }
}