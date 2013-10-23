package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.B_cuenta_bancariaDa_def_update_b_cuenta_bancariaInput;


@Controller(value = "uif.rs.B_cuenta_bancariaDa_def_update_b_cuenta_bancariaInputController")
@RequestMapping(value = "/application/uif_b_cuenta_bancarias/{id}", method = RequestMethod.GET, params = "type=uif_da_def_update_b_cuenta_bancaria")
public class B_cuenta_bancariaDa_def_update_b_cuenta_bancariaInputController extends AbstractObjectController<B_cuenta_bancariaDa_def_update_b_cuenta_bancariaInput> {
    public B_cuenta_bancariaDa_def_update_b_cuenta_bancariaInputController() {
        super(B_cuenta_bancariaDa_def_update_b_cuenta_bancariaInput.class);
    }
}