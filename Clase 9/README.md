## Clase 9

Para crear un proyecto desde cero utilicen este comando.
~~~
npm init -y
~~~

En el caso del ejemplo para poder ejecutarlo, antes de iniciar el servidor de Node deben ejecutar el siguiente comando para instalar todas las dependencias (la carpeta node_modules) que estan en el archivo package.json. Deben entrar a la carpeta Backend y ejecutar el siguiente comando.

~~~
npm install
~~~


Y para ejecutarlo se debe utilizar el siguiente comando.

~~~
npm start
~~~


Este es un ejemplo de un endpoint con petición GET.
~~~
app.get("/mensaje" , (req, res) => {
    res.send("Hola Mundo")
})
~~~
En el navegador colocan esta ruta del endpoint.
~~~
localhost:4000/mensaje
~~~

Para utilizar un endpoint con petición POST, deben usar Postman o la extensión de Thunder Client.
~~~
app.post("/registrar", (req, res) => {
    const carnet = req.body.carnet;
    const nombre = req.body.nombre;

    res.json({"carnet": "Su carnet es " + carnet + " nombre: " + nombre})
})
~~~

Para la ruta coloquen esto en Postman o Thunder Client
~~~
localhost:4000/registrar
~~~

Y en el cuerpo de Postman colocan un JSON con esta estructura.
~~~
{
  "carnet": 201901073,
  "nombre": "david"
}
~~~