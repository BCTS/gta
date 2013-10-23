package uif.rs;

import com.emc.xcp.services.framework.rs.AbstractObjectController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import uif.domain.B_poder;


@Controller(value = "uif.rs.B_poderController")
@RequestMapping(value = "/application/uif_b_poders/{id}")
public class B_poderController extends AbstractObjectController<B_poder> {
    public B_poderController() {
        super(B_poder.class);
    }
}