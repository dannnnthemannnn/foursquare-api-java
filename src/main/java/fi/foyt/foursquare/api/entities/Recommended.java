package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Class representing Recommended entity
 * 
 * @see <a href="" target="_blank"></a>
 * 
 * @author Antti Leppä
 */
public class Recommended implements FoursquareEntity {

  private static final long serialVersionUID = -6061498154797516492L;
  
  /**
   * Constructor
   * 
   * @param groups recommendation groups
   * @param warning warning
   */
  public Recommended(RecommendationGroup[] groups, Warning warning) {
    this.groups = groups;
    this.warning = warning;
  }

  /**
   * Returns recommendation groups
   * 
   * @return recommendation groups
   */
  public RecommendationGroup[] getGroups() {
    return groups;
  }
  
  /**
   * Returns warning
   * 
   * @return warning
   */
  public Warning getWarning() {
    return warning;
  }

  private RecommendationGroup[] groups;
  private Warning warning;
}
