package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.List;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_obtener_lista_distr_initiateProcessVariables {

    @ProcessVariable(variableName = "departamento")
    private String departamento;

    @ProcessVariable(variableName = "distritos")
    private List<String> distritos;

    @ProcessVariable(variableName = "provincia")
    private String provincia;

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public List<String> getDistritos(){
        return distritos;
    }

    public void setDistritos(List<String> distritos){
        this.distritos = distritos;
    }

    public String getProvincia(){
        return provincia;
    }

    public void setProvincia(String provincia){
        this.provincia = provincia;
    }

}