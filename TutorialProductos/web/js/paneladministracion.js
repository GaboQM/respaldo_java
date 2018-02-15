/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function(){
   $('tr #btn-eliminar').click(function(e){
      e.preventDefault();
      var opcion = confirm("Desea Eliminar el producto");
      
      if(opcion){
           var fila = $(this).parent().parent();           
           var idproducto  = fila.find('#id_producto').text();      
           var data = {idProducto:idproducto};
           $.post("deleteProducto", data, function(res, est, jqXHR){
               alert(res);
               fila.remove();
           });
      }    
   });
   
   $('#btnmodificarproducto').click(function(e){
       e.preventDefault();
       var data = $('#frmmodificar').serialize();       
       $.post("updateProducto", data, function(res, est, jqXHR){
           alert(res);
       });
   });
   
   
});
