package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_obtener_lista_provi_initiateProcessVariables {

    @ProcessVariable(variableName = "departamento")
    private String departamento;

    @ProcessVariable(variableName = "provincias")
    private List<String> provincias;

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public List<String> getProvincias(){
        return provincias;
    }

    public void setProvincias(List<String> provincias){
        this.provincias = provincias;
    }

}