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
public class Obtener_lista_distr_initiateSLProcessOutput {

    @ProcessVariable(variableName = "distritos")
    private String distritos;

    public String getDistritos(){
        return distritos;
    }

    public void setDistritos(String distritos){
        this.distritos = distritos;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}