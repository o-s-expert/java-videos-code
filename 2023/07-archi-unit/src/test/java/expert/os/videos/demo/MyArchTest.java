package expert.os.videos.demo;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.jmolecules.ddd.annotation.Entity;
import org.junit.jupiter.api.Test;

public class MyArchTest {

    @Test
    public void shouldNotHaveRecordEntity() {

        JavaClasses importedClasses = new ClassFileImporter()
                .importPackages(MyArchTest.class.getPackageName());

        ArchRule rule = ArchRuleDefinition
                .classes()
                .that().areAnnotatedWith(Entity.class)
                .should().notBeRecords();

        rule.check(importedClasses);
    }

    @Test
    public void shouldNotHaveEntityInfrastructure() {
        JavaClasses importedClasses = new ClassFileImporter()
                .importPackages(MyArchTest.class.getPackageName());


        ArchRule rule = ArchRuleDefinition
                .noClasses()
                .that().areAnnotatedWith(Entity.class)
                .should().resideInAPackage("..infrastructure..");

        rule.check(importedClasses);
    }
}
