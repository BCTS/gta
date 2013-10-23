
Ext.define("uif_b_financiamiento",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_financiamientos"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "entidad",
        "type" : "string"
      }, {
        "name" : "tipo_credito",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "importe",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "calificacion",
        "type" : "string"
      }, {
        "name" : "tipo_garantia",
        "type" : "string"
      }, {
        "name" : "garantia",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_financiamiento_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_financiamientos/template"
      },
      "fields" : [ {
        "name" : "entidad",
        "type" : "string"
      }, {
        "name" : "tipo_credito",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "importe",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "calificacion",
        "type" : "string"
      }, {
        "name" : "tipo_garantia",
        "type" : "string"
      }, {
        "name" : "garantia",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_poders"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "tipo_poder",
        "type" : "string"
      }, {
        "name" : "fecha_poder",
        "type" : "string"
      }, {
        "name" : "otorgado_a",
        "type" : "string"
      }, {
        "name" : "recibido_de",
        "type" : "string"
      }, {
        "name" : "motivo",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_poder_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_poders/template"
      },
      "fields" : [ {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "tipo_poder",
        "type" : "string"
      }, {
        "name" : "fecha_poder",
        "type" : "string"
      }, {
        "name" : "otorgado_a",
        "type" : "string"
      }, {
        "name" : "recibido_de",
        "type" : "string"
      }, {
        "name" : "motivo",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_fuentelicita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_fuentelicitas"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "nombre",
        "type" : "string"
      }, {
        "name" : "importe",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_fuentelicita_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_fuentelicitas/template"
      },
      "fields" : [ {
        "name" : "nombre",
        "type" : "string"
      }, {
        "name" : "importe",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_direccions"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "ciudad",
        "type" : "string"
      }, {
        "name" : "codigo_postal",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_direccion_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_direccions/template"
      },
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "ciudad",
        "type" : "string"
      }, {
        "name" : "codigo_postal",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_activos"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "actual",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "transferidos",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "total",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_activo_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_activos/template"
      },
      "fields" : [ {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "actual",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "transferidos",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "total",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_viajes"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "cantidad",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "tipo_movimiento",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_viaje_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_viajes/template"
      },
      "fields" : [ {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "cantidad",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "tipo_movimiento",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_accions"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "empresa",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "capital",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "participacion_porcentaje",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "participacion_soles",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "capital_origen_conocido",
        "useNull" : true,
        "type" : "boolean"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_accion_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_accions/template"
      },
      "fields" : [ {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "empresa",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "capital",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "participacion_porcentaje",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "participacion_soles",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "capital_origen_conocido",
        "useNull" : true,
        "type" : "boolean"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_importacions"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "fob",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "cif",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "adv",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "arancel",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "pais_origen",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_importacion_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_importacions/template"
      },
      "fields" : [ {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "fob",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "cif",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "adv",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "arancel",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "pais_origen",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_reportecuenta_ros",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_reportecuenta_ross"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "ingresos",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "egresos",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "saldo",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_reportecuenta_ros_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_reportecuenta_ross/template"
      },
      "fields" : [ {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "ingresos",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "egresos",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "saldo",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_RootBO",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/xcp_RootBOs"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_RootBO_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/xcp_RootBOs/template"
      },
      "fields" : [ {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_declaracionjurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_declaracionjuradas"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "importe",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "ventas",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "utilidad",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "tipo_renta",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_declaracionjurada_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_declaracionjuradas/template"
      },
      "fields" : [ {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "importe",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "ventas",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "utilidad",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "tipo_renta",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_identificacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_identificacions"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "vericidad",
        "type" : "string"
      }, {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_identificacion_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_identificacions/template"
      },
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "vericidad",
        "type" : "string"
      }, {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_telefonos"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "extension",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_telefono_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_telefonos/template"
      },
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "extension",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_exportacions"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "fob",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_exportacion_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_exportacions/template"
      },
      "fields" : [ {
        "name" : "anho",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "fob",
        "useNull" : true,
        "type" : "float"
      }, {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_cuenta_bancaria",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_cuenta_bancarias"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "banco",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "fecha_apertura",
        "type" : "string"
      }, {
        "name" : "fecha_cierre",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_b_cuenta_bancaria_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_b_cuenta_bancarias/template"
      },
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "banco",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "fecha_apertura",
        "type" : "string"
      }, {
        "name" : "fecha_cierre",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_dm_folder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "authors",
        "type" : "array"
      }, {
        "name" : "keywords",
        "type" : "array"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_folder_path",
        "type" : "array"
      }, {
        "name" : "r_link_cnt",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      }, "links" ]
    }
);

Ext.define("uif_f_carpeta",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_f_carpetas"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "authors",
        "type" : "array"
      }, {
        "name" : "keywords",
        "type" : "array"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_folder_path",
        "type" : "array"
      }, {
        "name" : "r_link_cnt",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      }, "links" ]
    }
);

Ext.define("uif_r_inv_financiamien_Financiamiento",
    {
      "extend" : "xcp.data.BaseRelationModel",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados/{id}/Financiamiento"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "parent",
        "type" : "uif_f_involucrado"
      }, {
        "name" : "child",
        "type" : "uif_b_financiamiento"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "genero",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "fecha_defuncion",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "estado_civil",
        "type" : "string"
      }, {
        "name" : "profesion",
        "type" : "array"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      }, {
        "name" : "alias",
        "type" : "array"
      }, {
        "name" : "falsos_nombres",
        "type" : "array"
      }, {
        "name" : "idiomas",
        "type" : "array"
      }, {
        "name" : "email",
        "type" : "array"
      }, {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "fullname",
        "type" : "string"
      }, {
        "name" : "authors",
        "type" : "array"
      }, {
        "name" : "keywords",
        "type" : "array"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_folder_path",
        "type" : "array"
      }, {
        "name" : "r_link_cnt",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      }, {
        "name" : "Financiamiento",
        "type" : "uif_r_inv_financiamien_Financiamiento"
      }, "links" ]
    }
);

