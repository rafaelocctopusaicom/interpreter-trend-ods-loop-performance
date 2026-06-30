package br.com.embraer.ahead.interpreter.trend.odsloop.output;
import br.com.embraer.ahead.interpreter.api.output.OutputBuilder;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
public class OdsLoopPerformanceOutputBuilder implements OutputBuilder {
    public static final String TOPIC = "system-trends";
    @Override public String topicName() { return TOPIC; }
    @Override public Dataset<Row> build(Dataset<Row> dataframe) { return dataframe; }
}
