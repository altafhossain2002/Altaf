class UnderlineTextDecorator extends TextDecorator {
    public UnderlineTextDecorator(Text textComponent) {
        super(textComponent);
    }

    public String getDescription() {
        return textComponent.getDescription() + ", underline";
    }
}