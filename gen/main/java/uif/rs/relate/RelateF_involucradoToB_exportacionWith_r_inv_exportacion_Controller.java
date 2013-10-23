package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_exportacion.B_exportacionTargetRelation;
import uif.domain.r_inv_exportacion.F_involucradoSourceRelation;
import uif.domain.r_inv_exportacion.F_involucradoToB_exportacionAssociation;
import uif.domain.r_inv_exportacion.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToB_exportacionWith_r_inv_exportacion_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/b_exportacions", method = RequestMethod.POST, params = "type=r_inv_exportacion")
public class RelateF_involucradoToB_exportacionWith_r_inv_exportacion_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,B_exportacionTargetRelation,F_involucradoToB_exportacionAssociation,RelationshipInput> {
    public RelateF_involucradoToB_exportacionWith_r_inv_exportacion_Controller() {
        super(F_involucradoSourceRelation.class,B_exportacionTargetRelation.class,F_involucradoToB_exportacionAssociation.class);
    }
}