function addTask() { // Define una nueva función llamada addTask.
    var input = document.getElementById('newTask'); // Obtiene el elemento de entrada (input) del DOM por su ID 'newTask' y lo almacena en la variable 'input'.
    var newTask = input.value; // Obtiene el valor actual del elemento de entrada, que sería el texto ingresado por el usuario, y lo almacena en la variable 'newTask'.
    if (newTask) { // Verifica si 'newTask' contiene algún texto (es decir, no está vacío).
        var div = document.createElement('div'); // Crea un nuevo elemento <div> y lo almacena en la variable 'div'.
        div.textContent = newTask; // Establece el contenido de texto del <div> recién creado al valor de 'newTask', que es el texto de la tarea ingresada.
        div.onclick = function() { // Asigna una función al evento onclick del <div>, de manera que cuando se haga clic en él...
            this.style.textDecoration = "line-through"; // ...se cambia el estilo de decoración del texto a 'line-through', marcando visualmente la tarea como completada.
        }
        var deleteButton = document.createElement('button'); // Crea un nuevo elemento <button> y lo almacena en la variable 'deleteButton'.
        deleteButton.textContent = 'Eliminar'; // Establece el contenido de texto del botón a 'Eliminar'.
        deleteButton.onclick = function() { // Asigna una función al evento onclick del botón, de manera que cuando se haga clic en él...
            this.parentElement.remove(); // ...se elimina el elemento padre del botón, que sería el <div> de la tarea, eliminando así toda la tarea del DOM.
        }
        div.appendChild(deleteButton); // Añade el botón de eliminar como hijo del <div> de la tarea, lo que significa que el botón se mostrará dentro de este <div>.
        document.getElementById('taskList').appendChild(div); // Encuentra el elemento con ID 'taskList' en el DOM y le añade el <div> de la tarea como hijo, mostrando la tarea en la página.
        input.value = ''; // Limpia el campo de entrada estableciendo su valor a una cadena vacía, preparándolo para la próxima entrada del usuario.
    }
}
