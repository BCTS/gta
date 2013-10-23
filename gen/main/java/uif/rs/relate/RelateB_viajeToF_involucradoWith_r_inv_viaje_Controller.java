package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_viaje.B_viajeTargetRelation;
import uif.domain.r_inv_viaje.F_involucradoSourceRelation;
import uif.domain.r_inv_viaje.F_involucradoToB_viajeAssociation;
import uif.domain.r_inv_viaje.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateB_viajeToF_involucradoWith_r_inv_viaje_Controller")
@RequestMapping(value = "/application/uif_b_viajes/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_viaje")
public class RelateB_viajeToF_involucradoWith_r_inv_viaje_Controller extends AbstractRelationshipCreateController<B_viajeTargetRelation,F_involucradoSourceRelation,F_involucradoToB_viajeAssociation,RelationshipInput> {
    public RelateB_viajeToF_involucradoWith_r_inv_viaje_Controller() {
        super(B_viajeTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToB_viajeAssociation.class);
    }
}