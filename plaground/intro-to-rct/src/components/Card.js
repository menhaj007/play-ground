import { Component } from "react";

export class Card extends Component {
    render () {
        return (
            <div className="card col m-2 p-2">
                <img className="card-img-top" src={this.props.data.image} alt="..." />
                <div className="card-head">{this.props.data.title}</div>
                <div className="card-body">
                    <h4 className="card-title">{this.props.data.artist["name"]}</h4>
                </div>
            </div>
        )
    }
}

// export const Card = (props) => {
//     console.log("From Card: ",props.data)
//     return (
//         <div className="card col m-2 p-2">
//             <img src={props.data.image} />
//             <div className="card-head">{props.data.title}</div>
//             <div className="card-body">
//                 <h4 className="card-title">{props.data.artist["name"]}</h4>
//             </div>
//         </div>
//     )
// }