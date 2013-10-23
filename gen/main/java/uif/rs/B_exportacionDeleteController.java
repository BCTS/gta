package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_exportacionDeleteInput;


@Controller(value = "uif.rs.B_exportacionDeleteController")
@RequestMapping(value = "/application/uif_b_exportacions/{id}", method = RequestMethod.DELETE)
public class B_exportacionDeleteController extends AbstractObjectDeleteController<B_exportacionDeleteInput> {
    public B_exportacionDeleteController() {
        super(B_exportacionDeleteInput.class);
    }
}