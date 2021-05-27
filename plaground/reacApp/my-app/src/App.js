import logo from './logo.svg';
import './App.css';
import Article from './Article';
import Comment from './Comment'

class App extends React.Component {
  render() {
    return (
      <div>
        <Article />
        <Comment />
      </div>
    )
  }
}
export default app;