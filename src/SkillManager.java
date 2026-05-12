import java.util.ArrayList;

public class SkillManager {

    public static ArrayList<Skill> skills = new ArrayList<>();

    public static void addSkill(Skill s) {
        skills.add(s);
    }

    public static ArrayList<Skill> getSkills() {
        return skills;
    }
}
