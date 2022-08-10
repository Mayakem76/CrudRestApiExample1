package kemy.dev.CrudRestApiExample1.entities;
/*

write a Spring Boot application with the necessary dependencies that:
runs on port 5050
uses Rest Repositories HAL Explorer
connects to a local MySQL db
drops the schema at the end of the session
defines a table of programming languages, where each ProgrammingLanguage has:
a primary key
a name not null
a year of firstAppearance that can be null
a column inventor not null
defines a repository for the programming languages, so that it's possible to use HAL Explorer and Postman:
the repository uses a specific path called repo-prog-languages and it has a description
use Postman to:
add 4 specific programming languages to database:
Java
C++
JavaScript
Go
get a list of all the programming languages available in the database, with a pagination of 2 results per page
edit the inventor of one of the programming languages already in the database, entering your name
*/
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String inventor;
    @Column(nullable = false)
    private LocalDate firstAppearance;

    public ProgrammingLanguage(){}

    public ProgrammingLanguage(Long id, String name, String inventor, LocalDate firstAppearance) {
        this.id = id;
        this.name = name;
        this.inventor = inventor;
        this.firstAppearance = firstAppearance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

    public LocalDate getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(LocalDate firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
