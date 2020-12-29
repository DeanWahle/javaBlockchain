public class Artifact {

    String artId;
    String artName;
    Stakeholder country;
    Stakeholder owner;


    public Artifact(String artId, String name, Stakeholder country, Stakeholder owner) {
        this.artId = artId;
        this.artName = name;
        this.country = country;
        this.owner = owner;
    }

    public String toString() {
        String result =  artId + ", " + artName + ", " + country + ", " + owner;
        return result;
    }

    public String getArtId() {
        return artId;
    }

    public void setArtId(String artId) {
        this.artId = artId;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public Stakeholder getCountry() {
        return country;
    }

    public void setCountry(Stakeholder country) {
        this.country = country;
    }

    public Stakeholder getOwner() {
        return owner;
    }

    public void setOwner(Stakeholder owner) {
        this.owner = owner;
    }
}
