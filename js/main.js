
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

/* Button */
let formButton = document.querySelector('.form-btn');

/* Messages */
let helperUserNameFormat = document.querySelector('.user-name-format-helper');
let alertUserNameEmpty   = document.querySelector('.user-name-empty-alert');
let alertUserNameLength  = document.querySelector('.user-name-length-alert');

let alertNameEmpty = document.querySelector('.name-empty-alert');



fieldUserName.onfocus = function() {
    helperUserNameFormat.style.display = 'block';
    alertUserNameEmpty.style.display = 'none';
    alertUserNameLength.style.display = 'none';
};

fieldUserName.onblur = function() {
    if (this.value.trim() == '') {
        helperUserNameFormat.style.display = 'none';
        alertUserNameEmpty.style.display = 'block';
        alertUserNameLength.style.display = 'none';
    }
    else if (this.value.length < 4) {
        helperUserNameFormat.style.display = 'none';
        alertUserNameLength.style.display = 'block';
    }
    else {
        helperUserNameFormat.style.display = 'none';
        alertUserNameEmpty.style.display = 'none';
        alertUserNameLength.style.display = 'none';
    }
};


fieldName.onfocus = function() {
    alertNameEmpty.style.display = 'none';
};

fieldName.onblur = function() {
    if (this.value.trim() == '') {
        alertNameEmpty.style.display = 'block';
    }
    else {
        alertNameEmpty.style.display = 'none';
    }
};


form.onsubmit = function(event) {
    event.preventDefault();
};
