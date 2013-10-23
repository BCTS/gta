package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_obtener_lista_de_pa_initiateProcessVariables {

    @ProcessVariable(variableName = "pais")
    private List<String> pais;

    public List<String> getPais(){
        return pais;
    }

    public void setPais(List<String> pais){
        this.pais = pais;
    }

}