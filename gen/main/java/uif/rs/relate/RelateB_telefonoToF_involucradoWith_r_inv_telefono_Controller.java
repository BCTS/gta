package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_telefono.B_telefonoTargetRelation;
import uif.domain.r_inv_telefono.F_involucradoSourceRelation;
import uif.domain.r_inv_telefono.F_involucradoToB_telefonoAssociation;
import uif.domain.r_inv_telefono.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_telefonoToF_involucradoWith_r_inv_telefono_Controller")
@RequestMapping(value = "/application/uif_b_telefonos/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_telefono")
public class RelateB_telefonoToF_involucradoWith_r_inv_telefono_Controller extends AbstractRelationshipCreateController<B_telefonoTargetRelation,F_involucradoSourceRelation,F_involucradoToB_telefonoAssociation,RelationshipInput> {
    public RelateB_telefonoToF_involucradoWith_r_inv_telefono_Controller() {
        super(B_telefonoTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_telefonoAssociation.class);
    }
}