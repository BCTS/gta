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

xcp.expression.Generated.uif_agregar_nuevo_invol_apellido_materno_hidden_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_apellido_paterno_hidden_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_apellido_materno_1 = function (context) { return this.getValueFromWidget(context,'apellido_materno','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_apellido_paterno_1 = function (context) { return this.getValueFromWidget(context,'apellido_paterno','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_departamento_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'departamento','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_distrito_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'distrito','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_fecha_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'fecha_nacimiento','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_nombres_1 = function (context) { return this.getValueFromWidget(context,'nombres','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_pais_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'pais','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_profesiones_1 = function (context) { return this.getValueFromWidget(context,'profesiones','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_provincia_nacimiento_1 = function (context) { return this.getValueFromWidget(context,'provincia','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_razon_social_1 = function (context) { return this.getValueFromWidget(context,'razon_social','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_da_def_invoke_stateless_processcrear_nuevo_involuc_initiate_tipo_persona_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_departamento_disabled_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA' ||  != 'Peru'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_distrito_disabled_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA' ||  != 'Peru'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_nombres_hidden_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_obtener_lista_distr_initiate_staless_ds_departamento_1 = function (context) { return this.getValueFromWidget(context,'departamento','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_obtener_lista_distr_initiate_staless_ds_provincia_1 = function (context) { return this.getValueFromWidget(context,'provincia','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_obtener_lista_provi_initiate_staless_ds_departamento_1 = function (context) { return this.getValueFromWidget(context,'departamento','value'); }

xcp.expression.Generated.uif_agregar_nuevo_invol_pais_disabled_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_provincia_disabled_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'JURIDICA' ||  != 'Peru'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_razon_social_hidden_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value') == 'NATURAL'; }

xcp.expression.Generated.uif_agregar_nuevo_invol_tipo_persona_value_1 = function (context) { return 'NATURAL'; }

xcp.expression.Generated.uif_busqueda_de_involuc_buscar_involucrados_input_fullname_1 = function (context) { return this.getValueFromWidget(context,'nombre_completo','value'); }

xcp.expression.Generated.uif_busqueda_de_involuc_buscar_involucrados_input_tipo_persona_1 = function (context) { return this.getValueFromWidget(context,'tipo_persona','value'); }

xcp.expression.Generated.uif_busqueda_de_involuc_buscar_involucrados_q_1 = function (context) { return this.getValueFromWidget(context,'text_input','value'); }

