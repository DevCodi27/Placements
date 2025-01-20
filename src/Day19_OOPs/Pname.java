package Day19_OOPs;

public class Pname {
    public static String name;
    public static String country;
    public static String skill;
    public Pname(String name,String country,String skill)
    {
        this.name = name;
        this.country = country;
        this.skill = skill;
    }
    public void print()
    {
        System.out.println("Player Details");
        System.out.println("Player Name: "+name);
        System.out.println("Country Name: "+country);
        System.out.println("Skill: "+skill);
    }
}
