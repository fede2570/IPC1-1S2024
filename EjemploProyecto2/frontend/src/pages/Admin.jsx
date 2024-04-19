import axios from "axios";
import { useState } from "react";

const Admin = () => {

    const [json, setJson] = useState([])

    const handleFileJSON = (e) => {
        const fileReader = new FileReader();
        fileReader.readAsText(e.target.files[0], "UTF-8")
        fileReader.onload = (event) => {
            const jsonData = JSON.parse(event.target.result)
            setJson(jsonData)
            handleSaveUsers(jsonData)
        }
    }

    const handleSaveUsers = (jsonData) => {
        axios.post('http://localhost:3000/carga-usuarios', jsonData)
        .then(response => {
            alert(response.data.msg)
        }).catch(error => {console.log(error)})
    }


    return (
        <>
            <input type="file" onChange={handleFileJSON}/>

            <table>
                <thead>
                    <tr>
                        <td>Carnet</td>
                        <td>Nombres</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        json.map(item => {
                            return (
                                <>
                                    <tr>
                                        <td>{item.carnet}</td>
                                        <td>{item.nombres}</td>
                                    </tr>
                                </>
                            )
                        })
                    }
                </tbody>
            </table>
        </>
    )

}

export default Admin;