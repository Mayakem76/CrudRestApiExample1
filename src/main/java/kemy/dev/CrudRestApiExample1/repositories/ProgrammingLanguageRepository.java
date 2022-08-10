package kemy.dev.CrudRestApiExample1.repositories;

import kemy.dev.CrudRestApiExample1.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource (path = "prog-repo",
                         collectionResourceDescription = @Description("DESCRIPTION IS HERE"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Long> {
}
