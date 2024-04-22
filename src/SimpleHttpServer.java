import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SimpleHttpServer {

    public static void main(String[] args) throws Exception {
        int port = 8000;
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(port), 0);
        server.createContext("/index.html", new StaticFileHandler("index.html")); // Обработчик для index.html
        server.createContext("/submit", new SubmitHandler()); // Обработчик для POST запросов
        server.setExecutor(null); // Используем пул потоков по умолчанию
        server.start();
        System.out.println("Server is running on port " + port);
    }

    static class StaticFileHandler implements HttpHandler {
        private String fileName;

        public StaticFileHandler(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String response = getFileContent(fileName);
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        private String getFileContent(String fileName) throws IOException {
            InputStream in = getClass().getResourceAsStream("/" + fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
            return content.toString();
        }
    }

    static class SubmitHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            if ("POST".equals(exchange.getRequestMethod())) {
                // Обработка POST запроса
                InputStream is = exchange.getRequestBody();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                StringBuilder requestBody = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    requestBody.append(line);
                }
                reader.close();
                // Ваш код обработки POST данных
                String response = "Data received: " + requestBody.toString();
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            } else {
                // Обработка неправильного метода запроса
                exchange.sendResponseHeaders(405, 0);
                exchange.close();
            }
        }
    }
}
