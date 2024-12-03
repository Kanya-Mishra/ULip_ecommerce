package e_commerce.ulip.repository;
import e_commerce.ulip.entities.Lipstick;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class LipstickRepository {

    private final List<Lipstick> lipsticks;
//    private static int counter = 101;

    public LipstickRepository() {
        this.lipsticks = new ArrayList<>();
        initLipsticks();
    }

    public void initLipsticks() {
        Lipstick lipstick1 = new Lipstick();
        lipstick1.setId(101L);
        lipstick1.setName("Ruby Red");
        lipstick1.setPrice(45.0);
        lipstick1.setDescription("A classic red lipstick.");
        lipsticks.add(lipstick1);

        Lipstick lipstick2 = new Lipstick();
        lipstick2.setId(102L);
        lipstick2.setName("Plum Pink");
        lipstick2.setPrice(55.0);
        lipstick2.setDescription("A Plum Pink lipstick.");
        lipsticks.add(lipstick2);

        Lipstick lipstick3 = new Lipstick();
        lipstick3.setId(103L);
        lipstick3.setName("Rosy Red");
        lipstick3.setPrice(59.0);
        lipstick3.setDescription("A Rosy Red lipstick.");
        lipsticks.add(lipstick3);
    }

    public List<Lipstick> findAllLipsticks() {
        System.out.println("Retrieving lipsticks: " + lipsticks);
 //       return new ArrayList<>(lipsticks);
        return List.copyOf(lipsticks);
    }


    public Lipstick addLipstick(Lipstick lipstick) {
    //    lipstick.setId((long) counter++);
        lipsticks.add(lipstick);
        return lipstick;
    }
}
