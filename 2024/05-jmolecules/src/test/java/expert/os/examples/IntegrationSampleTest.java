package expert.os.examples;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.EvaluationResult;
import org.jmolecules.archunit.JMoleculesArchitectureRules;
import org.jmolecules.archunit.JMoleculesDddRules;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@AnalyzeClasses(packages = "expert.os.examples")
public class IntegrationSampleTest {

    @ArchTest
    private ArchRule dddRules = JMoleculesDddRules.all();
    @ArchTest
    private ArchRule layering = JMoleculesArchitectureRules.ensureLayering();

    @ArchTest
    void detectsViolations(JavaClasses classes) {

        EvaluationResult result = JMoleculesDddRules.all().evaluate(classes);
        assertThat(result.hasViolation()).isFalse();
    }
}
