package expert.os.examples;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import org.junit.jupiter.api.Test;

class ArchitectureTest {

    @Test
    void domainClassesShouldNotDependOnApplicationLayer() {
        String packageName = CreditCard.class.getPackageName();
        JavaClasses importedClasses = new ClassFileImporter().importPackages(packageName);

        ArchRuleDefinition.noClasses()
                .that().resideInAPackage(packageName)
                .should().dependOnClassesThat().resideInAPackage("..application..")
                .check(importedClasses);
    }

}
