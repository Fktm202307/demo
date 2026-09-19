package com.example.demo;

public class Inquiry {
    private Long id;
    private String title;
    private String status; // "未対応", "対応中", "完了" など

    // コンストラクタ
    public Inquiry(Long id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    // ゲッター（HTML側からデータを呼ぶために必要）
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getStatus() { return status; }
}