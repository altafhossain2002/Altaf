class ItalicTextDecorator extends TextDecorator {
    public ItalicTextDecorator(Text textComponent) {
        super(textComponent);
    }
    public String getDescription() {
        return textComponent.getDescription() + ", italic";
    }
}