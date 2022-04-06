package data;

import java.util.Arrays;
import java.util.List;

import enums.SkillTypeEnum;
import model.Skill;

public class SkillDataMock {
	public static List<Skill> getList(){
        return Arrays.asList(
            new Skill("29wr4S", SkillTypeEnum.VOLER, "Comp�tence pour voler, planer, se d�placer dans les air"),
            new Skill("eGSa3Q", SkillTypeEnum.AGILITE, "Comp�tence pour esquiver, se battre, se d�placer"),
            new Skill("lJaEJh", SkillTypeEnum.RAPIDITE, "Comp�tence pour courir, frapper tr�s vite"),
            new Skill("AYxPjk", SkillTypeEnum.INVISIBILITE, "Comp�tence de camouflage"),
            new Skill("Ye2pVM", SkillTypeEnum.FORCE, "Comp�tence de puissance de frappe accru")
        );
    }
}
