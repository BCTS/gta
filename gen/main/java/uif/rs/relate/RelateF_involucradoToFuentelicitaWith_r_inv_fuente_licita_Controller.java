package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_fuente_licita.F_involucradoSourceRelation;
import uif.domain.r_inv_fuente_licita.F_involucradoToFuentelicitaAssociation;
import uif.domain.r_inv_fuente_licita.FuentelicitaTargetRelation;
import uif.domain.r_inv_fuente_licita.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateF_involucradoToFuentelicitaWith_r_inv_fuente_licita_Controller")
@RequestMapping(value = "/application/uif_f_involucrados/{id}/fuentelicitas", method = RequestMethod.POST, params = "type=r_inv_fuente_licita")
public class RelateF_involucradoToFuentelicitaWith_r_inv_fuente_licita_Controller extends AbstractRelationshipCreateController<F_involucradoSourceRelation,FuentelicitaTargetRelation,F_involucradoToFuentelicitaAssociation,RelationshipInput> {
    public RelateF_involucradoToFuentelicitaWith_r_inv_fuente_licita_Controller() {
        super(F_involucradoSourceRelation.class,FuentelicitaTargetRelation.class,F_involucradoToFuentelicitaAssociation.class);
    }
}