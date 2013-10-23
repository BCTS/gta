package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_cuenta_bancaria;


@Controller(value = "uif.rs.B_cuenta_bancariaController")
@RequestMapping(value = "/application/uif_b_cuenta_bancarias/{id}")
public class B_cuenta_bancariaController extends AbstractObjectController<B_cuenta_bancaria> {
    public B_cuenta_bancariaController() {
        super(B_cuenta_bancaria.class);
    }
}