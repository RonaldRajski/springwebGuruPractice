package guru.spring.framework.spring5webapp.Bootstrap;

import guru.spring.framework.spring5webapp.Model.Author;
import guru.spring.framework.spring5webapp.Model.Book;
import guru.spring.framework.spring5webapp.Model.Publisher;
import guru.spring.framework.spring5webapp.repositories.AuthorRepository;
import guru.spring.framework.spring5webapp.repositories.BookRepository;
import guru.spring.framework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setAddress("1060 W Addison");
        publisher.setCity("Chicago");
        publisher.setState("IL");
        publisher.setZipcode(78154);

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());


        Publisher marvel = new Publisher();
        marvel.setName("Marvel");
        marvel.setAddress("1060 Broadway");
        marvel.setCity("New York");
        marvel.setState("NY");
        marvel.setZipcode(78222);

        publisherRepository.save(marvel);

        System.out.println("Publisher Count: " + publisherRepository.count());





        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);




        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "1234567");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);


        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);


        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());



    }

}