Ext.define("xcp_folderlist_0",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest_folder",
        "url" : "application/xcp_dm_folders"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "authors",
        "type" : "array"
      }, {
        "name" : "keywords",
        "type" : "array"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_folder_path",
        "type" : "array"
      }, {
        "name" : "r_link_cnt",
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      }, {
        "name" : "icon",
        "type" : "string"
      }, "links" ]
    }
);

Ext.define("xcp_dm_document",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_documents"
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "owner_name",
        "type" : "string"
      }, {
        "name" : "a_status",
        "type" : "string"
      }, {
        "name" : "a_content_type",
        "type" : "string"
      }, {
        "name" : "authors",
        "type" : "array"
      }, {
        "name" : "keywords",
        "type" : "array"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "i_chronicle_id",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "i_folder_id",
        "type" : "array"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      }, "links" ]
    }
);

Ext.define("xcp_currenttask",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "act_name",
        "type" : "string"
      }, {
        "name" : "qitem_id",
        "type" : "string"
      }, {
        "name" : "creation_date",
        "type" : "string"
      }, {
        "name" : "due_date",
        "type" : "string"
      }, {
        "name" : "performer",
        "type" : "string"
      }, {
        "name" : "performer_address",
        "type" : "string"
      }, {
        "name" : "priority",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "state",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "name",
        "type" : "string"
      }, {
        "name" : "task_subject",
        "type" : "string"
      }, {
        "name" : "queue_name",
        "type" : "string"
      }, {
        "name" : "instructions",
        "type" : "string"
      }, {
        "name" : "description",
        "type" : "string"
      }, {
        "name" : "received_date",
        "type" : "string"
      }, {
        "name" : "received_from",
        "type" : "string"
      }, {
        "name" : "requirements",
        "type" : "string"
      }, {
        "name" : "isdelegable",
        "useNull" : true,
        "type" : "boolean"
      }, {
        "name" : "isrepeatable",
        "useNull" : true,
        "type" : "boolean"
      } ]
    }
);

Ext.define("xcp_taskworkflow",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "correlation_identifier",
        "type" : "string"
      }, {
        "name" : "process_id",
        "type" : "string"
      }, {
        "name" : "r_creater_name",
        "type" : "string"
      }, {
        "name" : "r_start_date",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "r_runtime_state",
        "useNull" : true,
        "type" : "int"
      }, {
        "name" : "supervisor_name",
        "type" : "string"
      }, {
        "name" : "supervisor_address",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_ExecutionData",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "currenttask",
        "type" : "xcp_currenttask"
      }, {
        "name" : "taskworkflow",
        "type" : "xcp_taskworkflow"
      } ]
    }
);

Ext.define("uif_crear_nuevo_involuc_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "profesiones",
        "type" : "array"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "razon_social",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_crear_nuevo_involuc_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_crear_nuevo_involuc_initiate_processVariables"
      } ]
    }
);

Ext.define("xcp_user_from_queue_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "queue_name",
        "type" : "string"
      }, {
        "name" : "user_list",
        "type" : "array"
      } ]
    }
);

Ext.define("xcp_user_from_queue_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "xcp_user_from_queue_initiate_processVariables"
      } ]
    }
);

Ext.define("xcp_userorgroup_selecti_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "user_group_name",
        "type" : "array"
      } ]
    }
);

Ext.define("xcp_userorgroup_selecti_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "xcp_userorgroup_selecti_processVariables"
      } ]
    }
);

Ext.define("xcp_activity_list_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "act_name",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "output_activity_names",
        "type" : "array"
      }, {
        "name" : "port_type",
        "type" : "string"
      }, {
        "name" : "process_id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_activity_list_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "xcp_activity_list_initiate_processVariables"
      } ]
    }
);

