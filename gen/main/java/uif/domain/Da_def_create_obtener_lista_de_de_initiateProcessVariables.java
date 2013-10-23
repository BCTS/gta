package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_obtener_lista_de_de_initiateProcessVariables {

    @ProcessVariable(variableName = "departamentos")
    private List<String> departamentos;

    public List<String> getDepartamentos(){
        return departamentos;
    }

    public void setDepartamentos(List<String> departamentos){
        this.departamentos = departamentos;
    }

}