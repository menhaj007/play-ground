import React, {Component} from 'react';
import defaultProps from 'react';
import MovieCard from './MovieCard'


class App extends Component {
    render () {
        const title = "Mad Max"
        const posterURL = "https://images.unsplash.com/photo-1619614860940-73378f5c190b?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=934&q=80"
        const genresArr = ["Action", "Adventure", "Science Fiction", "Thriller"]
        return (
            <>
                <MovieCard title={title} posterSrc={posterURL} genres={genresArr} />
            </>
        )
    }
}
MovieCard.defaultProps = {
    posterSrc: 'http://i.imgur.com/bJw8ndW.png'
}

export default App;