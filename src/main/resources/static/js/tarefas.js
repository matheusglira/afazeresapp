$('document').ready(function(){
	
  $('#principalModal').modal();
  
  $('table #editbtn').on('click', function(event){
    
    event.preventDefault();
    
    var href = $(this).attr('href');
    
    $.get(href, function(tarefas, status){
      $('#editid').val(tarefas.id);
      $('#editnometarefa').val(tarefas.nomeTarefa);
      $('#editdtinicio').val(tarefas.dataInicio);
      $('#editdtfim').val(tarefas.dataFim);
      $('#editdescricao').val(tarefas.descricao);
      
                
    });

    $('#editModal').modal();
    
  });
  
  $('table #deletebtn').on('click', function(event){
    
    event.preventDefault();
    
    var href = $(this).attr('href');
    
    $('#confirmarDelete').attr('href', href);
    
    $('#deleteModal').modal();
  });

  var divPiadas = document.getElementById("piadas");
  var link = "https://sv443.net/jokeapi/v2/joke/Miscellaneous?blacklistFlags=nsfw,religious,political,racist,sexist&format=txt";

  $.ajax({
      url: link,
      type: 'GET',
      dataType: 'text',
      success: function(data){
        console.log(data);
        divPiadas.innerText = data;
      }
    })

});
