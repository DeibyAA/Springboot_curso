// Call the dataTables jQuery plugin
$(document).ready(function() {
    //on ready
});

async function registrarUsuario() {
  let datos = {};

  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
    body: JSON.stringify({a: 1, b: 'Textual content'})
  });
  const usuarios = await request.json();
}

