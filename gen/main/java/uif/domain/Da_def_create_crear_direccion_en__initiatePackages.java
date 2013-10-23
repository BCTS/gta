package uif.domain;

import com.emc.xcp.services.process.annotation.ProcessPackage;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import uif.domain.Da_def_create_crear_direccion_en__initiateUif_b_direccionInput;
import uif.domain.Da_def_create_crear_direccion_en__initiateUif_f_involucradoInput;


@JsonPropertyOrder(alphabetic = true)
public class Da_def_create_crear_direccion_en__initiatePackages {

    @ProcessPackage(name = "direccion")
    private Da_def_create_crear_direccion_en__initiateUif_b_direccionInput direccion;

    @ProcessPackage(name = "involucrado")
    private Da_def_create_crear_direccion_en__initiateUif_f_involucradoInput involucrado;

    public Da_def_create_crear_direccion_en__initiateUif_b_direccionInput getDireccion(){
        return direccion;
    }

    public void setDireccion(Da_def_create_crear_direccion_en__initiateUif_b_direccionInput direccion){
        this.direccion = direccion;
    }

    public Da_def_create_crear_direccion_en__initiateUif_f_involucradoInput getInvolucrado(){
        return involucrado;
    }

    public void setInvolucrado(Da_def_create_crear_direccion_en__initiateUif_f_involucradoInput involucrado){
        this.involucrado = involucrado;
    }

}