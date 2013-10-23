package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_declaracionjuradaDeleteInput;


@Controller(value = "uif.rs.B_declaracionjuradaDeleteController")
@RequestMapping(value = "/application/uif_b_declaracionjuradas/{id}", method = RequestMethod.DELETE)
public class B_declaracionjuradaDeleteController extends AbstractObjectDeleteController<B_declaracionjuradaDeleteInput> {
    public B_declaracionjuradaDeleteController() {
        super(B_declaracionjuradaDeleteInput.class);
    }
}