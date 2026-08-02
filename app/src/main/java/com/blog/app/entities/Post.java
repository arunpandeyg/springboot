package com.blog.app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    @Column(name = "post-title", length = 100, nullable = false)
    private String title;
    @Column(name = "content", length = 1000, nullable = false)
    private String content;
    @Column(name = "imageName", length = 100, nullable = false)
    private String imageName;
    @Column(name = "addedDate")
    private Date addedDate;

    @ManyToOne
    @JoinColumn(name = "category-id")
    private Category category;
    @ManyToOne
    private  User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Comment> comments = new HashSet<>();


}
