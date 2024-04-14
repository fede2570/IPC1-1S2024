class Publicacion {

    static contador = 1;
    //codigo es el carnet o codigo de la persona
    //se pueden agregar los demas atributos del usuario si se les facilita
    constructor(codigo, descripcion, imagen) {
        this.idPublicacion = Publicacion.contador++;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    getCodigo() {
        return this.codigo;
    }
    
    setCodigo(codigo) {
        this.codigo = codigo;
    }
}

module.exports = {
    Publicacion
}