package org.example.structural_design.Decorator.OpeanAIExample;

public class CompressedText extends TextDecorator{
    public CompressedText(Text text) {
        super(text);
    }

    @Override
    public String render(){
        return compress(super.render());
    }

    private String compress(String data){
         return data.replaceAll("\\s+", "");
    }
}
