function deleteRegister(url,msg='¿Está Seguro de eliminar el registro?'){
    bootbox.confirm({
        message:msg,
        buttons: {
			'cancel': {
				label: 'Cancelar',
				className: 'btn btn-dark btn-sm'
			},
			'confirm':{
				label: 'Eliminar',
				className: 'btn btn-danger btn-sm'
            },
        },
        callback: function(result) {
                if (result) {
                    location.href=url;
                }
            },
    });
}

function modal(url,title,size=1000){
    let idDiv = "div" + title.replace(/\s+/g, '');
    const div = '<div id="'+idDiv+'"></div>';
    let box = bootbox.dialog({
        message: div,
        className: 'bootbox',
        title: title,
        closeButton: true
    });
    $("#"+idDiv).html(msgLoading());
    setTimeout(function(){
        const query = ajaxView(url);
        query.done(function(response) {
            box.children('.modal-dialog').css('width','auto');
            box.children('.modal-dialog').css('max-width', size+'px');
            box.children('.modal-dialog').css('margin-left','auto');
            box.children('.modal-dialog').css('margin-right','auto');
            $("#"+idDiv).html(response);
        }).fail(function(xhr, textStatus, errorThrown) {
            $("#"+idDiv).html("<span>Ocurrió un error</span>");
        }).always(function() {
        });
    },400);
}

function ajaxView(url){
    return $.ajax({
        url: url,
        type: 'GET'
    });
}

function msgLoading() {
    return `
                <div class="row">
                    <img src="/img/loading-transparent.gif" alt="loading" width="20%" class="mx-auto my-5" >
                </div>
                `;
}