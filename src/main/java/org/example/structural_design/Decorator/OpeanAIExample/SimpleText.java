package org.example.structural_design.Decorator.OpeanAIExample;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SimpleText implements Text{
    private String content;

    @Override
    public String render() {
        return content;
    }
}
