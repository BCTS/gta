package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_accionDeleteInput;


@Controller(value = "uif.rs.B_accionDeleteController")
@RequestMapping(value = "/application/uif_b_accions/{id}", method = RequestMethod.DELETE)
public class B_accionDeleteController extends AbstractObjectDeleteController<B_accionDeleteInput> {
    public B_accionDeleteController() {
        super(B_accionDeleteInput.class);
    }
}