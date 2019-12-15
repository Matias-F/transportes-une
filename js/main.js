
/* JSON dynamic information consumption
******************************************/

fetch("http://my-json-server.typicode.com/Matias-F/proyecto-transporte/servicios")    
.then (function(respuesta){
    return respuesta.json();
  })
.then (function (data){
     console.log(data);
   })
.catch(function(error){
  console.log(error);
})


