
/* Form Validation
*********************/

/* Form */
let form = document.querySelector('.form');

/* Fields */
let fieldUser = document.querySelector('#user-credentials');
let fieldPass = document.querySelector('#pass');

/* Buttons */
let formButton = document.querySelector('.form-btn');

/* Messages */
let errorUserEmpty = document.querySelector('.user-empty');
let errorPassEmpty = document.querySelector('.pass-empty');


/* Validations */
form.onsubmit = function(event) {
    if(fieldUser.value.trim() == '') {
        errorUserEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldPass.value.trim() == '') {
        errorPassEmpty.style.display = 'block';
        event.preventDefault();
    }
    else {
        errorUserEmpty.style.display = 'none';
        errorPassEmpty.style.display = 'none';
    }
};

fieldUser.onfocus = function() {
    errorUserEmpty.style.display = 'none';
};

fieldPass.onfocus = function() {
    errorPassEmpty.style.display = 'none';
};
