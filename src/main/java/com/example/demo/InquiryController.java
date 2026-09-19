package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class InquiryController {

    @GetMapping("/")
    public String showDashboard(Model model) {
        // 本来はデータベースから取得しますが、まずは仮のデータ（Java Silverでお馴染みのList）を作成
        List<Inquiry> inquiryList = new ArrayList<>();
        inquiryList.add(new Inquiry(1L, "ログインパスワードを忘れました", "未対応"));
        inquiryList.add(new Inquiry(2L, "画面がフリーズします", "対応中"));

        // HTML側に「inquiries」という名前でリストを渡す
        model.addAttribute("inquiries", inquiryList);

        // src/main/resources/templates/index.html を表示する
        return "index";
    }
}