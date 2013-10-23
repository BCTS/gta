package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta.B_cuenta_bancariaTargetRelation;
import uif.domain.r_inv_cuenta.F_involucradoSourceRelation;
import uif.domain.r_inv_cuenta.F_involucradoToB_cuenta_bancariaAssociation;
import uif.domain.r_inv_cuenta.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_cuenta_bancariaWith_r_inv_cuenta_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_cuenta_bancarias", method = RequestMethod.POST, params = "type=r_inv_cuenta")
public class RelateF_involucradoToB_cuenta_bancariaWith_r_inv_cuenta_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_cuenta_bancariaTargetRelation,F_involucradoToB_cuenta_bancariaAssociation,RelationshipInput> {
    public RelateF_involucradoToB_cuenta_bancariaWith_r_inv_cuenta_Controller() {
        super(F_involucradoSourceRelation.class,B_cuenta_bancariaTargetRelation.class,F_involucradoToB_cuenta_bancariaAssociation.class);
    }
}