package uif.rs;

import com.emc.xcp.services.process.rs.AbstractProcessDataSourceControllerMultiObjects;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uif.domain.Obtener_lista_de_de_initiateSLProcessInput;
import uif.domain.Obtener_lista_de_de_initiateSLProcessOutput;


@Controller(value = "uif.rs.InitSLObtener_lista_de_de_initiateCreateCtroller")
@RequestMapping(value = "/application/processes/uif_obtener_lista_de_de_initiate", method = RequestMethod.GET)
public class InitSLObtener_lista_de_de_initiateCreateCtroller extends AbstractProcessDataSourceControllerMultiObjects<Obtener_lista_de_de_initiateSLProcessInput,Obtener_lista_de_de_initiateSLProcessOutput> {
    public InitSLObtener_lista_de_de_initiateCreateCtroller() {
        super("urn:uif:com.emc.ide.artifact.process:Artifacts/Processes/obtener_lista_de_de.process", Obtener_lista_de_de_initiateSLProcessInput.class,Obtener_lista_de_de_initiateSLProcessOutput.class);
    }
}