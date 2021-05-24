package com.demo.Model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="test")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testPk;
    private String testTitle;
    private String testContents;

    @Builder
    public Test(Long testPk, String testTitle, String testContents) {
        this.testPk = testPk;
        this.testTitle = testTitle;
        this.testContents = testContents;
    }
}
