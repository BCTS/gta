package uif.domain;

import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import com.emc.xcp.services.process.annotation.ProcessVariable;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(superType = "", type = "dm_workflow")
@Linked(template = "/application/processes/uif_obtener_lista_distr_initiate")
@JsonPropertyOrder(alphabetic = true)
public class Obtener_lista_distr_initiateSLProcessInput {

    @ProcessVariable(variableName = "departamento")
    private String departamento;

    @ProcessVariable(variableName = "provincia")
    private String provincia;

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getProvincia(){
        return provincia;
    }

    public void setProvincia(String provincia){
        this.provincia = provincia;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}