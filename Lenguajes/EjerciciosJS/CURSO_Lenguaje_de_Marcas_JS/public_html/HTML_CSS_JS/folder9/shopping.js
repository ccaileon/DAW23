function addItem() { // Define una nueva función llamada addItem.
    var input = document.getElementById('newItem'); // Obtiene el elemento de entrada del DOM por su ID 'newItem'.
    var newItem = input.value; // Obtiene el valor del elemento de entrada, que es el texto ingresado por el usuario.
    if (newItem) { // Verifica si el valor obtenido no está vacío.
        var div = document.createElement('div'); // Crea un nuevo elemento <div>.
        div.textContent = newItem; // Establece el texto del <div> al valor ingresado por el usuario.
        div.onclick = function() { // Asigna una función al evento onclick del <div>.
            this.style.textDecoration = "line-through"; // Marca el ítem como comprado al hacer clic sobre él.
        }
        var deleteButton = document.createElement('button'); // Crea un nuevo botón para eliminar el ítem.
        deleteButton.textContent = 'Eliminar'; // Establece el texto del botón a 'Eliminar'.
        deleteButton.onclick = function() { // Asigna una función al evento onclick del botón.
            this.parentElement.remove(); // Elimina el <div> del ítem, removiéndolo de la lista.
        }
        div.appendChild(deleteButton); // Añade el botón de eliminar al <div> del ítem.
        document.getElementById('itemList').appendChild(div); // Añade el <div> del ítem a la lista en el DOM.
        input.value = ''; // Limpia el campo de entrada para el próximo ítem.
    }
}
