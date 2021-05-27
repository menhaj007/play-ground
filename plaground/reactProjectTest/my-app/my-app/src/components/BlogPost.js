import React, {Component} from 'react';
import BlogContent from './BlogContent'
import Comment from './Comment'

class BlogPost extends Component {
    render() {
      return (
        <div>
          <BlogContent articleText = {"Dear Reader: Bjarne Stroustrup has the perfect lecture oration."} />
          <Comment commentText={"I agree with this statement. - Angela Merkel"}/>
          <Comment commentText={"A universal truth. - Noam Chomsky"}/>
          <Comment commentText={"Truth is singular. Its ‘versions’ are mistruths. - Sonmi-451"}/>
        </div>
      )
    }
}

export default BlogPost;