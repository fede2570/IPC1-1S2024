class Usuario {

    constructor(carnet, nombres, password) {
        this.carnet = carnet;
        this.nombres = nombres;
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