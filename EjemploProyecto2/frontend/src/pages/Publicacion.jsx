import { useEffect, useState } from "react";
import Navigation from "./NavBar";
import axios from "axios";

const Publicacion = (props) => {
    
    return (
        <>
        <div className="container">
            <div className="row">
                <div className="col s12 m7 offset-m2 mt-3">
                    <div className="card">
                        <div className="card-image">
                            <img src={"data:image/png;base64," +  props.imagen}/>
                        </div>
                        <div className="card-content">
                            <p>Carnet: {props.codigo}</p>
                            <p>{props.descripcion}</p>
                        </div>
                        <div className="card-content">
                            <button className="btn waves-effect waves-light">Comentarios</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </>
    )
}

export default Publicacion;