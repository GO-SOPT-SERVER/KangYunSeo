package sopt.org.SecondSeminar.service;

import org.springframework.stereotype.Service;
import sopt.org.SecondSeminar.controller.article.dto.request.RegisterArticleRequestDto;
import sopt.org.SecondSeminar.domain.Article.Article;

import static sopt.org.SecondSeminar.SecondSeminarApplication.articleList;

@Service
public class ArticleService {
    public Long register(RegisterArticleRequestDto request) {

        // 받아온 request 데이터를 토대로 실제 User 객체 생성
        Article newArticle = new Article(
                request.getTitle(),
                request.getDetail()
        );

        // 데이터베이스에 저장
        articleList.add(newArticle);
        newArticle.setId((long) articleList.size());

        // 저장한 유저 아이디 값 반환
        return newArticle.getId();
    }
}
