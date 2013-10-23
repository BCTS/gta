package uif.domain;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.domain.LinkSource;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@PersistentObject(type = "uif_b_activo")
@Linked(template = "/application/uif_b_activos")
@JsonPropertyOrder(alphabetic = true)
public class B_activoDa_def_create_b_activoInput {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @PersistentAttribute(name = "actual")
    private Integer actual;

    @PersistentAttribute(name = "moneda")
    private String moneda;

    @PersistentAttribute(name = "partida_registral")
    private String partida_registral;

    @PersistentAttribute(name = "tipo")
    private String tipo;

    @PersistentAttribute(name = "total")
    private Integer total;

    @PersistentAttribute(name = "transferidos")
    private Integer transferidos;

    @PersistentAttribute(name = "object_name")
    private String object_name;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public List<String> getEffectivePermissions(){
        return effectivePermissions;
    }

    public void setEffectivePermissions(List<String> effectivePermissions){
        this.effectivePermissions = effectivePermissions;
    }

    public Integer getActual(){
        return actual;
    }

    public void setActual(Integer actual){
        this.actual = actual;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda = moneda;
    }

    public String getPartida_registral(){
        return partida_registral;
    }

    public void setPartida_registral(String partida_registral){
        this.partida_registral = partida_registral;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Integer getTotal(){
        return total;
    }

    public void setTotal(Integer total){
        this.total = total;
    }

    public Integer getTransferidos(){
        return transferidos;
    }

    public void setTransferidos(Integer transferidos){
        this.transferidos = transferidos;
    }

    public String getObject_name(){
        return object_name;
    }

    public void setObject_name(String object_name){
        this.object_name = object_name;
    }

    @JsonProperty
    public Map<String, java.lang.Object> getLinks(){
        return LinkSource.getLinks(this);
    }

    @JsonIgnore
    public void setLinks(Map<String,  java.lang.Object> linkSource){
    }
}