package uif.rs.relate;

import com.emc.xcp.services.framework.rs.AbstractRelationshipCreateController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.r_inv_fuente_licita.F_involucradoSourceRelation;
import uif.domain.r_inv_fuente_licita.F_involucradoToFuentelicitaAssociation;
import uif.domain.r_inv_fuente_licita.FuentelicitaTargetRelation;
import uif.domain.r_inv_fuente_licita.RelationshipInput;


@Controller(value = "uif.rs.relate.RelateFuentelicitaToF_involucradoWith_r_inv_fuente_licita_Controller")
@RequestMapping(value = "/application/uif_fuentelicitas/{id}/f_involucrados", method = RequestMethod.POST, params = "type=r_inv_fuente_licita")
public class RelateFuentelicitaToF_involucradoWith_r_inv_fuente_licita_Controller extends AbstractRelationshipCreateController<FuentelicitaTargetRelation,F_involucradoSourceRelation,F_involucradoToFuentelicitaAssociation,RelationshipInput> {
    public RelateFuentelicitaToF_involucradoWith_r_inv_fuente_licita_Controller() {
        super(FuentelicitaTargetRelation.class,F_involucradoSourceRelation.class,F_involucradoToFuentelicitaAssociation.class);
    }
}