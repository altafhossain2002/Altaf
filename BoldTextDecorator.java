class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text textComponent) {
        super(textComponent);
    }

    public String getDescription() {
        return textComponent.getDescription() + ", bold";
    }
}