
/* Form Validation
*********************/

/* Form */
let form = document.querySelector('.form');

/* Fields */
let fieldUserName = document.querySelector('#user');
let fieldEmail = document.querySelector('#email');
let fieldName = document.querySelector('#name');
let fieldPass = document.querySelector('#pass');
let fieldConfirmPass = document.querySelector('#confirm-pass');

/* Formats */
const REGEX_MAIL = /^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

/* Buttons */
let formButton = document.querySelector('.form-btn');

/* Messages */
let helperUserNameFormat = document.querySelector('.username-format');
let errorUserNameEmpty   = document.querySelector('.username-empty');
let errorUserNameLength  = document.querySelector('.username-length');

let errorEmailFormat = document.querySelector('.email-format');
let errorEmailEmpty  = document.querySelector('.email-empty');

let errorNameEmpty = document.querySelector('.name-empty');

let helperPassFormat = document.querySelector('.pass-format');
let errorPassEmpty  = document.querySelector('.pass-empty');
let errorPassLength  = document.querySelector('.pass-length');

let errorConfirmPassEmpty  = document.querySelector('.confirmpass-empty');
let errorConfirmPassMatching = document.querySelector('.confirmpass-diff');

let registerFormSent = document.querySelector('.successfully-sent');


/* Validations */
form.onsubmit = function(event) {
    if(fieldUserName.value.trim() == '') {
        errorUserNameEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldEmail.value.trim() == '') {
        errorEmailEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldName.value.trim() == '') {
        errorNameEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldPass.value.trim() == '') {
        errorPassEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldConfirmPass.value.trim() == '') {
        errorConfirmPassEmpty.style.display = 'block';
        event.preventDefault();
    }
    else if(fieldPass.value != fieldConfirmPass.value) {
        errorConfirmPassMatching.style.display = 'block';
        event.preventDefault();
    }
    else {
        errorUserNameEmpty.style.display = 'none';
        errorEmailEmpty.style.display = 'none';
        errorNameEmpty.style.display = 'none';
        errorPassEmpty.style.display = 'none';
        errorConfirmPassEmpty.style.display = 'none';
        errorConfirmPassMatching.style.display = 'none';
        registerFormSent.style.display = 'block';
        event.preventDefault();
    }
};

fieldUserName.onfocus = function() {
    helperUserNameFormat.style.display = 'block';
    errorUserNameLength.style.display = 'none';
    errorUserNameEmpty.style.display = 'none';
};
fieldUserName.onblur = function() {
    if (this.value.length > 0 && this.value.length < 4) {
        helperUserNameFormat.style.display = 'none';
        errorUserNameLength.style.display = 'block';
    } else {
        helperUserNameFormat.style.display = 'none';
    }
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

fieldName.onfocus = function() {
    errorNameEmpty.style.display = 'none';
};

fieldPass.onfocus = function() {
    helperPassFormat.style.display = 'block';
    errorPassLength.style.display = 'none';
    errorPassEmpty.style.display = 'none';
    errorConfirmPassMatching.style.display = 'none';
};
fieldPass.onblur = function() {
    if (this.value.length > 0 && this.value.length < 6) {
        helperPassFormat.style.display = 'none';
        errorPassLength.style.display = 'block';
    } else {
        helperPassFormat.style.display = 'none';
    }
};

fieldConfirmPass.onfocus = function() {
    errorConfirmPassEmpty.style.display = 'none';
    errorConfirmPassMatching.style.display = 'none';
};
