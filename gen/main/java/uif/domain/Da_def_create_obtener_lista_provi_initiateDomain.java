package uif.domain;

import com.emc.xcp.services.task.annotation.ProcessVariables;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import uif.domain.Da_def_create_obtener_lista_provi_initiateProcessVariables;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_obtener_lista_provi_initiateDomain extends com.emc.xcp.services.process.domain.InitiateProcessBaseDomain {

    @ProcessVariables
    private Da_def_create_obtener_lista_provi_initiateProcessVariables processVariables;

    public Da_def_create_obtener_lista_provi_initiateProcessVariables getProcessVariables(){
        return processVariables;
    }

    public void setProcessVariables(Da_def_create_obtener_lista_provi_initiateProcessVariables processVariables){
        this.processVariables = processVariables;
    }

}