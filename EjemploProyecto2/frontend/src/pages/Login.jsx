import { useState } from "react";
import axios from 'axios';

const Login = () => {

    const [codigo, setCodigo] = useState('')
    const [password, setPassword] = useState('')

    const handleChangeCodigo = (e) => {
        setCodigo(e.target.value)
    }

    const handleChangePassword = (e) => {
        setPassword(e.target.value)
    }

    const handleLogin = (e) => {
        e.preventDefault()
        axios.post('http://localhost:3000/login', {
            carnet: codigo,
            password: password
        }).then(response => {
            if (response.data.ok === true) {
                alert(response.data.msg)
                window.location.href = '/crear-publicacion'
                localStorage.setItem('usuario', JSON.stringify(response.data.user))
            } else {
                alert(response.data.msg)
            }
        })
    }


    return (
        <>
            <div className="container grey lighten-4"
                style={{padding: '2%', marginTop: '4%'}}>

                <h1>Inicio Sesion</h1>

                <div className="row">
                    <div className="col s12">
                        <div className="card" style={{padding: '3%'}}>
                            <form id="form" onSubmit={handleLogin}>
                                <div className="card-content">
                                    <input type="text" placeholder="Ingrese codigo" 
                                    onChange={handleChangeCodigo}/>
                                </div>
                                <div className="card-content">
                                    <input type="password" placeholder="Ingrese contraseña"
                                    onChange={handleChangePassword}/>
                                </div>
                                <div className="card-action">
                                    <button className="btn waves-effect waves-light" 
                                    type="submit">Login</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )

}

export default Login;