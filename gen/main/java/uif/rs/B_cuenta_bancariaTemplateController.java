package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectTemplateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_cuenta_bancaria;


@Controller(value = "uif.rs.B_cuenta_bancariaTemplateController")
@RequestMapping(value = "/application/uif_b_cuenta_bancarias/template")
public class B_cuenta_bancariaTemplateController extends AbstractObjectTemplateController<B_cuenta_bancaria> {
    public B_cuenta_bancariaTemplateController() {
        super(B_cuenta_bancaria.class);
    }
}