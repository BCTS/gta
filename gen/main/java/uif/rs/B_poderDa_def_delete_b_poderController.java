package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_poderDa_def_delete_b_poderInput;


@Controller(value = "uif.rs.B_poderDa_def_delete_b_poderController")
@RequestMapping(value = "/application/uif_b_poders/{id}", method = RequestMethod.DELETE, params = "type=uif_da_def_delete_b_poder")
public class B_poderDa_def_delete_b_poderController extends AbstractObjectDeleteController<B_poderDa_def_delete_b_poderInput> {
    public B_poderDa_def_delete_b_poderController() {
        super(B_poderDa_def_delete_b_poderInput.class);
    }
}