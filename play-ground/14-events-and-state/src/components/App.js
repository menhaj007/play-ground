import React, { Component } from 'react'
import paintingData from '../data/paintings'

//Components
import Navbar  from './Navbar'
import CardContainer from './CardContainer'
import Home from './Home'

export default class App extends Component {

  state = {
    display: "Home",
    searchText: "",
    paintings: paintingData
  }





  render(){


    return (
      <div className="bg-dark">
       
      </div>
    )
  }
}



