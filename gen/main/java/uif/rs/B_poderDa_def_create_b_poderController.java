package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_poderDa_def_create_b_poderInput;


@Controller(value = "uif.rs.B_poderDa_def_create_b_poderController")
@RequestMapping(value = "/application/uif_b_poders", method = RequestMethod.POST, params = "type=uif_da_def_create_b_poder")
public class B_poderDa_def_create_b_poderController extends AbstractObjectCreateController<B_poderDa_def_create_b_poderInput> {
    public B_poderDa_def_create_b_poderController() {
        super(B_poderDa_def_create_b_poderInput.class);
    }
}