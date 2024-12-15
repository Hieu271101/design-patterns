package org.example.structural_design.Decorator.OpeanAIExample;

public class EncryptedText extends TextDecorator{
    public EncryptedText(Text text) {
        super(text);
    }
    @Override
    public String render(){
        return encrypt(super.render());
    }
    public String encrypt(String data){
        return new StringBuilder(data).reverse().toString();
    }
}
