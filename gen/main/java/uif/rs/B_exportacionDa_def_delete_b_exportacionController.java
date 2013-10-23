package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_exportacionDa_def_delete_b_exportacionInput;


@Controller(value = "uif.rs.B_exportacionDa_def_delete_b_exportacionController")
@RequestMapping(value = "/application/uif_b_exportacions/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_exportacion")
public class B_exportacionDa_def_delete_b_exportacionController extends AbstractObjectDeleteController<B_exportacionDa_def_delete_b_exportacionInput> {
    public B_exportacionDa_def_delete_b_exportacionController() {
        super(B_exportacionDa_def_delete_b_exportacionInput.class);
    }
}