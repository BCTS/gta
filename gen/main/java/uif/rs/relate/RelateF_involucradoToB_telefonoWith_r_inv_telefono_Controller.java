package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_telefono.B_telefonoTargetRelation;
import uif.domain.r_inv_telefono.F_involucradoSourceRelation;
import uif.domain.r_inv_telefono.F_involucradoToB_telefonoAssociation;
import uif.domain.r_inv_telefono.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_telefonoWith_r_inv_telefono_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_telefonos", method = RequestMethod.POST, params = "type=r_inv_telefono")
public class RelateF_involucradoToB_telefonoWith_r_inv_telefono_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_telefonoTargetRelation,F_involucradoToB_telefonoAssociation,RelationshipInput> {
    public RelateF_involucradoToB_telefonoWith_r_inv_telefono_Controller() {
        super(F_involucradoSourceRelation.class,B_telefonoTargetRelation.class,F_involucradoToB_telefonoAssociation.class);
    }
}