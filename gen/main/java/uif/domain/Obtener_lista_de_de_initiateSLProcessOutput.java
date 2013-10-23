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
@Linked(template = "/application/processes/uif_obtener_lista_de_de_initiate")
@JsonPropertyOrder(alphabetic = true)
public class Obtener_lista_de_de_initiateSLProcessOutput {

    @ProcessVariable(variableName = "departamentos")
    private String departamentos;

    public String getDepartamentos(){
        return departamentos;
    }

    public void setDepartamentos(String departamentos){
        this.departamentos = departamentos;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}