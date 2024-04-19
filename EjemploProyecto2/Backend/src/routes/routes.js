const express = require('express');

const usuarioControllers = require('../controllers/usuario.controllers')
const publicacionControllers = require('../controllers/publicaciones.controllers')

const router = express.Router();

router.post('/registroUsuarios', usuarioControllers.registrarUsuarios);
router.get('/verUsuarios', usuarioControllers.verUsuarios);
router.post('/login', usuarioControllers.loginUsuarios);

router.post('/crearpublicacion', publicacionControllers.crear_publicacion)
router.get('/verPublicaciones', publicacionControllers.ver_publicaciones)

router.post('/carga-usuarios', usuarioControllers.cargarUsuarios)

//http://localhost:3000/eliminar-usuario/2024
router.delete('/eliminar-usuario/:carnet', usuarioControllers.eliminar_usuario)
router.put('/editar-usuario', usuarioControllers.editar_usuario)

module.exports = router;