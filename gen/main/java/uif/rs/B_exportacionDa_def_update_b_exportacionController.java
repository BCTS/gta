package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectUpdateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_exportacionDa_def_update_b_exportacionInput;


@Controller(value = "uif.rs.B_exportacionDa_def_update_b_exportacionController")
@RequestMapping(value = "/application/uif_b_exportacions/{id}", method = RequestMethod.PUT, params = "type=uif_da_def_update_b_exportacion")
public class B_exportacionDa_def_update_b_exportacionController extends AbstractObjectUpdateController<B_exportacionDa_def_update_b_exportacionInput> {
    public B_exportacionDa_def_update_b_exportacionController() {
        super(B_exportacionDa_def_update_b_exportacionInput.class);
    }
}