package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // id бина для TestMain будет название класса
public class Book {
    @Value("Пркступление и накозанее") // не создали properties file а прописали hardcode
    private String name;
    @Value("Ф.М.Достоквский")
    private String author;
    @Value("1866")
    private int tersOfPublic;



    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getTersOfPublic() {
        return tersOfPublic;
    }
}
