package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_cuenta.B_cuenta_bancariaTargetRelation;
import uif.domain.r_inv_cuenta.F_involucradoSourceRelation;
import uif.domain.r_inv_cuenta.F_involucradoToB_cuenta_bancariaAssociation;
import uif.domain.r_inv_cuenta.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_cuenta_bancariaToF_involucradoWith_r_inv_cuenta_Controller")
@RequestMapping(value = "/application/uif_b_cuenta_bancarias/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_cuenta")
public class RelateB_cuenta_bancariaToF_involucradoWith_r_inv_cuenta_Controller extends AbstractRelationshipCreateController<B_cuenta_bancariaTargetRelation,F_involucradoSourceRelation,F_involucradoToB_cuenta_bancariaAssociation,RelationshipInput> {
    public RelateB_cuenta_bancariaToF_involucradoWith_r_inv_cuenta_Controller() {
        super(B_cuenta_bancariaTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_cuenta_bancariaAssociation.class);
    }
}