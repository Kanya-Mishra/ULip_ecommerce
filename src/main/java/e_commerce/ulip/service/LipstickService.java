package e_commerce.ulip.service;

import e_commerce.ulip.entities.Lipstick;
import e_commerce.ulip.repository.LipstickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LipstickService {
        @Autowired
        public LipstickRepository lipstickrepository;

        @Autowired
        public LipstickService(LipstickRepository lipstickrepository)
        {
            this.lipstickrepository = lipstickrepository;
        }

        public List<Lipstick> getAllLipsticks(){
            System.out.println("Lipsticks: " + lipstickrepository.findAllLipsticks());
            return lipstickrepository.findAllLipsticks();
        }
}
