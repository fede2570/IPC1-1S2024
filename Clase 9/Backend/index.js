const express = require("express")
const cors = require("cors")

const port = 4000;

const app = express();

app.use(cors())
app.use(express.json({limit: "25mb"}))
app.use(express.urlencoded({limit: "25mb", extends: true}))

app.get("/mensaje" , (req, res) => {
    res.send("Hola Mundo")
})

app.get("/mensaje2", (req, res) => {
    res.json({"mensaje": "Hola Mundo desde un JSON"})
})

app.post("/registrar", (req, res) => {
    const carnet = req.body.carnet;
    const nombre = req.body.nombre;

    res.json({"carnet": "Su carnet es " + carnet + " nombre: " + nombre})
})

app.listen(port, () => {
    console.log("El servidor esta ejecutandose en el puerto " + port)
})

