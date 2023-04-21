package sopt.org.SecondSeminar.domain.Article;

import lombok.Getter;

@Getter
public class Article {

    private Long id;

    private String title;

    private String detail;

    public Article(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id: " + this.id + "\n" +
                "title: " + this.title + "\n" +
                "detail: " + this.detail + "\n";
    }
}
