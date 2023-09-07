package expert.os.examples;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import expert.os.examples.entity.Person;
import lombok.Data;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchTest {

    @Test
    public void anEntityShouldNotBeAnemic(){
        JavaClasses importedClasses = new ClassFileImporter()
                .importPackages(Person.class.getPackage().getName());


        ArchRule rule = classes().should().notBeAnnotatedWith(Data.class)
                .because("An entity should not be anemic");

        rule.check(importedClasses);
    }
}
