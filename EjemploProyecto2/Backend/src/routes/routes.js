const express = require('express');

const usuarioControllers = require('../controllers/usuario.controllers')
const publicacionControllers = require('../controllers/publicaciones.controllers')

const router = express.Router();

router.post('/registroUsuarios', usuarioControllers.registrarUsuarios);
router.get('/verUsuarios', usuarioControllers.verUsuarios);
router.post('/login', usuarioControllers.loginUsuarios);

router.post('/crearpublicacion', publicacionControllers.crear_publicacion)
router.get('/verPublicaciones', publicacionControllers.ver_publicaciones)

module.exports = router;