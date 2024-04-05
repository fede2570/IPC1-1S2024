class Usuario {

    constructor(carnet, nombres, apellidos, genero, facultad, carrera, correo, password) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.facultad = facultad;
        this.carrera = carrera;
        this.correo = correo;
        this.password = password;
    }

    getCarnet() {
        return this.carnet;
    }

    setCarnet(carnet) {
        this.carnet = carnet;
    }

    getNombres() {
        return this.nombres;
    }

    setNombres(nombres) {
        this.nombres = nombres;
    }

    getPassword() {
        return this.password;
    }
}

module.exports = {
    Usuario
}