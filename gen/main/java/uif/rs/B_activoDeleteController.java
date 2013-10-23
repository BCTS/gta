package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_activoDeleteInput;


@Controller(value = "uif.rs.B_activoDeleteController")
@RequestMapping(value = "/application/uif_b_activos/{id}", method = RequestMethod.DELETE)
public class B_activoDeleteController extends AbstractObjectDeleteController<B_activoDeleteInput> {
    public B_activoDeleteController() {
        super(B_activoDeleteInput.class);
    }
}