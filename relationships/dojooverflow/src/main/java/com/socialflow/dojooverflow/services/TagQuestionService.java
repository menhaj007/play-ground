package com.socialflow.dojooverflow.services;

import com.socialflow.dojooverflow.models.Question;
import com.socialflow.dojooverflow.models.Tag;
import com.socialflow.dojooverflow.models.TagQuestion;
import com.socialflow.dojooverflow.repositories.AnswerRepository;
import com.socialflow.dojooverflow.repositories.QuestionRepository;
import com.socialflow.dojooverflow.repositories.TagQuestionRepository;
import com.socialflow.dojooverflow.repositories.TagRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagQuestionService {
    
    @Autowired
    private QuestionRepository qR;
    @Autowired
    private AnswerRepository aR;
    @Autowired
    private TagQuestionRepository tQR;
    @Autowired
    private TagRepository tR;

    public Question createQuestion(Question question) {
        return qR.save(question);
    }

    public void CreateQuestionAndTag(Question question, Tag tag) {
        Question q = qR.save(question);
        Tag r = tR.save(tag);
        TagQuestion tmp = new TagQuestion();
        tmp.setTag(tag);
        tmp.setQuestion(q);
        
    }
    // private void 
    

    
}
