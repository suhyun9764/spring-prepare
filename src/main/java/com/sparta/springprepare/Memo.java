package com.sparta.springprepare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter@Setter
@RequiredArgsConstructor // final 키워드 생성자
@AllArgsConstructor // 모든 필드 생성자
// @NoArgsConstructor // 기본 생성자
public class Memo {
    private final String username;
    private String contents;
}
