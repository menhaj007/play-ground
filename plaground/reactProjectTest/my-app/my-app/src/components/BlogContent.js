import React, {Component} from 'react';
import Comment from './Comment';

class BlogContent extends Component {
    render() {
      return (
        <div>
          {this.props.articleText}
          <Comment commentText = "Hell world"/>
        </div>  
      )
    }
  }

  export default BlogContent;

