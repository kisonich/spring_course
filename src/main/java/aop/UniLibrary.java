package aop;

import org.springframework.stereotype.Component;

@Component // Эту анатацию ищет @ComponentScan, чтоб создать бин
public class UniLibrary extends AbstractLibrary{
//    public UniLibrary() {
//        System.out.println("Bean UniLibrary is created ");
//    }

//    @Override
    public void getBook(){ //*
        // Логика в методе(что делает метод)
        System.out.println("We giving a book from UniLibrary ");
    }
// таргет метод
    public String returnBook(){//**
        System.out.println(" Return a Book to UniLibrary");
        return "War and peace"; //результат метода
    }
    public void getDVD() { //*
        System.out.println("We giving a DVD from UniLibrary");
        System.out.println("========================================");

    }
    public void returnDVD() {//**
        System.out.println(" Return a DVD to UniLibrary");
        System.out.println("========================================");

    }
    public void addBook(String personName,Book book){
        System.out.println("Add new Book to UniLibrary ");
        System.out.println("========================================");

    }
    public void addDVD(){
        System.out.println("Add new DVD to UniLibrary ");
        System.out.println("========================================");

    }
}
// Бизнес логика
// таргет метод - который используется аспектом
