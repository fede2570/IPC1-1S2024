import { useState } from "react";
import Navigation from "./NavBar";
import axios from "axios";


const CrearPublicacion = () => {

    const {carnet, nombres, password} = JSON.parse(localStorage.getItem('usuario'))

    const [imageB64, setImageB64] = useState("")
    const [file, setFile] = useState()

    const [descripcion, setDescripcion] = useState("")


    const handleChangeDescripcion = (e) => {
        setDescripcion(e.target.value)
    }

    const handleRegisterPublicacion = (e) => {
        e.preventDefault();
        //codigo, descripcion, imagen
        axios.post('http://localhost:3000/crearpublicacion', {
            codigo: carnet,
            descripcion: descripcion,
            imagen: imageB64
        }).then(response => {
            alert(response.data.msg)
        }).catch(error => {console.log(error)})
    }


    const convertToBase64 = (file) => {
        return new Promise((resolve, reject) => {
          const fileReader = new FileReader();
          fileReader.readAsDataURL(file);
          fileReader.onload = () => {
            resolve(fileReader.result.split(',')[1]);
          }
          fileReader.onerror = (error) => {
            reject(error);
          }
        })
    }

    const handleFileImageUpload = async (e) => {
        const file = e.target.files[0];
        const base64 = await convertToBase64(file);
        setImageB64(base64)
        console.log(base64)
    }

    return (
        <>
            <Navigation/>
            <div className="container grey lighten-4"
                style={{padding: '2%', marginTop: '4%'}}>

                    <div className="row">
                        <div className="col s12">
                            <div className="card" style={{padding: '3%'}}>
                                <form id="form" onSubmit={handleRegisterPublicacion}>
                                    <div className="card-content">
                                        <h1>Crear Publicacion</h1>
                                    </div>
                                    <div className="card-content">
                                        <textarea onChange={handleChangeDescripcion}/>
                                    </div>
                                    <div className="card-content">
                                        <input type="file" onChange={handleFileImageUpload}/>
                                    </div>
                                    <div className="card-action">
                                        <button className="btn waves-effect waves-light" type="submit">Crear Publicacion</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
            </div>
        </>
    )

}

export default CrearPublicacion;