package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_importacion.B_importacionTargetRelation;
import uif.domain.r_inv_importacion.F_involucradoSourceRelation;
import uif.domain.r_inv_importacion.F_involucradoToB_importacionAssociation;
import uif.domain.r_inv_importacion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_importacionWith_r_inv_importacion_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_importacions", method = RequestMethod.POST, params = "type=r_inv_importacion")
public class RelateF_involucradoToB_importacionWith_r_inv_importacion_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_importacionTargetRelation,F_involucradoToB_importacionAssociation,RelationshipInput> {
    public RelateF_involucradoToB_importacionWith_r_inv_importacion_Controller() {
        super(F_involucradoSourceRelation.class,B_importacionTargetRelation.class,F_involucradoToB_importacionAssociation.class);
    }
}