package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Obtener_lista_de_pa_initiateSLProcessInput;
import uif.domain.Obtener_lista_de_pa_initiateSLProcessOutput;


@Controller(value = "uif.rs.InitSLObtener_lista_de_pa_initiateCreateCtroller")
@RequestMapping(value = "/application/processes/uif_obtener_lista_de_pa_initiate", method = RequestMethod.GET)
public class InitSLObtener_lista_de_pa_initiateCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<Obtener_lista_de_pa_initiateSLProcessInput,Obtener_lista_de_pa_initiateSLProcessOutput> {
    public InitSLObtener_lista_de_pa_initiateCreateCtroller() {
        super("urn:uif:com.emc.ide.artifact.process:Artifacts/Processes/obtener_lista_de_pa.process", Obtener_lista_de_pa_initiateSLProcessInput.class,Obtener_lista_de_pa_initiateSLProcessOutput.class);
    }
}