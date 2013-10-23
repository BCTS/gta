package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_poderDeleteInput;


@Controller(value = "uif.rs.B_poderDeleteController")
@RequestMapping(value = "/application/uif_b_poders/{id}", method = RequestMethod.DELETE)
public class B_poderDeleteController extends AbstractObjectDeleteController<B_poderDeleteInput> {
    public B_poderDeleteController() {
        super(B_poderDeleteInput.class);
    }
}