
/* JSON dynamic information consumption
******************************************/

fetch("http://localhost:8090/services/all")    
.then (function(response){
    return response.json();
})
.then (function (data){
  // data.forEach(service => {
  //   //do something
  // });
})
.catch(function(error){
  console.log("El error fue: " + error);
})



/* Dinamyc Navbar
********************/
/* When the user scrolls down, hide the navbar. When the user scrolls up, show the navbar */

let prevScrollpos = window.pageYOffset;

window.onscroll = () => {

  let currentScrollPos = window.pageYOffset;

  if(currentScrollPos > 60) {
    if (prevScrollpos > currentScrollPos ) {
      document.getElementById("navbar").style.top = "0";
    } else {
      document.getElementById("navbar").style.top = "-60px";
    }
  }

  prevScrollpos = currentScrollPos;
  
}



/* Stepper
*************/

document.addEventListener('DOMContentLoaded', function () {

  window.stepper = new Stepper(document.querySelector('#stepper'))
  
})
