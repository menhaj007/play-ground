import React, { Component } from 'react';
import CardContainer from "./CardContainer";
import {NavBar} from './NavBar';


class App extends Component {

  state = {
    showCardContainer: false
  }
  showContainer = () => {
    this.setState( {showCardContainer: !this.state.showCardContainer} )
  }

  render() {
    return(
      <div className="bg-dark">
        <NavBar show={this.state.showCardContainer} showContainer = {this.showContainer} />
        {this.state.showCardContainer ? <CardContainer /> : null}
      </div>
    )
  }
}

// class App extends Component {
//   render() {
//     return (
//       <div className="bg-dark">
//       <NavBar />
//       <CardContainer />
//       </div>
//     )
//   }
// }


export default App;
