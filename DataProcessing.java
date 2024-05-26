public class DataProcessing {
    public static void main(String[] args) {
        DataProcessingPipeline dbPipeline = new DatabasePipeline();
        
        dbPipeline.processData("A random URL");
        DataProcessingPipeline cldPipeline = new CloudPipeline();

        cldPipeline.processData("A random URL");
}
}