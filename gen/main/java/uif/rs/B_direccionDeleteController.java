package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_direccionDeleteInput;


@Controller(value = "uif.rs.B_direccionDeleteController")
@RequestMapping(value = "/application/uif_b_direccions/{id}", method = RequestMethod.DELETE)
public class B_direccionDeleteController extends AbstractObjectDeleteController<B_direccionDeleteInput> {
    public B_direccionDeleteController() {
        super(B_direccionDeleteInput.class);
    }
}