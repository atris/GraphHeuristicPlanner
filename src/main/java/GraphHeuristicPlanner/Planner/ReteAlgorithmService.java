package GraphHeuristicPlanner.Planner;

import org.kie.api.KieServices;
import org.kie.api.io.KieResources;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReteAlgorithmService
{
    private KieServices kieServices=KieServices.Factory.get();

    private  KieFileSystem getKieFileSystem() throws IOException{
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        List<String> rules=Arrays.asList("FirstPhaseOptimizer.drl","SecondPhaseOptimizer.drl");
        for(String rule:rules){
            kieFileSystem.write(ResourceFactory.newClassPathResource(rule));
        }
        return kieFileSystem;

    }

    public KieContainer getKieContainer() throws IOException {
        getKieRepository();

        KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
        kb.buildAll();

        KieModule kieModule = kb.getKieModule();
        KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());

        return kContainer;

    }

    private void getKieRepository() {
        final KieRepository kieRepository = kieServices.getRepository();
        kieRepository.addKieModule(new KieModule() {
            public ReleaseId getReleaseId() {
                return kieRepository.getDefaultReleaseId();
            }
        });
    }

    public KieSession getKieSession(){
        getKieRepository();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();

        kieFileSystem.write(ResourceFactory.newClassPathResource("GraphHeuristicPlanner/Planner/FirstPhaseOptimizer.drl"));
        kieFileSystem.write(ResourceFactory.newClassPathResource("GraphHeuristicPlanner/Planner/SecondPhaseOptimizer.drl"));

        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();

        KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());

        return kContainer.newKieSession();

    }
}