Ext.define("uif_obtener_lista_provi_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "provincias",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_obtener_lista_provi_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_obtener_lista_provi_initiate_processVariables"
      } ]
    }
);

Ext.define("uif_obtener_lista_de_pa_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "pais",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_obtener_lista_de_pa_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_obtener_lista_de_pa_initiate_processVariables"
      } ]
    }
);

Ext.define("xcp_queue_list_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "queuelist",
        "type" : "array"
      } ]
    }
);

Ext.define("xcp_queue_list_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "xcp_queue_list_initiate_processVariables"
      } ]
    }
);

Ext.define("xcp_taskhistory_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "activity_name",
        "type" : "array"
      }, {
        "name" : "date",
        "type" : "array"
      }, {
        "name" : "performer",
        "type" : "array"
      }, {
        "name" : "process_instance_id",
        "type" : "string"
      }, {
        "name" : "status",
        "type" : "array"
      } ]
    }
);

Ext.define("xcp_taskhistory_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "xcp_taskhistory_initiate_processVariables"
      } ]
    }
);

Ext.define("uif_obtener_lista_de_de_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "departamentos",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_obtener_lista_de_de_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_obtener_lista_de_de_initiate_processVariables"
      } ]
    }
);

Ext.define("uif_crear_direccion_en__initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "id_involucrado",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_crear_direccion_en__initiate_processPackages",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "direccion",
        "type" : "uif_b_direccion_template"
      } ]
    }
);

Ext.define("uif_crear_direccion_en__initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
            "direccion" : {
            }
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_crear_direccion_en__initiate_processVariables"
      }, {
        "name" : "processPackages",
        "type" : "uif_crear_direccion_en__initiate_processPackages"
      } ]
    }
);

Ext.define("uif_obtener_lista_distr_initiate_processVariables",
    {
      "extend" : "xcp.data.IdLessModel",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distritos",
        "type" : "array"
      }, {
        "name" : "provincia",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_obtener_lista_distr_initiate_template",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "data" : {
          "processPackages" : {
          },
          "processVariables" : {
          }
        },
        "type" : "memory"
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_obtener_lista_distr_initiate_processVariables"
      } ]
    }
);

