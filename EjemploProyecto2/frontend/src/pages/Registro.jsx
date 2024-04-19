import { useEffect, useState } from "react";
import axios from 'axios';

const Registro = () => {

    const [codigo, setCodigo] = useState('')
    const [nombre, setNombre] = useState('')
    const [password, setPassword] = useState('')

    const handleChangeCodigo = (e) => {
        setCodigo(e.target.value)
    }

    const handleChangeNombre = (e) => {
        setNombre(e.target.value)
    }

    const handleChangePassword = (e) => {
        setPassword(e.target.value)
    }

    const handleRegister = (e) => {
        e.preventDefault();
        axios.post('http://localhost:3000/registroUsuarios', {
            carnet: codigo,
            nombres: nombre,
            password: password
        }).then(response => {
            alert(response.data.msg)
        }).catch(error => {
            console.log(error)
        })
    }

    useEffect(() => {
        M.AutoInit();
    }, [])

    return (
        <>
            <div className="container grey lighten-4"
                style={{padding: '2%', marginTop: '4%'}}>

                <h1>Registro</h1>

                <div className="row">
                    <div className="col s12">
                        <div className="card" style={{padding: '3%'}}>
                            <form id="form" onSubmit={handleRegister}>
                                <div className="card-content">
                                    <input type="text" placeholder="Ingrese codigo" onChange={handleChangeCodigo}/>
                                </div>
                                <div className="card-content">
                                    <input type="text" placeholder="Ingrese nombre" onChange={handleChangeNombre}/>
                                </div>
                                <div className="card-content">
                                    <input type="password" placeholder="Ingrese contraseña" onChange={handleChangePassword}/>
                                </div>
                                <div className="card-action">
                                    <button className="btn waves-effect waves-light" 
                                    type="submit">Registro</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )

}

export default Registro;