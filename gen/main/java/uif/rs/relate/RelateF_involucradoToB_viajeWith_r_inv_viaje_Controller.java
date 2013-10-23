package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_viaje.B_viajeTargetRelation;
import uif.domain.r_inv_viaje.F_involucradoSourceRelation;
import uif.domain.r_inv_viaje.F_involucradoToB_viajeAssociation;
import uif.domain.r_inv_viaje.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_viajeWith_r_inv_viaje_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_viajes", method = RequestMethod.POST, params = "type=r_inv_viaje")
public class RelateF_involucradoToB_viajeWith_r_inv_viaje_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_viajeTargetRelation,F_involucradoToB_viajeAssociation,RelationshipInput> {
    public RelateF_involucradoToB_viajeWith_r_inv_viaje_Controller() {
        super(F_involucradoSourceRelation.class,B_viajeTargetRelation.class,F_involucradoToB_viajeAssociation.class);
    }
}