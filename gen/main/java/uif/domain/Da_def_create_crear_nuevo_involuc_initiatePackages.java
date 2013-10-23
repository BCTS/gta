package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessPackage;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import uif.domain.Da_def_create_crear_nuevo_involuc_initiateUif_f_involucradoInput;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_crear_nuevo_involuc_initiatePackages {

    @ProcessPackage(name = "involucrado")
    private Da_def_create_crear_nuevo_involuc_initiateUif_f_involucradoInput involucrado;

    public Da_def_create_crear_nuevo_involuc_initiateUif_f_involucradoInput getInvolucrado(){
        return involucrado;
    }

    public void setInvolucrado(Da_def_create_crear_nuevo_involuc_initiateUif_f_involucradoInput involucrado){
        this.involucrado = involucrado;
    }

}