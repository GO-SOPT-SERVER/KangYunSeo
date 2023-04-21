package sopt.org.SecondSeminar.controller.article;

import org.springframework.web.bind.annotation.*;
import sopt.org.SecondSeminar.controller.article.dto.request.RegisterArticleRequestDto;

@RestController
public class ArticleController {

    @PostMapping("/article")
    public String register(@RequestBody final RegisterArticleRequestDto request) {
        System.out.println(request.getTitle());
        System.out.println(request.getDetail());

        // 서비스 계층에 유저를 등록하는 메서드를 호출

        return "게시물 등록이 완료됐습니다.";
    }

    @GetMapping("/article/{articleId}")
    public String getOne(@PathVariable final Long articleId) {
        System.out.println("요청 게시물 아이디: " + articleId);

        // 서비스 계층에서 유저 아이디로 유저를 찾는 메서드 호출

        return "게시물 조회 성공";
    }

    @GetMapping("/article/search")
    public String search(@RequestParam final String title) {
        System.out.println("게시물 제목 검색 인자: " + title);

        // 서비스 계층에서 유저 닉네임으로 유저를 찾는 메서드 호출

        return "게시물 검색 성공";
    }
}
