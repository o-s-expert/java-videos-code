package expert.os.videos.demo.infrastructure;

import org.jmolecules.ddd.annotation.Entity;

import java.time.Year;


public record Magazine (String id, String name, int edition, Year year){
}
