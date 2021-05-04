import React from "react";

class App extends React.Component {
  constructor() {
    super();
    this.state = {
      count: 0
    }
  }
  increment = () => {
    // console.log(`before setState: ${this.state.count}`)
    const newCount = this.state.count+1;
    this.setState({
      count: newCount
    });
    // console.log(`after setState: ${this.state.count}`)
  }
  render() {
    return (
      <div onClick={this.increment} >
      {this.state.count}
      </div>
    )
  }
}


export default App;
