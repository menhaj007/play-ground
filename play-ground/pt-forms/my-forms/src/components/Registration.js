import React, {Component} from "react";

export default class Registration extends Component {

    state = {
        firstName: "",
        lastName: "",
        phone: null,
        registered: []

    }

    handleChange = e => {
        this.setState({
            [e.target.name]: e.target.value
        })
    }
    submitHandler = e => {
        e.preventDefault();
        let formData = {firstName: this.state.firstName, lastName: this.state.lastName, phone: this.state.phone};
        let arrayData = this.state.registered.concat(formData);
        this.setState({
            registered: arrayData
        });
        
    }
    displayListOfSubmission = () => {
        return this.state.registered.map( (data, index) => {
            return <div> key={index}<span>{data.firstName}</span> <span>{data.lastName}</span> <span>{data.phone}</span> </div>
        })
    }


    render() {
        return(
            <div>
                <form onSubmit={e => this.submitHandler(e)}>
                    <input type="text" name="firstName" value={this.state.firstName} placeholder="Enter first name" onChange={ e => this.handleChange(e)} />
                    <input type="text" name="lastName" value={this.state.lastName} placeholder="Enter last name" onChange={e => this.handleChange(e)} />
                    <input type="number" name="phone" value={this.state.phone} placeholder="Enter phone number" onChange={e => this.handleChange(e)} />
                    <input type="submit"/>

                </form>
                {this.displayListOfSubmission()}
            </div>
        )
    }
}
