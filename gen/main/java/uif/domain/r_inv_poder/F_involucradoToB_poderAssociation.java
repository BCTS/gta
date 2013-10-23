package uif.domain.r_inv_poder;

import com.emc.xcp.persistence.annotation.CustomAttribute;
import com.emc.xcp.persistence.annotation.PersistentAttribute;
import com.emc.xcp.persistence.annotation.PersistentId;
import com.emc.xcp.persistence.annotation.PersistentObject;
import com.emc.xcp.persistence.annotation.PersistentTypedRelationship;
import com.emc.xcp.services.core.annotation.Linked;
import com.emc.xcp.services.framework.rs.json.EntityAsIdSerializer;
import java.util.List;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import uif.domain.r_inv_poder.B_poderTargetRelation;
import uif.domain.r_inv_poder.F_involucradoSourceRelation;


@PersistentObject(type = "dm_relation")
@JsonPropertyOrder(alphabetic = true)
@JsonIgnoreProperties(value = {"dirty"})
public class F_involucradoToB_poderAssociation {

    @PersistentId
    @PersistentAttribute(name = "r_object_id")
    @Linked
    private String id;

    @CustomAttribute(id = "effectivePermissionsHandler")
    private List<String> effectivePermissions;

    @OneToOne
    @PersistentTypedRelationship(type = "uif_r_inv_poder")
    @PrimaryKeyJoinColumn(name = "parent_id")
    private F_involucradoSourceRelation parent;

    @OneToOne
    @PersistentTypedRelationship(type = "uif_r_inv_poder")
    @PrimaryKeyJoinColumn(name = "child_id")
    private B_poderTargetRelation child;

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

    @JsonSerialize(using = EntityAsIdSerializer.class)
    public F_involucradoSourceRelation getParent(){
        return parent;
    }

    @JsonIgnore
    public void setParent(F_involucradoSourceRelation parent){
        this.parent = parent;
    }

    @JsonSerialize(using = EntityAsIdSerializer.class)
    public B_poderTargetRelation getChild(){
        return child;
    }

    @JsonIgnore
    public void setChild(B_poderTargetRelation child){
        this.child = child;
    }

}