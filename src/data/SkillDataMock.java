package data;

import java.util.Arrays;
import java.util.List;

import enums.SkillTypeEnum;
import model.Skill;

public class SkillDataMock {
	public static List<Skill> getList(){
        return Arrays.asList(
            new Skill("29wr4S", SkillTypeEnum.VOLER, "Compétence pour voler, planer, se déplacer dans les air"),
            new Skill("eGSa3Q", SkillTypeEnum.AGILITE, "Compétence pour esquiver, se battre, se déplacer"),
            new Skill("lJaEJh", SkillTypeEnum.RAPIDITE, "Compétence pour courir, frapper très vite"),
            new Skill("AYxPjk", SkillTypeEnum.INVISIBILITE, "Compétence de camouflage"),
            new Skill("Ye2pVM", SkillTypeEnum.FORCE, "Compétence de puissance de frappe accru")
        );
    }
}
