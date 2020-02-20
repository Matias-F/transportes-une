
/* JSON dynamic information consumption
******************************************/

fetch("http:/localhost:8090/services/all")    
.then (function(response){
  return response.json();
})
.then (function (data){
  
  const serviceContainer = document.getElementById('service-container');

  data.forEach(service => {

    const card = document.createElement('div');
    card.classList.add('card', 'bg-light', 'col-10', 'mb-3', 'mx-2', 'p-4', 'd-flex', 'flex-column', 'justify-content-between', 'align-items-center', 'col-sm-8', 'p-sm-5', 'col-md-6', 'p-md-4', 'col-lg-3');
    const title = document.createElement('h4');
    title.classList.add('service-name');
    title.textContent = service.name;
    const img = document.createElement('img');
    img.classList.add('service-img');
    img.setAttribute('src','img/'+service.image);
    const desc = document.createElement('p');
    desc.classList.add('service-text', 'text-center');
    desc.textContent = service.desc;

    serviceContainer.appendChild(card);
    card.appendChild(title);
    card.appendChild(img);
    card.appendChild(desc);

  });

  

  console.log(serviceContainer);

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
