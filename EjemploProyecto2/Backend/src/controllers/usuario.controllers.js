const {Usuario} = require('../models/Usuario')
const {listaUsuarios} = require('../lists/lists')

const registrarUsuarios = (req, res) => {

    //let json = {msg: 'Hola Mundo', msg2: 'JavaScript', msg3: 'Usuarios'}
    //carnet, nombres, apellidos, genero, facultad, carrera, correo, password
    //let usuario = new Usuario(20230100, 'estudiante1', 'hjfdf', 'M', 'Ingenieria', 'Sistemas', 'correo@gmail.com', '123')
    
    //const carnet = req.body.carnet;
    //const nombres = req.body.nombres;
    const {carnet, nombres, password} = req.body;
    let usuario = new Usuario(parseInt(carnet), nombres, password)

    const existeUsuario = listaUsuarios.find(user => user.getCarnet() === parseInt(carnet))

    if (existeUsuario != undefined) {
        return res.json({msg: 'El usuario ya existe'})
    }
    
    listaUsuarios.push(usuario);

    res.json({msg: 'El usuario ha sido guardado correctamente'})
}

const verUsuarios = (req, res) => {
    res.json(listaUsuarios)
}

const loginUsuarios = (req, res) => {
    const {carnet, password} = req.body;

    const usuario = listaUsuarios.find(user => user.getCarnet() === parseInt(carnet) && user.getPassword() === password)

    if (usuario == undefined) {
        return res.json({ok: false, msg: 'Error de usuario o contraseña'})
    }
    res.json({user: usuario, ok: true, msg: 'Se logueo correctamente'})
}

const cargarUsuarios = (req, res) => {
    const json = req.body;

    for (user of json) {
        listaUsuarios.push(new Usuario(user.carnet, user.nombres, user.password))
    }
    res.json({msg: "La carga de usuarios fue realizada correctamente"})
}

const eliminar_usuario = (req, res) => {
    //http://localhost:3000/eliminar-usuario/2024
    const carnet = req.params.carnet;

    const posicionUsuario = listaUsuarios.findIndex(user => user.getCarnet() === parseInt(carnet))

    if (posicionUsuario === -1) {
        return res.json({msg: "El usuario no existe"})
    }
    listaUsuarios.splice(posicionUsuario, 1)
    res.json({msg: "El usuario ha sido eliminado"})
}

const editar_usuario = (req, res) => {
    const {carnet, nombres, password} = req.body;

    const posicionUsuario = listaUsuarios.findIndex(user => user.getCarnet() === parseInt(carnet))

    if (posicionUsuario === -1) {
        return res.json({msg: 'El usuario no existe'})
    }
    listaUsuarios[posicionUsuario].setNombres(nombres)
    listaUsuarios[posicionUsuario].setPassword(password)
    res.json({msg: 'El usuario ha sido editado correctamente'})
}


module.exports = {
    registrarUsuarios,
    verUsuarios,
    loginUsuarios,
    cargarUsuarios,
    eliminar_usuario,
    editar_usuario
}