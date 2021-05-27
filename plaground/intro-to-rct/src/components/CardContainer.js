import React from 'react'
import {Card} from './Card';
import paintingData from "../data/paintings";


export default class CardContainer extends React.Component {
    render() {
        
        return (
            <div className="row ml-3">
               {paintingData.map(e => <Card key={e.id} data={e}/>)}
            </div>
        )
    }
}