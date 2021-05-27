import { Component } from 'react';


class MovieCard extends Component {
    render() {
        
        return (
            <div className="movie-card">
                <img src={this.props.posterSrc} alt={this.props.title} />
                <h2>{this.props.title}</h2>
                <small>{this.props.genres.join(', ')}</small>
            </div>
        )
    }

}

export default MovieCard;