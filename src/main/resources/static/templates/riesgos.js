window.onload = function() {
			document.getElementById("tab_Famil").click();
		
		};

		
		
		
$(document).ready(function() {
	//console.log("Ga");	
	$("#id_cargo").change(function(){
		if ($.fn.DataTable.isDataTable('#tbl_ListaFamil')){
	        $('#tbl_ListaFamil').dataTable().fnDestroy();
	    }
			listarRiesgos2(); 
	});

	
	$( "#tab_Famil" ).on( "click", function() {
		if ($.fn.DataTable.isDataTable('#tbl_ListaFamil')){
	        $('#tbl_ListaFamil').dataTable().fnDestroy();
	    }
			listarRiesgos(); 			
    } );
	
	$( "#tab_Clase" ).on( "click", function() {
		if ($.fn.DataTable.isDataTable('#tbl_ListaClase')){
	        $('#tbl_ListaClase').dataTable().fnDestroy();
	    }
		listarTipoRiesgos();
    } );
	
	$( "#tab_Prove" ).on( "click", function() {
		if ($.fn.DataTable.isDataTable('#tbl_ListaEvaluacionRiesgo')){
	        $('#tbl_ListaEvaluacionRiesgo').dataTable().fnDestroy();
	    }
		listarEvaluacionRiesgo();
    } );
	
	$( "#tab_Categ" ).on( "click", function() {
		if ($.fn.DataTable.isDataTable('#tbl_ListaCateg')){
	        $('#tbl_ListaCateg').dataTable().fnDestroy();
	    }
		listarTipoTareas();
    } );
	
	$( "#tab_Marca" ).on( "click", function() {
		if ($.fn.DataTable.isDataTable('#tbl_ListaMarca')){
	        $('#tbl_ListaMarca').dataTable().fnDestroy();
	    }
		listarControlesRiesgo();
    } );
	
	$( "#tab_Tipo" ).on( "click", function() {
		if ($.fn.DataTable.isDataTable('#tbl_ListaTipos')){
	        $('#tbl_ListaTipos').dataTable().fnDestroy();
	    }
		listarEquipoEvaluador();
    } );

	function listarRiesgos2(){
		
		 $('#tbl_ListaFamil').DataTable( {

		    	//"ajax": 'riesgos/listar'
		    	"ajax":{
		    		"url": "../riesgos/listar2",
		    		"dataSrc": "",
		    		 "data":{"id":$("#id_cargo").val()}
		    		},
		    	
		    	"columns": [
		    			{"data":"id",
		    				render:function(data){
		    					return `<button name="EDITAR" onclick="modal('/riesgos/form/`+data+`','Riesgos')" id="1" type="button" title="EDITAR" style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
		                       <i class="fas fa-edit"></i></button>
		                       <button type="button" onclick="deleteRegister('/riesgos/eliminar/`+data+`')"   title="ELIMINAR" style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
		                        <i class="fas fa-trash"></i></button>
		                         

		                        </div>`
		    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
		    				}},
		               { "data": "id" },
		               { "data": "nombre2"},
		               { "data": "nivelRiesgo" },
		               { "data": "peligro" },
		               { "data": "enventoPeligroso" },
		               { "data": "consecuencias" },
		               { "data": "vinculoLegal" },
		               { "data": "simbologia",
		       			render:function(data){
		       				return '<img src="'+'/riesgos/uploads/simbologia/'+data+'" style="width:50px;height:50px">';
		       			}
		       			}
		              ],
		              columnDefs: [{targets: 3,
		                    render: function ( data, type, row ) {
		                      var color = 'badge badge-success';
		                      if (data == 'BAJO') {
		                        color = 'badge badge-success';
		                      } 
		                      if (data == 'MEDIO') {
		                        color = 'badge badge-warning active';
		                      }
		                      if (data == 'ALTO') {
		                    	  color = 'badge badge-danger active';
		                      }
		                   
		                      return '<label><span class="' + color + '">' + data + '</span></label>';
		                    }
		               }],
		              "bFilter": true,
		              "bSort": true,
		              "bLengthChange": 10,
		              "processing": true,
		              "scrollY": false,
		              "scrollCollapse": false,
		              "scrollX": false,
		              "bAutoWidth": true,
		              "bPaginate": true,
		              "bInfo": false,
		              dom: 'Bfrtip',
		              buttons: [
		                  
		            	  {extend: 'excelHtml5','title': 'Riesgos'},
		                  { extend: 'pdfHtml5','title': 'Riesgos'}
		              ]
		          
		    	
		              
		        		
		    } );
		 
		 $( "#click-opcion-riesgo" ).click();
				
	}
	
	function listarRiesgos(){
		
		 $('#tbl_ListaFamil').DataTable( {

		    	//"ajax": 'riesgos/listar'
		    	"ajax":{
		    		"url": "../riesgos/listar",
		    		"dataSrc": ""
		    		},
		    	
		    	"columns": [
		    			{"data":"id",
		    				render:function(data){
		    					return `<button name="EDITAR" onclick="modal('/riesgos/form/`+data+`','Riesgos')" id="1" type="button" title="EDITAR" style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
		                       <i class="fas fa-edit"></i></button>
		                       <button type="button" onclick="deleteRegister('/riesgos/eliminar/`+data+`')"   title="ELIMINAR" style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
		                        <i class="fas fa-trash"></i></button>
		                         

		                        </div>`
		    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
		    				}},
		               { "data": "id" },
		               { "data": "nombre2"},
		               { "data": "nivelRiesgo" },
		               { "data": "peligro" },
		               { "data": "enventoPeligroso" },
		               { "data": "consecuencias" },
		               { "data": "vinculoLegal" },
		               { "data": "simbologia",
		       			render:function(data){
		       				return '<img src="'+'/riesgos/uploads/simbologia/'+data+'" style="width:50px;height:50px">';
		       			}
		       			}
		              ],
		              columnDefs: [{targets: 3,
		                    render: function ( data, type, row ) {
		                      var color = 'badge badge-success';
		                      if (data == 'BAJO') {
		                        color = 'badge badge-success';
		                      } 
		                      if (data == 'MEDIO') {
		                        color = 'badge badge-warning active';
		                      }
		                      if (data == 'ALTO') {
		                    	  color = 'badge badge-danger active';
		                      }
		                   
		                      return '<label><span class="' + color + '">' + data + '</span></label>';
		                    }
		               }],
		              "bFilter": true,
		              "bSort": true,
		              "bLengthChange": 10,
		              "processing": true,
		              "scrollY": false,
		              "scrollCollapse": false,
		              "scrollX": false,
		              "bAutoWidth": true,
		              "bPaginate": true,
		              "bInfo": false,
		              dom: 'Bfrtip',
		              buttons: [
		                  
		            	  {extend: 'excelHtml5','title': 'Riesgos'},
		                  { extend: 'pdfHtml5','title': 'Riesgos'}
		              ]
		          
		    	
		              
		        		
		    } );
		 
		 $( "#click-opcion-riesgo" ).click();
				
	}

	function listarTipoRiesgos(){
		
		$('#tbl_ListaClase').DataTable( {
	    	
	    	//"ajax": 'riesgos/listar'
	    	"ajax":{
	    		"url": "../tipo-riesgos/listar",
	    		"dataSrc": ""
	    		},
	    	
	    	"columns": [
	    			{"data":"id",
	    				render:function(data){
	    					return `<button name="EDITAR" onclick="modal('/tipo-riesgos/form/`+data+`','Nuevo Tipo Riesgo')" id="1" type="button" title="EDITAR" style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
	                       <i class="fas fa-edit"></i></button>
	                       <button type="button" onclick="deleteRegister('/tipo-riesgos/eliminar/`+data+`')"   title="ELIMINAR " style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
	                        <i class="fas fa-trash"></i></button></div>`
	    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
	    				}},
	               { "data": "id" },
	               { "data": "nombre"},
	               { "data": "codigo" }
	              ],
	              
	              "bFilter": true,
	              "bSort": true,
	              "bLengthChange": 10,
	              "bAutoWidth": true,
	              "bPaginate": true,
	              "bInfo": false,
	              dom: 'Bfrtip',
	              buttons: [
	            	  {extend: 'excelHtml5','title': 'Tipos de Riesgos'},
	                  { extend: 'pdfHtml5','title': 'Tipos de Riesgos'}
	              ]
	            
	 			
	        		
	    } );
		 $( "#click-opcion-tipo" ).click();
		
	}
	
	function listarEvaluacionRiesgo(){
		 $('#tbl_ListaEvaluacionRiesgo').DataTable( {

		    	//"ajax": 'riesgos/listar'
		    	"ajax":{
		    		"url": "../evaluacion-riesgos/listar",
		    		"dataSrc": ""
		    		},
		    	
		    	"columns": [
		    			{"data":"id",
		    				render:function(data){
		    					return `<button name="EDITAR" onclick="modal('/riesgos/form/`+data+`','Riesgos')" id="1" type="button" title="EDITAR " style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
		                       <i class="fas fa-edit"></i></button>
		                       <button type="button" onclick="deleteRegister('/riesgos/eliminar/`+data+`')"   title="ELIMINAR" style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
		                        <i class="fas fa-trash"></i></button></div>`
		    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
		    				}},
		               { "data": "id" },
		               { "data": "personasExpuestas"},
		               { "data": "controlesExistentes" },
		               { "data": "capacitacionCapacidadesHumanas" },
		               { "data": "expocicionRiesgo" },
		               { "data": "severidadConsecuencia" },
		               { "data": "gradoRiesgo" },
		               { "data": "nivelRiesgo"}
		              ],
		              
		              "bFilter": true,
		              "bSort": true,
		              "bLengthChange": 10,
		              "processing": true,
		              "scrollY": false,
		              "scrollCollapse": false,
		              "scrollX": false,
		              "bAutoWidth": true,
		              "bPaginate": true,
		              "bInfo": false,
		              dom: 'Bfrtip',
		              buttons: [
		                  
		            	  {
		                      extend: 'pdfHtml5',
		                      orientation: 'landscape',
		                      title:'Evaluacion del Riesgo',
		                      pageSize: 'LEGAL',
		                      messageTop: 'The information in this table is copyright to Sirius Cybernetics Corp.'
		                  }
		              ]
		    	
		              
		        		
		    } );
		 
		 $( "#click-opcion-riesgo" ).click();
	}
	
function listarTipoTareas(){
		
		$('#tbl_ListaCateg').DataTable( {
	    	
	    	//"ajax": 'riesgos/listar'
	    	"ajax":{
	    		"url": "../tipo-tareas/listar",
	    		"dataSrc": ""
	    		},
	    	
	    	"columns": [
	    			{"data":"id",
	    				render:function(data){
	    					return `<button name="EDITAR" onclick="modal('/tipo-tareas/form/`+data+`','Nuevo Tipo Riesgo')" id="1" type="button" title="EDITAR" style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
	                       <i class="fas fa-edit"></i></button>
	                       <button type="button" onclick="deleteRegister('/tipo-tareas/eliminar/`+data+`')"   title="ELIMINAR " style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
	                        <i class="fas fa-trash"></i></button></div>`
	    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
	    				}},
	               { "data": "id" },
	               { "data": "nombre"},
	               { "data": "codigo" },
	               { "data": "descripcion" }
	              ],
	              
	              "bFilter": true,
	              "bSort": true,
	              "bLengthChange": 10,
	              "bAutoWidth": true,
	              "bPaginate": true,
	              "bInfo": false,
	              dom: 'Bfrtip',
	              buttons: [
	            	  {extend: 'excelHtml5','title': 'Tipo Tareas'},
	                  {extend: 'pdfHtml5','title': 'Tipo Tareas'}
	              ]
	            
	 			
	        		
	    } );
		 $( "#click-opcion-tipo" ).click();
		
	}

function listarEquipoEvaluador(){
	
	$('#tbl_ListaTipos').DataTable( {
    	
    	//"ajax": 'riesgos/listar'
    	"ajax":{
    		"url": "../equipo-evaluador/listar",
    		"dataSrc": ""
    		},
    	
    	"columns": [
    			{"data":"id",
    				render:function(data){
    					return `<button name="EDITAR" onclick="modal('/equipo-evaluador/form/`+data+`','Nuevo Tipo Riesgo')" id="1" type="button" title="EDITAR" style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
                       <i class="fas fa-edit"></i></button>
                       <button type="button" onclick="deleteRegister('/tipo-tareas/eliminar/`+data+`')"   title="ELIMINAR " style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
                        <i class="fas fa-trash"></i></button></div>`
    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
    				}},
               { "data": "id" },
               { "data": "nombre"},
               { "data": "cargo" }
              ],
              
              "bFilter": true,
              "bSort": true,
              "bLengthChange": 10,
              "processing": true,
              "scrollY": false,
              "scrollCollapse": false,
              "scrollX": false,
              "bAutoWidth": true,
              "bPaginate": true,
              "bInfo": false,
              dom: 'Bfrtip',
              buttons: [
            	  {extend: 'excelHtml5','title': 'Equipo Evaluador'},
                  { extend: 'pdfHtml5','title': 'Equipo Evaluador'}
                  
                 
                  
              ]
 			
        		
    } );
	 $( "#click-opcion-tipo" ).click();
	
}
	

function listarControlesRiesgo(){
	
	$('#tbl_ListaMarca').DataTable( {
    	
    	//"ajax": 'riesgos/listar'
    	"ajax":{
    		"url": "../controles-riesgo/listar",
    		"dataSrc": ""
    		},
    	
    	"columns": [
    			{"data":"id",
    				render:function(data){
    					return `<button name="EDITAR" onclick="modal('/equipo-evaluador/form/`+data+`','Nuevo Tipo Riesgo')" id="1" type="button" title="EDITAR" style="margin-left:10px;" class="btn btn-sm btn-primary mensa">
                       <i class="fas fa-edit"></i></button>
                       <button type="button" onclick="deleteRegister('/tipo-tareas/eliminar/`+data+`')"   title="ELIMINAR " style="margin-left:10px;" class="btn btn-sm btn-danger mensa">
                        <i class="fas fa-trash"></i></button></div>`
    					//onclick=" Jerarquizar.fun_CambiarEstado('A','Famil','1');"
    				}},
               { "data": "id" },
               { "data": "que"},
               { "data": "cuando" },
               { "data": "como"},
               { "data": "quien" },
               { "data": "porque"},
               { "data": "donde" }
              ],
              
              "bFilter": true,
              "bSort": true,
              "bLengthChange": 10,
              "processing": true,
              "scrollY": false,
              "scrollCollapse": false,
              "scrollX": false,
              "bAutoWidth": true,
              "bPaginate": true,
              "bInfo": false,
              dom: 'Bfrtip',
              buttons: [
            	  {extend: 'excelHtml5','title': 'Controles Riesgo'},
                  { extend: 'pdfHtml5','title': 'Controles Riesgo'}
                  
                      
              ]
 			
        		
    } );
	 $( "#click-opcion-tipo" ).click();
	
}
    	
} );