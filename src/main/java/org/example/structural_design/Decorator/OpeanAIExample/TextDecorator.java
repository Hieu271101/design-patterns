package org.example.structural_design.Decorator.OpeanAIExample;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class TextDecorator implements Text{
    private Text text;
    @Override
    public String render(){
        return text.render();
    }
}
