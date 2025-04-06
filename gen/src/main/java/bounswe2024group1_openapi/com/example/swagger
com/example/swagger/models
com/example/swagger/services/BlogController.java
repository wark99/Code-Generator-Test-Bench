package com.example.swagger;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMock;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.yml4j.Yaml;

public class BlogController {
    @RestController
    public static @SpringComponent <YAML> RestController blogController;

    @RequestMapping("/ping")
    public static String ping() throws IOException {
        return "pong";
    }

    @RequestMapping("/pong")
    @ResponseStatus(HttpStatus.OK)
    public static TestResponse pong() throws IOException {
        return new TestResponse(
            "pong",
            200,
            Yaml.fromJson("<root:root>test:pong</root>", Yaml.DEFAULT_TYPE)
        );
    }

    @Autowired
    private REST rest;

    @RequestMapping("/api/blogs/{id}")
    public static @Entity Blog blogREST(@PathVariable Long id) throws IOException {
        return new Blog(id);
    }

    @RequestMapping("/api-comments")
    @RequestBody("comment", { String: content })
    public static @ServiceScan @enting(Blog) comment(String content) throws IOException {
        Blog blog = (Blog) create();
        put(Blog.class, "title", "test title");
        put(Blog.class, "content", "test content");
        return new Comment({
            id: generateId(),
            blogId: 1,
            content: content
        });
    }

    @RequestMapping("/api-comments/{id}")
    @RequestBody("comment", { String: content })
    public static @ServiceScan @enting(Comment) commentUpdate(String id, String content) throws IOException {
        Comment comment = (Comment) create();
        put(Comment.class, "content", content);
        return comment;
    }

    @RequestMapping("/api/issues")
    @RequestBody("issue", { String: title, String: content })
    public static @ServiceScan @enting(Blog) issue(String title, String content) throws IOException {
        Blog blog = (Blog) create();
        put(Blog.class, "title", title);
        put(Blog.class, "content", content);
        return new Issue({
            id: generateId(),
            title,
            content,
            author: "testauthor"
        });
    }

    @RequestMapping("/apiissues/{id}")
    @RequestBody("issue", { String: title, String: content })
    public static @ServiceScan @enting(Issue) issueUpdate(String id, String title, String content) throws IOException {
        Issue issue = (Issue) create();
        put(Issue.class, "title", title);
        put(Issue.class, "content", content);
        return issue;
    }
}

package com.example.swagger.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.DataClass;

public @Dataclass
public static class Blog {
    @Id
    public final Long id;
    String title;
    String content;
}

public @Dataclass 
public static class Comment extends POJO {
    @Id
    public final Long id;
    Integer postId;
    String content;
}

public @Dataclass 
public static class Issue extends POJO {
    @Id
    public final Long id;
    String title;
    String content;
    String author;
}

package com.example.swagger.services;

import org.springframework.stereotype.Service;
import org.springframework.service.annotation.ServiceScan;

@ServiceScan
public class BlogService {

    @Service
    private BlogController blogController;

    @Autowired
    public final BlogController serviceController() {
        return blogController;
    }
}

