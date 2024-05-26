abstract class DataProcessingPipeline {
    public final boolean processData(String URL) {
        connect(URL);
        transformData();
        storeData();
        return true;
    }

    protected abstract boolean connect(String URL);

    protected abstract boolean transformData();

    protected abstract boolean storeData();
}