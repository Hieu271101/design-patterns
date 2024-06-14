package org.example.creational_design.simple_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleFactoryMain {
  public static void main(String[] args) {
    Post post = PostFactory.createPost("blog");
    log.info("{}", post);
  }
}
