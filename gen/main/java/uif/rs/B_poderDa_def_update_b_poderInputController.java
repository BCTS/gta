package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_poderDa_def_update_b_poderInput;


@Controller(value = "uif.rs.B_poderDa_def_update_b_poderInputController")
@RequestMapping(value = "/application/uif_b_poders/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_poder")
public class B_poderDa_def_update_b_poderInputController extends AbstractObjectController<B_poderDa_def_update_b_poderInput> {
    public B_poderDa_def_update_b_poderInputController() {
        super(B_poderDa_def_update_b_poderInput.class);
    }
}