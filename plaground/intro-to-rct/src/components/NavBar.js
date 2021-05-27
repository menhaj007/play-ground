export const NavBar = (props) => {
    return (
        <nav className="navbar navbar-light bg-info mb-4">
            <span className="navbar-brand">Cool App</span>
            <button onClick={() => props.showContainer()} className="btn btn-dark">{props.show ? "Hide Cards" : "Show Cards"}</button>
        </nav>
    )
}