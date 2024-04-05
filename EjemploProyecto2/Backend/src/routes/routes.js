const express = require('express');

const usuarioControllers = require('../controllers/usuario.controllers')

const router = express.Router();

router.post('/registroUsuarios', usuarioControllers.registrarUsuarios);
router.get('/verUsuarios', usuarioControllers.verUsuarios);
router.post('/login', usuarioControllers.loginUsuarios);

module.exports = router;