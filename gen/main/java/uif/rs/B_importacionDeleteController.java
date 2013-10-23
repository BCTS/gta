package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_importacionDeleteInput;


@Controller(value = "uif.rs.B_importacionDeleteController")
@RequestMapping(value = "/application/uif_b_importacions/{id}", method = RequestMethod.DELETE)
public class B_importacionDeleteController extends AbstractObjectDeleteController<B_importacionDeleteInput> {
    public B_importacionDeleteController() {
        super(B_importacionDeleteInput.class);
    }
}