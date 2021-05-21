// import logo from './logo.svg';
import React, {Component} from "react";
import {Route, Switch} from "react-router-dom";

import Home from "./App/pages/Home";
import List from "./App/pages/List";
import './App.css';

class App extends Component {
  render() {
    const App = () => (
      <div>
        <Switch>
          <Route exact path="/" component={Home} />
          <Route exact path="/list" component= {List} />
        </Switch>
      </div>
    )
    return (
      <Switch>
      <App />
      </Switch>
    );
  }
}

export default App;
