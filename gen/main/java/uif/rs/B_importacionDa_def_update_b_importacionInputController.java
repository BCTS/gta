package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_importacionDa_def_update_b_importacionInput;


@Controller(value = "uif.rs.B_importacionDa_def_update_b_importacionInputController")
@RequestMapping(value = "/application/uif_b_importacions/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_importacion")
public class B_importacionDa_def_update_b_importacionInputController extends AbstractObjectController<B_importacionDa_def_update_b_importacionInput> {
    public B_importacionDa_def_update_b_importacionInputController() {
        super(B_importacionDa_def_update_b_importacionInput.class);
    }
}