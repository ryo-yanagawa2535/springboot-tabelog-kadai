package com.example.springboot_tabelog_kadai.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ReviewRegisterForm {
	 @NotNull(message = "評価を選択してください。")
	    @Min(value = 1, message = "評価は1～5のいずれかを選択してください。")
	    @Max(value = 5, message = "評価は1～5のいずれかを選択してください。")
	    private Integer score;

	    @NotNull(message = "コメントを入力してください。")
	    @Size(max = 300, message = "コメントは300文字以内で入力してください。")
	    private String content;

	    // ゲッターとセッター
	    public Integer getScore() {
	        return score;
	    }

	    public void setScore(Integer score) {
	        this.score = score;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }
}
