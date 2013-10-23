/*
 * Copyright (c) 2011. EMC Corporation. All Rights Reserved.
 */

// Expressions.js

Ext.namespace("xcp");

Ext.define("Expression.IdFromContext",
{
	alias : 'expression.id_from_context',

	statics : {
		evaluate : function () {
			return xcp.navigationManager.currentNavigationContext.objectId;
		}
	}

});

Ext.define("xcp.expression.Generated",{
extend:"xcp.core.expr.BaseExpression",
singleton:true});

xcp.expression.Generated.assign_task_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_assign_task','Inputs.id'); }

xcp.expression.Generated.assign_task_da_userName_1 = function (context) { return this.getValueFromWidget(context,'dropdown_list','value'); }

xcp.expression.Generated.attachment_sel_da_selection_1 = function (context) { return this.getValueFromSelectionModel(context,'results_list','id'); }

xcp.expression.Generated.changeworkqueue_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_changeworkqueue','Inputs.id'); }

xcp.expression.Generated.changeworkqueue_da_queueName_1 = function (context) { return this.getValueFromWidget(context,'queue_dropdown_list','value'); }

xcp.expression.Generated.hold_task_da_holdUntil_1 = function (context) { return this.getValueFromWidget(context,'hold_until','value'); }

xcp.expression.Generated.hold_task_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_hold_task','Inputs.id'); }

xcp.expression.Generated.reassign_task_da_id_1 = function (context) { return this.getValueFromActionFlowInputModel(context,'xcp_reassign_task','Inputs.id'); }

xcp.expression.Generated.reassign_task_da_userName_1 = function (context) { return this.getValueFromWidget(context,'dropdown_list','value'); }

xcp.expression.Generated.selector_content_da_selection_1 = function (context) { return this.getValueFromSelectionModel(context,'results_list','id'); }

xcp.expression.Generated.selector_folder_da_selection_1 = function (context) { return this.getValueFromSelectionModel(context,'results_list','id'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_departamento_1 = function (context) { return this.getValueFromWidget(context,'departamento','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_distrito_1 = function (context) { return this.getValueFromWidget(context,'distrito','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_id_involucrado_1 = function (context) { return this.getValueFromModel(context,'uif_f_involucrado','id'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_nombre_via_1 = function (context) { return this.getValueFromWidget(context,'nombre_via','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_nombre_zona_1 = function (context) { return this.getValueFromWidget(context,'nombre_zona','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_numero_exteriores_1 = function (context) { return this.getValueFromWidget(context,'numero_exteriores','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_numero_interiores_1 = function (context) { return this.getValueFromWidget(context,'numero_interiores','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_pais_1 = function (context) { return this.getValueFromWidget(context,'pais','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_provincia_1 = function (context) { return this.getValueFromWidget(context,'provincia','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_tipo_numero_1 = function (context) { return this.getValueFromWidget(context,'tipo_numero','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_tipo_via_1 = function (context) { return this.getValueFromWidget(context,'tipo_via','value'); }

xcp.expression.Generated.uif_agregar_direcci_n_da_def_invoke_stateless_processcrear_direccion_en__initiate_tipo_zona_1 = function (context) { return this.getValueFromWidget(context,'tipo_zona','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_apellido_materno_1 = function (context) { return this.getValueFromWidget(context,'apellido_materno','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_apellido_paterno_1 = function (context) { return this.getValueFromWidget(context,'apellido_paterno','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_departamento_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'departamento_nacimiento','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_distrito_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'distrito_nacimiento','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_fecha_defuncion_1 = function (context) { return this.getValueFromWidget(context,'fecha_defuncion','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_fecha_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'fecha_nacimiento','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_id_1 = function (context) { return this.getValueFromModel(context,'uif_f_involucrado','id'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_nombres_1 = function (context) { return this.getValueFromWidget(context,'nombres','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_pais_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'pais_nacimiento','value'); }

xcp.expression.Generated.uif_editar_involucrado_da_def_update_dm_folder_provincia_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'provincia_nacimiento','value'); }

xcp.expression.Generated.uif_editar_involucrado_obtener_direcciones_input_object_id_1 = function (context) { return this.getValueFromModel(context,'uif_f_involucrado','id'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_apellido_materno_1 = function (context) { return this.getValueFromWidget(context,'txt_apellido_materno','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_apellido_paterno_1 = function (context) { return this.getValueFromWidget(context,'txt_apellido_paterno','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_departamento_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'ddl_departamento','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_distrito_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'ddl_distrito','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_nombres_1 = function (context) { return this.getValueFromWidget(context,'txt_nombres','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_pais_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'ddl_pais_nacimiento','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_profesiones_1 = function (context) { return this.getValueFromWidget(context,'ddl_profesiones','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_provincia_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'ddl_provincia','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_razon_social_1 = function (context) { return this.getValueFromWidget(context,'txt_razon_social','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_tipo_persona_1 = function (context) { return this.getValueFromWidget(context,'ddl_tipo_persona','value'); }

xcp.expression.Generated.uif_nuevo_involucrado_ddl_tipo_persona_value_1 = function (context) { return 'NATURAL'; }

xcp.expression.Generated.uif_nuevo_involucrado_txt_apellido_materno_hidden_1 = function (context) { return this.getValueFromWidget(context,'ddl_tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_nuevo_involucrado_txt_apellido_paterno_hidden_1 = function (context) { return this.getValueFromWidget(context,'ddl_tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_nuevo_involucrado_txt_nombres_hidden_1 = function (context) { return this.getValueFromWidget(context,'ddl_tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_nuevo_involucrado_txt_razon_social_hidden_1 = function (context) { return this.getValueFromWidget(context,'ddl_tipo_persona','value') == 'NATURAL'; }

