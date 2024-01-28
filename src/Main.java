public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.bossWeapon.setWeaponType(WeaponType.BOMB);
        boss.bossWeapon.setWeaponName("Atom");
        boss.setHealth(570);
        boss.setDamage(99);
        System.out.println("Weapon type: " + boss.bossWeapon.getWeaponType() +
                "\nWeapon name: " + boss.bossWeapon.getWeaponName() +
                "\nHealth: " + boss.getHealth() + "\nDamage:" + boss.getDamage());
    }
}
