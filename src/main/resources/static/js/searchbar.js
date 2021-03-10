
          var submitIcon = $('.searchbox-icon');
            var inputBox = $('.form-control');
            var vamonos = $('#vamonos');
            var searchBox = $('.searchbox');
            var isOpen = false;
            
            
            vamonos.click(function(){                       	
            	var opc = $("#opcSearch").val();            	
            	location.href = $("#urlenviar").val()+$("#select").val()+'/'+$("#btn-search").val();
            	
            });
            submitIcon.click(function(){
                if(isOpen == false){
                    searchBox.addClass('searchbox-open');
                    inputBox.focus();
                    isOpen = true;
                    
                } else {                	
                    searchBox.removeClass('searchbox-open');
                    inputBox.focusout();
                    isOpen = false;
                    
                }
            });  
             submitIcon.mouseup(function(){
                    return false;
                });
            searchBox.mouseup(function(){
                    return false;
                });
            $(document).mouseup(function(){
                    if(isOpen == true){
                        $('.searchbox-icon').css('display','block');
                        
                        submitIcon.click();
                    }
                });
        
            function buttonUp(){
                var inputVal = $('.form-control').val();
                inputVal = $.trim(inputVal).length;
                if( inputVal !== 0){
                    $('.searchbox-icon').css('display','none');
                } else {
                	
                    $('.form-control').val('');
                    $('.searchbox-icon').css('display','block');
                }                                    
                
                $('#formsearch').attr('action', $("#urlenviar").val()+$("#select").val()+'/'+$("#btn-search").val());}