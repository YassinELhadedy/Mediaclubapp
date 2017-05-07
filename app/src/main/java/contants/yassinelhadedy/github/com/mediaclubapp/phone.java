package contants.yassinelhadedy.github.com.mediaclubapp;

/**
 * Created by Elhadedy on 4/24/2017.
 */

public class phone {
    private String name;
    private String Nnumber;
    private int profile;

    public phone() {
    }

    public phone(String name, String nnumber, int profile) {
        this.name = name;
        Nnumber = nnumber;
        this.profile = profile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNnumber(String nnumber) {
        Nnumber = nnumber;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public String getNnumber() {
        return Nnumber;
    }

    public int getProfile() {
        return profile;
    }
}
