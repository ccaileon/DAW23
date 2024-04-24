var count = 0; // Inicializa el contador de visitas a 0.

function increaseCount() { // Define una función para incrementar el contador.
    count++; // Incrementa el contador en 1.
    document.getElementById('visitCount').textContent = 'Visitas: ' + count; // Actualiza el contenido del elemento que muestra el contador en el DOM.
}
