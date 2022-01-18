import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

  private ArrayList <IReviewed> attractions;

    public ThemePark (ArrayList<IReviewed> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return attractions;
    }

    public void visit(Visitor visitor, Attraction attraction) {
        int current = attraction.getVisitCount();
        attraction.setVisitCount(current + 1);
        visitor.addVisitedAttractions(attraction);
    }

}
