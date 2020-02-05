
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
