import axios from 'axios'
import { useState } from 'react'

const EditarUsuario = () => {

    const {carnet, nombres, password} = JSON.parse(localStorage.getItem('usuario'))

    const [nombre, setNombre] = useState('')
    const [passw, setPassw] = useState('')

    const handleChangeNombre = (e) => {
        setNombre(e.target.value)
    }

    const handleEditarUser = (e) => {
        e.preventDefault()
        axios.put('http://localhost:3000/editar-usuario', {
            carnet: carnet,
            nombres: nombre,
            password: '123'
        }).then(response => {
            alert(response.data.msg)
        }).catch(error => {console.log(error)})
    }

    return (
        <>
            <form onSubmit={handleEditarUser}>
                <input type="text" onChange={handleChangeNombre} 
                placeholder="Ingrese nombres"/>

                <input type="password" placeholder="Ingrese contraseña"/>
                <button type="submit">Editar</button>
            </form>
        </>
    )

}

export default EditarUsuario;