$('document').ready(function(){

  var password = document.getElementById("password");
  var confirmarPassword = document.getElementById("confirmarPassword");

  function validarSenha(){
    if(password.value != confirmarPassword.value){
      confirmarPassword.setCustomValidity("Campos com valores diferentes!");
    }else{
      confirmarPassword.setCustomValidity('');
    }
  }
  
  password.onchange = validarSenha;
  confirmarPassword.onkeyup = validarSenha;
  
});