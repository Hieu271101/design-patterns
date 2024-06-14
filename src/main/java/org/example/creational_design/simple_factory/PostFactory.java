package org.example.creational_design.simple_factory;

public class PostFactory {
  private PostFactory() {
    throw new UnsupportedOperationException("his is utility class and can not be instantiated");
  }

  public static Post createPost(String type) {
    return switch (type) {
      case "blog" -> new BlogPost();
      case "news" -> new NewPost();
      case "product" -> new ProductPost();
      default -> throw new IllegalArgumentException("Post type is unknown");
    };
  }
}
