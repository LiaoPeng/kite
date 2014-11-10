$(document).ready(function(){
  ie7Stuff();
});

function ie7Stuff() {
  $(".omdweb-container fieldset.two-up .form-group:nth-child(even)").addClass("omdweb-form-group-even");

  $(".omdweb-mass-choices-container ul:last-child").addClass("lastChild");

  $('.omdweb-help-topics-list dt').prepend('<i class="omdweb-help-indicator">Q</i>');
  $('.omdweb-help-topics-list dt + dd').prepend('<i class="omdweb-help-indicator">A</i>');
}
