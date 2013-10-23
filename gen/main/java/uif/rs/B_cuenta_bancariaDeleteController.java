package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectDeleteController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_cuenta_bancariaDeleteInput;


@Controller(value = "uif.rs.B_cuenta_bancariaDeleteController")
@RequestMapping(value = "/application/uif_b_cuenta_bancarias/{id}", method = RequestMethod.DELETE)
public class B_cuenta_bancariaDeleteController extends AbstractObjectDeleteController<B_cuenta_bancariaDeleteInput> {
    public B_cuenta_bancariaDeleteController() {
        super(B_cuenta_bancariaDeleteInput.class);
    }
}