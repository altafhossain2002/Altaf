class DatabasePipeline extends DataProcessingPipeline {
    @Override
    protected boolean connect(String URL) {
        boolean connected = false;
        System.out.println("Connecting to database...");
        // do something and somehow got connected
        connected = true;
        return connected;
    }

    @Override
    protected boolean transformData() {
        boolean transformed = false;
        System.out.println("Transforming data for database...");
        // do something and somehow got transformed
        transformed = true;
        return transformed;
    }

    @Override
    protected boolean storeData() {
        boolean stored = false;
        System.out.println("Storing data in database...");
        // do something and somehow got stored
        stored = true;
        return stored;
    }
}