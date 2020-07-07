import org.eclipse.jetty.http2.parser.Parser;
import org.apache.solr.response.VelocityResponseWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("This will be printed");

        Parser parser = new Parser(null, null, 0, 0);
        // Method called directly
        parser.init(null);

        // VelocityResponseWriter.write() --> createEngine(SolrQueryRequest request) with CVE-2019-17558
        VelocityResponseWriter vrw = new VelocityResponseWriter();
        vrw.write(null, null, null);
    }
}