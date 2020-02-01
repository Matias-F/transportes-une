
/* Form Validation
*********************/

/* Form */
let form = document.querySelector('.form');

/* Fields */
let fieldName = document.querySelector('#name');
let fieldEmail = document.querySelector('#email');

/* Formats */
const REGEX_MAIL = /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

/* Buttons */
let formButton = document.querySelector('.form-btn');

/* Messages */
let errorNameEmpty = document.querySelector('.name-empty');

let errorEmailFormat = document.querySelector('.email-format');
let errorEmailEmpty  = document.querySelector('.email-empty');

let messageSent = document.querySelector('.successfully-sent');


/* Validations */
form.onsubmit = function(event) {
    if(fieldName.value.trim() == '') {
        errorNameEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldEmail.value.trim() == '') {
        errorEmailEmpty.style.display = 'block';
        event.preventDefault();
    }
    else {
        errorNameEmpty.style.display = 'none';
        errorEmailEmpty.style.display = 'none';
        messageSent.style.display = 'block';
        formButton.classList.add('disabled', 'btn-secondary');
        event.preventDefault();
    }
};

fieldName.onfocus = function() {
    errorNameEmpty.style.display = 'none';
};

fieldEmail.onfocus = function() {
    errorEmailEmpty.style.display = 'none';
    errorEmailFormat.style.display = 'none';
};
fieldEmail.onblur = function() {
    if (this.value.length > 0 && !REGEX_MAIL.test(this.value)) {
        errorEmailFormat.style.display = 'block';
    } else {
        errorEmailFormat.style.display = 'none';
    }
};
