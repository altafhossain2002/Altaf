abstract class TextDecorator implements Text {
    protected Text textComponent;

    public TextDecorator(Text textComponent) {
        this.textComponent = textComponent;
    }

    public String getText() {
        return textComponent.getText();
    }

    public abstract String getDescription();
}