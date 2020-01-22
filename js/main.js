
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



/* Dinamyc Navbar
********************/
/* When the user scrolls down, hide the navbar. When the user scrolls up, show the navbar */
let prevScrollpos = window.pageYOffset;

window.onscroll = () => {

  let currentScrollPos = window.pageYOffset;

  if (prevScrollpos > currentScrollPos) {
    document.getElementById("navbar").style.top = "0";
  } else {
    document.getElementById("navbar").style.top = "-60px";
  }

  prevScrollpos = currentScrollPos;
  
}



/* Stepper
*************/

document.addEventListener('DOMContentLoaded', function () {

  window.stepper = new Stepper(document.querySelector('#stepper'))
  
})