Ext.define("xcp_da_def_create_dm_folder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders",
        "extraParams" : {
          "type" : "xcp_da_def_create_dm_folder"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_update_dm_folder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders",
        "extraParams" : {
          "type" : "xcp_da_def_update_dm_folder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_delete_dm_folder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders",
        "extraParams" : {
          "type" : "xcp_da_def_delete_dm_folder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_f_carpeta",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_carpetas",
        "extraParams" : {
          "type" : "uif_da_def_create_f_carpeta"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_f_carpeta",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_carpetas",
        "extraParams" : {
          "type" : "uif_da_def_update_f_carpeta"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_f_carpeta",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_carpetas",
        "extraParams" : {
          "type" : "uif_da_def_delete_f_carpeta"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados",
        "extraParams" : {
          "type" : "uif_da_def_create_f_involucrado"
        }
      },
      "fields" : [ {
        "name" : "alias",
        "type" : "array"
      }, {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "email",
        "type" : "array"
      }, {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "estado_civil",
        "type" : "string"
      }, {
        "name" : "falsos_nombres",
        "type" : "array"
      }, {
        "name" : "fecha_defuncion",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "fullname",
        "type" : "string"
      }, {
        "name" : "genero",
        "type" : "string"
      }, {
        "name" : "idiomas",
        "type" : "array"
      }, {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "profesion",
        "type" : "array"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados",
        "extraParams" : {
          "type" : "uif_da_def_update_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "alias",
        "type" : "array"
      }, {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "email",
        "type" : "array"
      }, {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "estado_civil",
        "type" : "string"
      }, {
        "name" : "falsos_nombres",
        "type" : "array"
      }, {
        "name" : "fecha_defuncion",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "fullname",
        "type" : "string"
      }, {
        "name" : "genero",
        "type" : "string"
      }, {
        "name" : "idiomas",
        "type" : "array"
      }, {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "profesion",
        "type" : "array"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados",
        "extraParams" : {
          "type" : "uif_da_def_delete_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_id_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_ids",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_id_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_id_b_identificacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_ids",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_id_b_identificacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_id",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_ids",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_id"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_id",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_ids",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_id"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_cuenta_reporte_b_cuenta_bancaria",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_cuenta_reportes",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_cuenta_reporte_b_cuenta_bancaria"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_cuenta_reporte_b_reportecuenta_ros",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_cuenta_reportes",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_cuenta_reporte_b_reportecuenta_ros"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_cuenta_reporte",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_cuenta_reportes",
        "extraParams" : {
          "type" : "uif_da_def_update_r_cuenta_reporte"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_cuenta_reporte",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_cuenta_reportes",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_cuenta_reporte"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_direccion_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_direccions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_direccion_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_direccion_b_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_direccions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_direccion_b_direccion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_direccions",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_direccion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_direccions",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_direccion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_exportacion_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_exportacion_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_exportacion_b_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_exportacion_b_exportacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_exportacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_exportacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_importacion_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_importacions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_importacion_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_importacion_b_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_importacions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_importacion_b_importacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_importacions",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_importacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_importacions",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_importacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_poder_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_poders",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_poder_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_poder_b_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_poders",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_poder_b_poder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_poders",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_poder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_poders",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_poder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_telefono_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_telefono_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_telefono_b_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_telefono_b_telefono"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_telefono"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_telefono"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_accion_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_accions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_accion_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_accion_b_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_accions",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_accion_b_accion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_accions",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_accion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_accions",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_accion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_fuente_licita_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_fuente_licitas",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_fuente_licita_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_fuente_licita_fuentelicita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_fuente_licitas",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_fuente_licita_fuentelicita"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_fuente_licita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_fuente_licitas",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_fuente_licita"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_fuente_licita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_fuente_licitas",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_fuente_licita"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_cuenta_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_cuentas",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_cuenta_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_cuenta_b_cuenta_bancaria",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_cuentas",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_cuenta_b_cuenta_bancaria"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_cuenta",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_cuentas",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_cuenta"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_cuenta",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_cuentas",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_cuenta"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_viaje_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_viajes",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_viaje_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_viaje_b_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_viajes",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_viaje_b_viaje"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_viajes",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_viaje"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_viajes",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_viaje"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_financiamien_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_financiamiens",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_financiamien_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_financiamien",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_financiamiens",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_financiamien"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_financiamien",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_financiamiens",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_financiamien"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_dec_jurada_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_dec_juradas",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_dec_jurada_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_dec_jurada_b_declaracionjurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_dec_juradas",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_dec_jurada_b_declaracionjurada"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_dec_jurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_dec_juradas",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_dec_jurada"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_dec_jurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_dec_juradas",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_dec_jurada"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_activo_f_involucrado",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_activos",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_activo_f_involucrado"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_relate_r_inv_activo_b_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_activos",
        "extraParams" : {
          "type" : "uif_da_def_relate_r_inv_activo_b_activo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_r_inv_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_activos",
        "extraParams" : {
          "type" : "uif_da_def_update_r_inv_activo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_r_inv_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/relationships/uif_r_inv_activos",
        "extraParams" : {
          "type" : "uif_da_def_delete_r_inv_activo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_import_dm_document",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_documents",
        "extraParams" : {
          "type" : "xcp_da_def_import_dm_document"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "a_content_type",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_update_dm_document",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_documents",
        "extraParams" : {
          "type" : "xcp_da_def_update_dm_document"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_delete_dm_document",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_documents",
        "extraParams" : {
          "type" : "xcp_da_def_delete_dm_document"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_poders",
        "extraParams" : {
          "type" : "uif_da_def_create_b_poder"
        }
      },
      "fields" : [ {
        "name" : "fecha_poder",
        "type" : "string"
      }, {
        "name" : "motivo",
        "type" : "string"
      }, {
        "name" : "otorgado_a",
        "type" : "string"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "recibido_de",
        "type" : "string"
      }, {
        "name" : "tipo_poder",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_poders",
        "extraParams" : {
          "type" : "uif_da_def_update_b_poder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "fecha_poder",
        "type" : "string"
      }, {
        "name" : "motivo",
        "type" : "string"
      }, {
        "name" : "otorgado_a",
        "type" : "string"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "recibido_de",
        "type" : "string"
      }, {
        "name" : "tipo_poder",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_poder",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_poders",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_poder"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_fuentelicita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_fuentelicitas",
        "extraParams" : {
          "type" : "uif_da_def_create_fuentelicita"
        }
      },
      "fields" : [ {
        "name" : "importe",
        "type" : "float"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "nombre",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_fuentelicita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_fuentelicitas",
        "extraParams" : {
          "type" : "uif_da_def_update_fuentelicita"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "importe",
        "type" : "float"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "nombre",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_fuentelicita",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_fuentelicitas",
        "extraParams" : {
          "type" : "uif_da_def_delete_fuentelicita"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_direccions",
        "extraParams" : {
          "type" : "uif_da_def_create_b_direccion"
        }
      },
      "fields" : [ {
        "name" : "ciudad",
        "type" : "string"
      }, {
        "name" : "codigo_postal",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_direccions",
        "extraParams" : {
          "type" : "uif_da_def_update_b_direccion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "ciudad",
        "type" : "string"
      }, {
        "name" : "codigo_postal",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_direccion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_direccions",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_direccion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_activos",
        "extraParams" : {
          "type" : "uif_da_def_create_b_activo"
        }
      },
      "fields" : [ {
        "name" : "actual",
        "type" : "int"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "total",
        "type" : "int"
      }, {
        "name" : "transferidos",
        "type" : "int"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_activos",
        "extraParams" : {
          "type" : "uif_da_def_update_b_activo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "actual",
        "type" : "int"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "total",
        "type" : "int"
      }, {
        "name" : "transferidos",
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_activo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_activos",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_activo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_financiamiento",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_financiamientos",
        "extraParams" : {
          "type" : "uif_da_def_create_b_financiamiento"
        }
      },
      "fields" : [ {
        "name" : "calificacion",
        "type" : "string"
      }, {
        "name" : "entidad",
        "type" : "string"
      }, {
        "name" : "garantia",
        "type" : "float"
      }, {
        "name" : "importe",
        "type" : "float"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "tipo_credito",
        "type" : "string"
      }, {
        "name" : "tipo_garantia",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_financiamiento",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_financiamientos",
        "extraParams" : {
          "type" : "uif_da_def_update_b_financiamiento"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "calificacion",
        "type" : "string"
      }, {
        "name" : "entidad",
        "type" : "string"
      }, {
        "name" : "garantia",
        "type" : "float"
      }, {
        "name" : "importe",
        "type" : "float"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "tipo_credito",
        "type" : "string"
      }, {
        "name" : "tipo_garantia",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_financiamiento",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_financiamientos",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_financiamiento"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_viajes",
        "extraParams" : {
          "type" : "uif_da_def_create_b_viaje"
        }
      },
      "fields" : [ {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "cantidad",
        "type" : "int"
      }, {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "tipo_movimiento",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_viajes",
        "extraParams" : {
          "type" : "uif_da_def_update_b_viaje"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "cantidad",
        "type" : "int"
      }, {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "tipo_movimiento",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_viaje",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_viajes",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_viaje"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_accions",
        "extraParams" : {
          "type" : "uif_da_def_create_b_accion"
        }
      },
      "fields" : [ {
        "name" : "capital",
        "type" : "float"
      }, {
        "name" : "capital_origen_conocido",
        "type" : "boolean"
      }, {
        "name" : "empresa",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "participacion_porcentaje",
        "type" : "float"
      }, {
        "name" : "participacion_soles",
        "type" : "float"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_accions",
        "extraParams" : {
          "type" : "uif_da_def_update_b_accion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "capital",
        "type" : "float"
      }, {
        "name" : "capital_origen_conocido",
        "type" : "boolean"
      }, {
        "name" : "empresa",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "participacion_porcentaje",
        "type" : "float"
      }, {
        "name" : "participacion_soles",
        "type" : "float"
      }, {
        "name" : "partida_registral",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_accion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_accions",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_accion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_importacions",
        "extraParams" : {
          "type" : "uif_da_def_create_b_importacion"
        }
      },
      "fields" : [ {
        "name" : "adv",
        "type" : "float"
      }, {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "arancel",
        "type" : "float"
      }, {
        "name" : "cif",
        "type" : "float"
      }, {
        "name" : "fob",
        "type" : "float"
      }, {
        "name" : "pais_origen",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_importacions",
        "extraParams" : {
          "type" : "uif_da_def_update_b_importacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "adv",
        "type" : "float"
      }, {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "arancel",
        "type" : "float"
      }, {
        "name" : "cif",
        "type" : "float"
      }, {
        "name" : "fob",
        "type" : "float"
      }, {
        "name" : "pais_origen",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_importacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_importacions",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_importacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_reportecuenta_ros",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_reportecuenta_ross",
        "extraParams" : {
          "type" : "uif_da_def_create_b_reportecuenta_ros"
        }
      },
      "fields" : [ {
        "name" : "egresos",
        "type" : "float"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "ingresos",
        "type" : "float"
      }, {
        "name" : "saldo",
        "type" : "float"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_reportecuenta_ros",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_reportecuenta_ross",
        "extraParams" : {
          "type" : "uif_da_def_update_b_reportecuenta_ros"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "egresos",
        "type" : "float"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "ingresos",
        "type" : "float"
      }, {
        "name" : "saldo",
        "type" : "float"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_reportecuenta_ros",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_reportecuenta_ross",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_reportecuenta_ros"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_create_rootbo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_RootBOs",
        "extraParams" : {
          "type" : "xcp_da_def_create_rootbo"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_update_rootbo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_RootBOs",
        "extraParams" : {
          "type" : "xcp_da_def_update_rootbo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_delete_rootbo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_RootBOs",
        "extraParams" : {
          "type" : "xcp_da_def_delete_rootbo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_da_def_selector_rootbo",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_RootBOs",
        "extraParams" : {
          "type" : "xcp_da_def_selector_rootbo"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "selection",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_declaracionjurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_declaracionjuradas",
        "extraParams" : {
          "type" : "uif_da_def_create_b_declaracionjurada"
        }
      },
      "fields" : [ {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "importe",
        "type" : "float"
      }, {
        "name" : "tipo_renta",
        "type" : "string"
      }, {
        "name" : "utilidad",
        "type" : "float"
      }, {
        "name" : "ventas",
        "type" : "float"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_declaracionjurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_declaracionjuradas",
        "extraParams" : {
          "type" : "uif_da_def_update_b_declaracionjurada"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "importe",
        "type" : "float"
      }, {
        "name" : "tipo_renta",
        "type" : "string"
      }, {
        "name" : "utilidad",
        "type" : "float"
      }, {
        "name" : "ventas",
        "type" : "float"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_declaracionjurada",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_declaracionjuradas",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_declaracionjurada"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_identificacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_identificacions",
        "extraParams" : {
          "type" : "uif_da_def_create_b_identificacion"
        }
      },
      "fields" : [ {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "vericidad",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_identificacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_identificacions",
        "extraParams" : {
          "type" : "uif_da_def_update_b_identificacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "fecha_fin",
        "type" : "string"
      }, {
        "name" : "fecha_inicio",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "vericidad",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_identificacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_identificacions",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_identificacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_create_b_telefono"
        }
      },
      "fields" : [ {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "extension",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_update_b_telefono"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "extension",
        "type" : "string"
      }, {
        "name" : "numero",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "tipo",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_telefono",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_telefonos",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_telefono"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_create_b_exportacion"
        }
      },
      "fields" : [ {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "fob",
        "type" : "float"
      }, {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_update_b_exportacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "anho",
        "type" : "int"
      }, {
        "name" : "fob",
        "type" : "float"
      }, {
        "name" : "pais_destino",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_exportacion",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_exportacions",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_exportacion"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_b_cuenta_bancaria",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_cuenta_bancarias",
        "extraParams" : {
          "type" : "uif_da_def_create_b_cuenta_bancaria"
        }
      },
      "fields" : [ {
        "name" : "banco",
        "type" : "string"
      }, {
        "name" : "fecha_apertura",
        "type" : "string"
      }, {
        "name" : "fecha_cierre",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_update_b_cuenta_bancaria",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_cuenta_bancarias",
        "extraParams" : {
          "type" : "uif_da_def_update_b_cuenta_bancaria"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "banco",
        "type" : "string"
      }, {
        "name" : "fecha_apertura",
        "type" : "string"
      }, {
        "name" : "fecha_cierre",
        "type" : "string"
      }, {
        "name" : "moneda",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_delete_b_cuenta_bancaria",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_cuenta_bancarias",
        "extraParams" : {
          "type" : "uif_da_def_delete_b_cuenta_bancaria"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_provi_initiate_processVariables",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "provincias",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_provi_initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_provi",
        "extraParams" : {
          "type" : "uif_da_def_create_obtener_lista_provi_initiate"
        }
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_da_def_create_obtener_lista_provi_initiate_processVariables"
      }, {
        "name" : "attachments",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_de_pa_initiate_processVariables",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "pais",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_de_pa_initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_de_pa",
        "extraParams" : {
          "type" : "uif_da_def_create_obtener_lista_de_pa_initiate"
        }
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_da_def_create_obtener_lista_de_pa_initiate_processVariables"
      }, {
        "name" : "attachments",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_crear_nuevo_involuc",
        "extraParams" : {
          "type" : "stateless"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "profesiones",
        "type" : "array"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "razon_social",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_nuevo_involuc_initiate_involucrado",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_nuevo_involuc_initiate_processPackages",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "involucrado",
        "type" : "uif_da_def_create_crear_nuevo_involuc_initiate_involucrado"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_nuevo_involuc_initiate_processVariables",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "profesiones",
        "type" : "array"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "razon_social",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_nuevo_involuc_initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_crear_nuevo_involuc",
        "extraParams" : {
          "type" : "uif_da_def_create_crear_nuevo_involuc_initiate"
        }
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_da_def_create_crear_nuevo_involuc_initiate_processVariables"
      }, {
        "name" : "processPackages",
        "type" : "uif_da_def_create_crear_nuevo_involuc_initiate_processPackages"
      }, {
        "name" : "attachments",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_direccion_en__initiate_direccion",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "ciudad",
        "type" : "string"
      }, {
        "name" : "codigo_postal",
        "type" : "string"
      }, {
        "name" : "comentario",
        "type" : "string"
      }, {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_direccion_en__initiate_involucrado",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_direccion_en__initiate_processPackages",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "direccion",
        "type" : "uif_da_def_create_crear_direccion_en__initiate_direccion"
      }, {
        "name" : "involucrado",
        "type" : "uif_da_def_create_crear_direccion_en__initiate_involucrado"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_direccion_en__initiate_processVariables",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "id_involucrado",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_crear_direccion_en__initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_crear_direccion_en_",
        "extraParams" : {
          "type" : "uif_da_def_create_crear_direccion_en__initiate"
        }
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_da_def_create_crear_direccion_en__initiate_processVariables"
      }, {
        "name" : "processPackages",
        "type" : "uif_da_def_create_crear_direccion_en__initiate_processPackages"
      }, {
        "name" : "attachments",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_invoke_stateless_processcrear_direccion_en__initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_crear_direccion_en_",
        "extraParams" : {
          "type" : "stateless"
        }
      },
      "idProperty" : "id",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "id_involucrado",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_de_de_initiate_processVariables",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "departamentos",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_de_de_initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_de_de",
        "extraParams" : {
          "type" : "uif_da_def_create_obtener_lista_de_de_initiate"
        }
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_da_def_create_obtener_lista_de_de_initiate_processVariables"
      }, {
        "name" : "attachments",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_distr_initiate_processVariables",
    {
      "extend" : "xcp.data.Model",
      "fields" : [ {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "distritos",
        "type" : "array"
      }, {
        "name" : "provincia",
        "type" : "string"
      } ]
    }
);

Ext.define("uif_da_def_create_obtener_lista_distr_initiate",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "writer" : {
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_distr",
        "extraParams" : {
          "type" : "uif_da_def_create_obtener_lista_distr_initiate"
        }
      },
      "fields" : [ {
        "name" : "processVariables",
        "type" : "uif_da_def_create_obtener_lista_distr_initiate_processVariables"
      }, {
        "name" : "attachments",
        "type" : "array"
      } ]
    }
);

Ext.define("uif_obtener_lista_provi_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_provi_initiate",
        "extraParams" : {
          "type" : "uif_obtener_lista_provi_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "provincias",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_userorgroup_selecti_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/xcp_userorgroup_selecti",
        "extraParams" : {
          "type" : "xcp_userorgroup_selecti_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "user_group_name",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_obtener_lista_de_pa_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_de_pa_initiate",
        "extraParams" : {
          "type" : "uif_obtener_lista_de_pa_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_activity_list_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/xcp_activity_list_initiate",
        "extraParams" : {
          "type" : "xcp_activity_list_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "output_activity_names",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_obtener_lista_de_de_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_de_de_initiate",
        "extraParams" : {
          "type" : "uif_obtener_lista_de_de_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "departamentos",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_obtener_lista_distr_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/uif_obtener_lista_distr_initiate",
        "extraParams" : {
          "type" : "uif_obtener_lista_distr_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "distritos",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_queue_list_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/xcp_queue_list_initiate",
        "extraParams" : {
          "type" : "xcp_queue_list_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "queuelist",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_taskhistory_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/xcp_taskhistory_initiate",
        "extraParams" : {
          "type" : "xcp_taskhistory_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "activity_name",
        "type" : "string"
      }, {
        "name" : "date",
        "type" : "string"
      }, {
        "name" : "performer",
        "type" : "string"
      }, {
        "name" : "status",
        "type" : "int"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_user_from_queue_initiate_staless_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/processes/xcp_user_from_queue_initiate",
        "extraParams" : {
          "type" : "xcp_user_from_queue_initiate_staless_ds"
        }
      },
      "fields" : [ {
        "name" : "user_list",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_folderQuery_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/sysobject",
        "extraParams" : {
          "type" : "folderQuery"
        }
      },
      "fields" : [ {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "icon",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_link_cnt",
        "type" : "int"
      }, {
        "name" : "a_content_type",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_folder_rt_query_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders",
        "extraParams" : {
          "type" : "xcp_folder_rt_query"
        }
      },
      "fields" : [ {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "r_creator_name",
        "type" : "string"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_obtener_direcciones_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_b_direccions",
        "extraParams" : {
          "type" : "uif_obtener_direcciones"
        }
      },
      "fields" : [ {
        "name" : "pais",
        "type" : "string"
      }, {
        "name" : "departamento",
        "type" : "string"
      }, {
        "name" : "provincia",
        "type" : "string"
      }, {
        "name" : "distrito",
        "type" : "string"
      }, {
        "name" : "tipo_zona",
        "type" : "string"
      }, {
        "name" : "nombre_zona",
        "type" : "string"
      }, {
        "name" : "tipo_via",
        "type" : "string"
      }, {
        "name" : "nombre_via",
        "type" : "string"
      }, {
        "name" : "tipo_numero",
        "type" : "string"
      }, {
        "name" : "numero_exteriores",
        "type" : "string"
      }, {
        "name" : "numero_interiores",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_content_rt_query_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_documents",
        "extraParams" : {
          "type" : "xcp_content_rt_query"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "a_content_type",
        "type" : "string"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_lock_owner",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_versionHistoryQuery_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/sysobject",
        "extraParams" : {
          "type" : "versionHistoryQuery"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "r_lock_date",
        "type" : "string"
      }, {
        "name" : "r_version_label",
        "type" : "array"
      }, {
        "name" : "r_modify_date",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "r_modifier",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_networklocation_selecti_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/networkLocations",
        "extraParams" : {
          "type" : "xcp_networklocation_selecti_ds"
        }
      },
      "fields" : [ {
        "name" : "location_id",
        "type" : "string"
      }, {
        "name" : "location_name",
        "type" : "string"
      }, {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("xcp_attachment_viewer_ds_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "pplication/xcp_dm_documents",
        "extraParams" : {
          "type" : "xcp_attachment_viewer_ds"
        }
      },
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "a_content_type",
        "type" : "string"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_buscar_involucrados_outputs",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados",
        "extraParams" : {
          "type" : "uif_buscar_involucrados"
        }
      },
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "fullname",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "r_creation_date",
        "type" : "string"
      }, {
        "name" : "r_object_type",
        "type" : "string"
      }, {
        "name" : "summary",
        "type" : "string"
      }, {
        "name" : "matchingterms",
        "type" : "array"
      }, {
        "name" : "effectivePermissions",
        "type" : "auto"
      } ]
    }
);

Ext.define("uif_f_involucrado_crear_test_model",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "api" : {
          "read" : "application/uif_f_involucrados/template"
        },
        "type" : "xcp_rest",
        "url" : "application/uif_f_involucrados",
        "extraParams" : {
          "type" : "uif_da_def_create_f_involucrado"
        }
      },
      "fields" : [ {
        "name" : "alias",
        "type" : "array"
      }, {
        "name" : "apellido_materno",
        "type" : "string"
      }, {
        "name" : "apellido_paterno",
        "type" : "string"
      }, {
        "name" : "departamento_nacimiento",
        "type" : "string"
      }, {
        "name" : "distrito_nacimiento",
        "type" : "string"
      }, {
        "name" : "email",
        "type" : "array"
      }, {
        "name" : "estado",
        "type" : "string"
      }, {
        "name" : "estado_civil",
        "type" : "string"
      }, {
        "name" : "falsos_nombres",
        "type" : "array"
      }, {
        "name" : "fecha_defuncion",
        "type" : "string"
      }, {
        "name" : "fecha_nacimiento",
        "type" : "string"
      }, {
        "name" : "fullname",
        "type" : "string"
      }, {
        "name" : "genero",
        "type" : "string"
      }, {
        "name" : "idiomas",
        "type" : "array"
      }, {
        "name" : "nombres",
        "type" : "string"
      }, {
        "name" : "pais_nacimiento",
        "type" : "string"
      }, {
        "name" : "profesion",
        "type" : "array"
      }, {
        "name" : "provincia_nacimiento",
        "type" : "string"
      }, {
        "name" : "tipo_persona",
        "type" : "string"
      }, {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "folder_id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_dm_folder_base_folder_1_model",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "api" : {
          "read" : "application/xcp_dm_folders/template"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders",
        "extraParams" : {
          "type" : "xcp_da_def_create_dm_folder"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "folder_id",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp_dm_folder_base_folder_model",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "api" : {
          "read" : "application/xcp_dm_folders/template"
        },
        "type" : "xcp_rest",
        "url" : "application/xcp_dm_folders",
        "extraParams" : {
          "type" : "xcp_da_def_create_dm_folder"
        }
      },
      "fields" : [ {
        "name" : "object_name",
        "type" : "string"
      }, {
        "name" : "subject",
        "type" : "string"
      }, {
        "name" : "title",
        "type" : "string"
      }, {
        "name" : "folder_id",
        "type" : "string"
      } ]
    }
);

Ext.define("roles",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "root" : "items",
          "type" : "xcpjson"
        },
        "type" : "rest",
        "url" : "application/roles"
      },
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "name",
        "type" : "string"
      }, {
        "name" : "description",
        "type" : "string"
      }, {
        "name" : "namespace",
        "type" : "string"
      } ]
    }
);

Ext.define("role",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "reader" : {
          "type" : "json"
        },
        "type" : "rest",
        "url" : "application/role"
      },
      "fields" : [ {
        "name" : "id",
        "type" : "string"
      }, {
        "name" : "name",
        "type" : "string"
      }, {
        "name" : "description",
        "type" : "string"
      }, {
        "name" : "namespace",
        "type" : "string"
      } ]
    }
);

Ext.define("xcp.data.model.UserPreferences",
    {
      "extend" : "xcp.data.Model",
      "proxy" : {
        "type" : "xcp_rest",
        "url" : "application/currentUser/preferences",
        "extraParams" : {
          "fields" : "workflowAutoNextTask,role,delegate_task,delegateToUser,networkLocation"
        }
      },
      "fields" : [ {
        "name" : "workflowAutoNextTask",
        "type" : "string"
      }, {
        "name" : "role",
        "type" : "string"
      }, {
        "name" : "delegate_task",
        "type" : "string"
      }, {
        "name" : "delegateToUser",
        "type" : "string"
      }, {
        "name" : "networkLocation",
        "type" : "string"
      } ]
    }
);
