package uif.domain;

import com.emc.xcp.services.task.annotation.Packages;
import com.emc.xcp.services.task.annotation.ProcessVariables;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import uif.domain.Da_def_create_crear_direccion_en__initiatePackages;
import uif.domain.Da_def_create_crear_direccion_en__initiateProcessVariables;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_crear_direccion_en__initiateDomain extends com.emc.xcp.services.process.domain.InitiateProcessBaseDomain {

    @ProcessVariables
    private Da_def_create_crear_direccion_en__initiateProcessVariables processVariables;

    @Packages
    private Da_def_create_crear_direccion_en__initiatePackages processPackages;

    public Da_def_create_crear_direccion_en__initiateProcessVariables getProcessVariables(){
        return processVariables;
    }

    public void setProcessVariables(Da_def_create_crear_direccion_en__initiateProcessVariables processVariables){
        this.processVariables = processVariables;
    }

    public Da_def_create_crear_direccion_en__initiatePackages getProcessPackages(){
        return processPackages;
    }

    public void setProcessPackages(Da_def_create_crear_direccion_en__initiatePackages processPackages){
        this.processPackages = processPackages;
    }

}