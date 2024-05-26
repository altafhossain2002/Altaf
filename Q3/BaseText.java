class BaseText implements Text {
    private String text;

    public BaseText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getDescription() {
        return text;
    }
}