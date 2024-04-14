import { Link } from "react-router-dom";


const Navigation = () => {

    const handleLogout = () => {
        localStorage.removeItem('usuario')
        window.location.href = '/login'
    }

    return (
        <>
            <nav className="blue">
                <div className="nav-wrapper">
                    <ul id="nav-mobile" className="right hide-on-med-and-down">
                        <li><Link to={'/crear-publicacion'}>Crear Publicacion</Link></li>
                        <li><Link to={'/publicaciones'}>Ver Publicaciones</Link></li>
                        <li><button onClick={handleLogout}>Cerrar Sesion</button></li>
                    </ul>
                </div>
            </nav>
        </>
    )

}

export default Navigation;