package aop;

import org.springframework.stereotype.Component;

@Component // Эту анатацию ищет @ComponentScan, чтоб создать бин
public class SchoolLibrary extends AbstractLibrary{

//    @Override
    public void getBook() {
        System.out.println("We giving a book from SchoolLibrary");
    }

}
