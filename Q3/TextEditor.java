public class TextEditor {
    public static void main(String[] args) {
        
        Text text = new BaseText("I am a DP");
        System.out.println("Base Text: " + text.getDescription());

        
        text = new BoldTextDecorator(text);
        System.out.println("Bold Text: " + text.getDescription());

        
        text = new ItalicTextDecorator(text);
        System.out.println("Bold Italic Text: " + text.getDescription());

      
        text = new UnderlineTextDecorator(text);
        System.out.println("Bold Italic Underline Text: " + text.getDescription());
    }
}
